package br.fosge.editor.dialog;

import br.fosge.Logger;
import br.fosge.annotation.Lifecycle;
import br.fosge.editor.ui.SwingTools;
import br.fosge.editor.ui.UIComponent;
import br.fosge.editor.ui.UIContainer;
import br.fosge.editor.ui.UIControl;
import br.fosge.editor.ui.component.JImagePanel;
import br.fosge.editor.ui.component.RadioButtonSpec;
import br.fosge.graphics.Rectangle;

import javax.swing.*;
import java.awt.*;

public class ProjectBrowseDialog extends JFrame implements Lifecycle {

    @Override
    public boolean initialize() {
        try {
            setTitle("FOSGE :: Project Browse");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(800, 600);
            setResizable(false);

            setLayout(new BorderLayout());
            add(createPanelActionTypes(), BorderLayout.NORTH);
            add(createPanelActions(), BorderLayout.CENTER);

            return true;
        } catch (Throwable throwable) {
            Logger.error("Failed to initialize form: %s", throwable);
            return false;
        }
    }

    private JPanel createPanelActionTypes() {
        final var panel = UIContainer.flow();

        final var lblOpenProject = UIComponent.label("Open Project", new Rectangle(20, 40));
        SwingTools.onMouseHover(lblOpenProject, Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(lblOpenProject);

        panel.add(Box.createHorizontalStrut(80));

        final var lblCreateProject = UIComponent.label("Create Project", new Rectangle(20, 40));
        SwingTools.onMouseHover(lblCreateProject, Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(lblCreateProject);

        return panel;
    }

    private JPanel createPanelActions() {
        final var layout = new CardLayout();
        final var panel = UIContainer.card(layout);

        panel.add(createPanelOpenProject(), "OpenProject");
        panel.add(createPanelCreateProject(), "CreateProject");

        layout.show(panel, "CreateProject");

        return panel;
    }

    private JPanel createPanelOpenProject() {
        final var thisPanel = UIContainer.border();

        return thisPanel;
    }

    private JPanel createPanelCreateProject() {
        final var panel = UIContainer.border();
        SwingTools.emptyBorder(panel, new Rectangle(10, 10));

        panel.add(newCreateProjectControls(), BorderLayout.CENTER);
        panel.add(newCreateProjectActions(), BorderLayout.SOUTH);

        return panel;
    }

    private JPanel newCreateProjectControls() {
        final var panel = UIContainer.box(BoxLayout.Y_AXIS);
        panel.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
        // ###################################
        // Project Data
        // ###################################
        final var constraints = new GridBagConstraints();
        final var pnlProjectData = UIContainer.girdBag();
        panel.add(pnlProjectData);

        constraints.gridy = 0;
        constraints.gridx = 0;
        pnlProjectData.add(UIComponent.label("     Name: "), constraints);
        constraints.gridx = 1;
        pnlProjectData.add(UIControl.textField(20), constraints);

        constraints.gridy++;
        constraints.gridx = 0;
        pnlProjectData.add(UIComponent.label("Directory: "), constraints);
        constraints.gridx = 1;
        pnlProjectData.add(UIControl.textField(20), constraints);
        // ###################################
        // Project Types
        // ###################################
        final var pnlProjectType = UIContainer.box(BoxLayout.X_AXIS);
        panel.add(pnlProjectType);

        final var pnlProjectTypes = UIContainer.box(BoxLayout.Y_AXIS);
        pnlProjectTypes.setBackground(Color.PINK);
        SwingTools.emptyBorder(pnlProjectTypes, new Rectangle(40, 60));
        final var group = new ButtonGroup();

        UIControl
                .radioButton(
                        new RadioButtonSpec(group, "Empty"),
                        new RadioButtonSpec(group, "1st Person"),
                        new RadioButtonSpec(group, "3rd Person"))
                .forEach(pnlProjectTypes::add);
        pnlProjectType.add(pnlProjectTypes);
        // ###################################
        // Project Image
        // ###################################
        final var pnlProjectImage = UIContainer.flow();
        SwingTools.emptyBorder(pnlProjectImage, new Rectangle(40, 20));
        pnlProjectImage.add(new JImagePanel(null));
        pnlProjectImage.setBackground(Color.BLACK);
        pnlProjectType.add(pnlProjectImage);

        return panel;
    }

    private JPanel newCreateProjectActions() {
        final var panel = UIContainer.flow(5, 40);
        panel.add(UIControl.button("Create"));
        panel.add(Box.createHorizontalStrut(80));
        panel.add(UIControl.button("Cancel"));

        return panel;
    }

    @Override
    public boolean terminate() {
        try {
            return true;
        } catch (Throwable throwable) {
            Logger.error("Failed to terminate form: %s", throwable);
            return false;
        }
    }
}
