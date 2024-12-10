package br.fosge.editor.forms;

import br.fosge.editor.ui.component.FGFrame;
import br.fosge.editor.ui.component.FGGradientSpec;
import br.fosge.editor.ui.component.FGImagePanel;
import br.fosge.editor.ui.component.FGPanel;
import br.fosge.editor.ui.UIContainers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;

public final class BrowseFrame extends FGFrame {

    private final JButton btnAction = new JButton("      ");
    private final JButton bntCancel = new JButton("Cancel");

    @Override
    public boolean initialize() {
        setTitle("FOSGE :: Project Browser");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // ##################################################################
        //
        // ##################################################################
        final var content = new FGPanel(new BorderLayout());
        setContentPane(content);
        // ##################################################################
        //
        // ##################################################################
        final var pnlNorth = UIContainers.boxHorizontal();
        {
//        pnlNorth.setBackground(Color.BLUE);
            pnlNorth.setBorder(BorderFactory.createEmptyBorder(50, 250, 50, 0));
            content.add(pnlNorth, BorderLayout.NORTH);
            final var lblOpen = new JLabel("Open Project");
            lblOpen.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnAction.setText(" Open ");
                }
            });
            pnlNorth.add(lblOpen);
            pnlNorth.add(Box.createHorizontalStrut(100));
            final var lblCreate = new JLabel("Create Project");
            lblCreate.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnAction.setText("Create");
                }
            });
            pnlNorth.add(lblCreate);
        }
        // ##################################################################
        //
        // ##################################################################
        final var cards = new CardLayout();
        final var pnlCenter = new FGPanel(cards);
        {
            pnlCenter.setBackground(Color.blue);
            content.add(pnlCenter, BorderLayout.CENTER);
            // ##################################################################
            //
            // ##################################################################
            final var openProjectPanel = new FGPanel(new BorderLayout());
            {
                pnlCenter.add(openProjectPanel, "open");
            }
            // ##################################################################
            //
            // ##################################################################
            final var createProjectPanel = UIContainers.boxHorizontal();
            {
                createProjectPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
//        createProjectPanel.gradient(new FGGradientSpec(Color.BLUE, 10f, 30f, Color.BLACK));
                pnlCenter.add(createProjectPanel, "create");

                final var pnlProjectTypes = UIContainers.boxVertical();
                {
                    createProjectPanel.add(pnlProjectTypes);
                    final var buttonGroup = new ButtonGroup();

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
                }

                final var pnlProjectImage = new FGImagePanel();
                {
                    createProjectPanel.add(pnlProjectImage);
                }
            }

            cards.show(pnlCenter, "create");
        }
        // ##################################################################
        //
        // ##################################################################
        final var pnlSouth = UIContainers.boxHorizontal();
        {
            content.add(pnlSouth, BorderLayout.SOUTH);
            pnlSouth.setBorder(BorderFactory.createEmptyBorder(50, 250, 50, 0));
            pnlSouth.add(btnAction);
            pnlNorth.add(Box.createHorizontalGlue());
            pnlSouth.add(bntCancel);
        }

        return true;
    }

    @Override
    public void reset() {

    }

    @Override
    public boolean submit(Map<String, ?> values) {
        return false;
    }

}
