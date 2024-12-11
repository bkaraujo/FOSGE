package br.fosge.editor.forms;

import br.fosge.editor.ui.UIContainers;
import br.fosge.editor.ui.component.FGFrame;
import br.fosge.editor.ui.component.FGImagePanel;
import br.fosge.editor.ui.component.FGPanel;
import br.fosge.editor.ui.listener.CursorHoverListener;
import br.fosge.tools.Meta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;

public final class BrowseFrame extends FGFrame {
    private final SouthPanel south ;
    private final CenterPanel center;
    private final NorthPanel north;

    public BrowseFrame() {
        south = new SouthPanel();
        center = new CenterPanel(south);
        north = new NorthPanel(center, south);
    }

    @Override
    public boolean initialize() {
        setTitle("FOSGE :: Project Browser");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // ##################################################################
        //
        // ##################################################################
        setLayout(new BorderLayout());
        // ##################################################################
        //
        // ##################################################################

        south.btnAction.setText("Create");
        south.btnAction.setPreferredSize(south.buttonSize);
        south.btnCancel.setPreferredSize(south.buttonSize);

        add(south, BorderLayout.SOUTH);
        add(center, BorderLayout.CENTER);
        add(north, BorderLayout.NORTH);

        if (!super.initialize()) {
            return false;
        }

        center.showCreateProject();
        return true;
    }

    @Override
    public boolean submit(Map<String, ?> values) {
        return false;
    }

    private static final class NorthPanel extends FGPanel {
        public final JLabel lblOpenProject = new JLabel("Open Project");
        public final JLabel lblCreateProject = new JLabel("Create Project");

        private final CenterPanel center;
        private final SouthPanel south;

        public NorthPanel(CenterPanel center, SouthPanel south) {
            this.center = center;
            this.south = south;
        }

        @Override
        public boolean initialize() {

            lblOpenProject.setOpaque(true);
            lblOpenProject.setBackground(Color.BLUE);
            lblOpenProject.setBorder(BorderFactory.createEmptyBorder(50, 75, 50, 75));
            lblOpenProject.addMouseListener(new CursorHoverListener(Cursor.HAND_CURSOR));
            lblOpenProject.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    south.btnAction.setText(" Open ");
                    south.btnAction.setPreferredSize(south.buttonSize);
                    center.showOpenProject();
                }
            });

            add(lblOpenProject);

            add(Box.createHorizontalStrut(25));

            lblCreateProject.setOpaque(true);
            lblCreateProject.setBackground(Color.PINK);
            lblCreateProject.setBorder(BorderFactory.createEmptyBorder(50, 75, 50, 75));
            lblCreateProject.addMouseListener(new CursorHoverListener(Cursor.HAND_CURSOR));
            lblCreateProject.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    south.btnAction.setText("Create");
                    south.btnAction.setPreferredSize(south.buttonSize);
                    center.showCreateProject();
                }
            });

            add(lblCreateProject);
            return true;
        }
    }

    private static final class CenterPanel extends FGPanel {
        private final CardLayout cards = new CardLayout();
        private final OpenProjectPanel pnlOpenProject;
        private final CreateProjectPanel pnlCreateProject;

        public CenterPanel(SouthPanel south) {
            pnlOpenProject = new OpenProjectPanel(south);
            pnlCreateProject = new CreateProjectPanel(south);
        }

        @Override
        public boolean initialize() {
            setLayout(cards);
            setBackground(Color.blue);
            add(pnlOpenProject, Meta.fqn(pnlOpenProject));
            add(pnlCreateProject, Meta.fqn(pnlCreateProject));

            return true;
        }

        public void showCreateProject() {
            reset();

            pnlOpenProject.visible = false;
            pnlCreateProject.visible = true;
            cards.show(this, Meta.fqn(pnlCreateProject));
        }

        public void showOpenProject() {
            reset();

            pnlOpenProject.visible = true;
            pnlCreateProject.visible = false;
            cards.show(this, Meta.fqn(pnlOpenProject));
        }

        @Override
        public void reset() {
            if (pnlOpenProject.visible) pnlOpenProject.reset();
            if (pnlCreateProject.visible) pnlCreateProject.reset();
        }

        private static final class OpenProjectPanel extends FGPanel {
            public boolean visible;

            private final SouthPanel south;
            public OpenProjectPanel(SouthPanel south) {
                this.south = south;
            }
        }

        private static final class CreateProjectPanel extends FGPanel {
            public boolean visible;
            private final SouthPanel south;
            private final ButtonGroup buttonGroup = new ButtonGroup();

            public CreateProjectPanel(SouthPanel south) {
                this.south = south;
            }

            @Override
            public boolean initialize() {
                setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
                setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
                // ######################################################
                // Project Types Panel
                // ######################################################
                final var pnlProjectTypes = UIContainers.boxVertical(); {
                    add(pnlProjectTypes);

                    final var rbtEmpty = new JRadioButton("Empty");
                    buttonGroup.add(rbtEmpty);
                    pnlProjectTypes.add(rbtEmpty);
                    final var rbt1stPerson = new JRadioButton("1st Person");
                    buttonGroup.add(rbt1stPerson);
                    pnlProjectTypes.add(rbt1stPerson);
                    final var rbt3rdPerson = new JRadioButton("3st Person");
                    buttonGroup.add(rbt3rdPerson);
                    pnlProjectTypes.add(rbt3rdPerson);
                    final var rbtIsometric = new JRadioButton("Isometric");
                    buttonGroup.add(rbtIsometric);
                    pnlProjectTypes.add(rbtIsometric);

                    final var elements = buttonGroup.getElements();
                    while (elements.hasMoreElements()) {
                        elements
                                .nextElement()
                                .addMouseListener(new CursorHoverListener(Cursor.HAND_CURSOR));
                    }
                }
                // ######################################################
                // Project Type Image Panel
                // ######################################################
                final var pnlProjectImage = new FGImagePanel(); {
                    add(pnlProjectImage);
                }
                // ######################################################
                // Form Buttons
                // ######################################################
                south.btnCancel.addActionListener((_) -> {
                    if (!visible) return;
                    reset();
                });
                return true;
            }

            @Override
            public void reset() {
                buttonGroup.clearSelection();
            }
        }
    }

    private static final class SouthPanel extends FGPanel {
        public final JButton btnAction = new JButton("......");
        public final JButton btnCancel = new JButton("Cancel");
        public final Dimension buttonSize = new Dimension(120, 30);

        @Override
        public boolean initialize() {
            setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

            add(btnAction);
            add(Box.createHorizontalStrut(40));
            add(btnCancel);

            return true;
        }
    }
}
