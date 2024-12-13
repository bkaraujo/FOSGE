package br.fosge.editor.forms;

import br.fosge.editor.ui.Fonts;
import br.fosge.editor.ui.component.FGButtonGroup;
import br.fosge.editor.ui.component.FGFrame;
import br.fosge.editor.ui.component.FGImagePanel;
import br.fosge.editor.ui.component.FGPanel;
import br.fosge.editor.ui.listener.CursorHoverListener;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Map;

public final class BrowseFrame extends FGFrame {

    private final JButton btnAction = new JButton("Action");
    private final JButton btnCancel = new JButton("Cancel");

    private final JTextField txtProjectName = new JTextField();
    private final JTextField txtProjectPath = new JTextField();

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
                    btnAction.setText(" Open ");
                    cards.show(pnlCenter, "open");
                }
            });

            final var lblCreateProject = north.add(JLabel.class, new JLabel("Create Project"));
            lblCreateProject.setFont(lblOpenProject.getFont());
            lblCreateProject.addMouseListener(new CursorHoverListener(Cursor.HAND_CURSOR));
            lblCreateProject.setBorder(BorderFactory.createEmptyBorder(25, 50, 25, 50));
            lblCreateProject.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    btnAction.setText("Create");
                    cards.show(pnlCenter, "create");
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

            final var pnlOpenProject = FGPanel.mig("fillx, insets 50", "[][][]", "[][][][]"); {
                pnlCenter.add(pnlOpenProject, "open");

            }

            final var pnlCreateProject = FGPanel.mig("fillx, insets 20 50 20 50", "[grow]"); {
                pnlCenter.add(pnlCreateProject, "create");

                pnlCreateProject.add(JLabel.class, new JLabel("Project name: "), "width 100, split");
                 pnlCreateProject.add(JTextField.class, txtProjectName, "growx, wrap");

                pnlCreateProject.add(JLabel.class, new JLabel("Project Folder: "), "width 100, split");
                pnlCreateProject.add(JTextField.class, txtProjectPath, "growx");
                final var btnProjectFolder = pnlCreateProject.add(JButton.class, new JButton("..."), "align right, wrap");
                btnProjectFolder.addActionListener((_) -> {
                    final var chooser = new JFileChooser();
                    chooser.setDialogTitle("Select Project Folder");
                    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    chooser.setAcceptAllFileFilterUsed(false);
                    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                        txtProjectPath.setText(chooser.getSelectedFile().getAbsolutePath());
                    }
                });

                pnlCreateProject.add(Box.createVerticalStrut(60), "wrap");

                final var buttonGroup = new FGButtonGroup();
                final var pnlProjectTypes = pnlCreateProject.add(FGPanel.class, FGPanel.mig("fill", "[]"), "width 100, split"); {
                    pnlProjectTypes.add(Box.createVerticalStrut(100), "wrap");
                    for (final var option : new String[] {"Empty", "1st Person", "3rd Person", "Isometric"}) {
                        final var button = buttonGroup.add(JRadioButton.class, new JRadioButton(option));
                        button.addMouseListener(new CursorHoverListener(Cursor.HAND_CURSOR));
                        pnlProjectTypes.add(button, "wrap");
                    }
                    pnlProjectTypes.add(Box.createVerticalStrut(100));
                }

                pnlCreateProject.add(new FGImagePanel(), "grow, wrap");
                pnlCreateProject.add(Box.createVerticalStrut(60), "wrap");
            }
        }
        // #################################################################################
        //
        //
        //
        // #################################################################################
        final var south = FGPanel.mig("align 50% 50%, insets 25 0 25 0", "[] 25 []", "[]"); {
            content.add(south, "dock south");
            south.add(btnAction);
            btnAction.addActionListener((_) -> {
                if (btnAction.getText().contains("Create")) {
                    cards.show(pnlCenter, "create");
                }

                if (btnAction.getText().contains("Open")) {
                    cards.show(pnlCenter, "open");
                }
            });

            south.add(btnCancel);
            btnCancel.addActionListener((_) -> {
                BrowseFrame.this.setVisible(false);
                BrowseFrame.this.dispose();
            });
        }

        return true;
    }

    @Override
    public boolean submit(Map<String, ?> values) {
        return false;
    }

}
