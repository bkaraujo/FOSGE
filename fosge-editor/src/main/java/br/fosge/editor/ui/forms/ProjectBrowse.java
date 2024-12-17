package br.fosge.editor.ui.forms;

import br.fosge.editor.ui.actions.CreateProjectAction;
import br.fosge.editor.ui.actions.NoopAction;
import br.fosge.editor.ui.framework.Fonts;
import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.editor.ui.framework.component.FGPanel;
import br.fosge.editor.ui.framework.listener.CursorHoverListener;
import br.fosge.tools.Meta;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;

public final class ProjectBrowse extends FGFrame {

    private final JButton btnAction = new JButton("Action");
    private final JButton btnCancel = new JButton("Cancel");
    private final FGPanel pnlOpenProject = new ProjectBrowseOpenPanel(this);
    private final FGPanel pnlCreateProject = new ProjectBrowseCreatePanel(this);
    private FGPanel panel;

    @Override
    public boolean initialize() {
        setTitle("FOSGE :: Project Browser");
        setSize(1024, 768);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        final var content = getContentPane();
        content.setLayout(new MigLayout("fill","[][grow][]", "[]"));

        btnAction.setFont(Fonts.fontDroidSerifRegular(13));
        btnCancel.setFont(btnAction.getFont());

        final var cards = new CardLayout();
        final var pnlCenter = FGPanel.mig("align 50% 50%", "[]", "[]");
        // #################################################################################
        //
        //
        //
        // #################################################################################
        final var north = FGPanel.mig("align 50% 50%, ", "[center] 25 [center]", "[]"); {
            content.add(north, "dock north");

            final var lblOpenProject = north.add(JLabel.class, new JLabel("Open Project"));
            lblOpenProject.setFont(Fonts.fontDroidSerifRegular(20));
            lblOpenProject.addMouseListener(new CursorHoverListener(Cursor.HAND_CURSOR));
            lblOpenProject.setBorder(BorderFactory.createEmptyBorder(25, 50, 25, 50));
            lblOpenProject.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    btnAction.addActionListener(new NoopAction(ProjectBrowse.this));
                    btnAction.setText(ProjectBrowseOpenPanel.ACTION);
                    cards.show(pnlCenter, Meta.fqn(pnlOpenProject));
                    panel = pnlOpenProject;
                }
            });

            final var lblCreateProject = north.add(JLabel.class, new JLabel("Create Project"));
            lblCreateProject.setFont(lblOpenProject.getFont());
            lblCreateProject.addMouseListener(new CursorHoverListener(Cursor.HAND_CURSOR));
            lblCreateProject.setBorder(BorderFactory.createEmptyBorder(25, 50, 25, 50));
            lblCreateProject.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    btnAction.addActionListener(new CreateProjectAction(ProjectBrowse.this));
                    btnAction.setText(ProjectBrowseCreatePanel.ACTION);
                    cards.show(pnlCenter, Meta.fqn(pnlCreateProject));
                    panel = pnlCreateProject;
                }
            });
        }
        // #################################################################################
        //
        //
        //
        // #################################################################################
        pnlCenter.setLayout(cards); {
            content.add(pnlCenter, "dock north");
            pnlCenter.add(pnlOpenProject, Meta.fqn(pnlOpenProject));
            pnlCenter.add(pnlCreateProject, Meta.fqn(pnlCreateProject));
        }
        // #################################################################################
        //
        //
        //
        // #################################################################################
        final var south = FGPanel.mig("align 50% 50%, insets 25 0 25 0", "[] 25 []", "[]"); {
            content.add(south, "dock south");
            south.add(btnAction);
            south.add(btnCancel);
            btnCancel.addActionListener((_) -> {
                ProjectBrowse.this.setVisible(false);
                ProjectBrowse.this.dispose();
            });
        }

        return true;
    }

    @Override
    public Map<String, ?> values() {
        return panel.values();
    }

    @Override
    public void reset() {
        panel.reset();
    }
}
