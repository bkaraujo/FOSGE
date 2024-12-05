package br.fosge.editor.dialog;

import br.fosge.editor.ui.SwingTools;
import br.fosge.editor.ui.UIComponent;
import br.fosge.editor.ui.UIContainer;
import br.fosge.editor.ui.UIControl;
import br.fosge.editor.ui.component.JImagePanel;
import br.fosge.editor.ui.component.RadioButtonSpec;
import br.fosge.graphics.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ProjectCreateBrowseDialog extends JPanel {

    public ProjectCreateBrowseDialog() {
        setLayout(new BorderLayout());
        SwingTools.emptyBorder(this, new Rectangle(10, 10));

        add(newCreateProjectControls(), BorderLayout.CENTER);
        add(newCreateProjectActions(), BorderLayout.SOUTH);
    }


    private JPanel newCreateProjectControls() {
        final var panel = UIContainer.border();
//        panel.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
        // ###################################
        // Project Data
        // ###################################
        final var constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        //constraints.insets = (constraints.gridx == 0) ? WEST_INSETS : EAST_INSETS;
        constraints.weighty = 1.0;

        final var pnlProjectData = UIContainer.girdBag();
        SwingTools.emptyBorder(pnlProjectData, new br.fosge.graphics.Rectangle(10, 0));
        panel.add(pnlProjectData, BorderLayout.NORTH);

        constraints.weightx = (constraints.gridx == 0) ? 0.1 : 1.0;
        constraints.anchor = (constraints.gridx == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST;
        constraints.fill = (constraints.gridy == 0) ? GridBagConstraints.BOTH : GridBagConstraints.HORIZONTAL;
        pnlProjectData.add(UIComponent.label("     Name: "), constraints);

        constraints.gridx = 1;
        constraints.gridwidth = 2;
        constraints.weightx = (constraints.gridx == 0) ? 0.1 : 1.0;
        constraints.anchor = (constraints.gridx == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST;
        constraints.fill = (constraints.gridy == 0) ? GridBagConstraints.BOTH : GridBagConstraints.HORIZONTAL;
        pnlProjectData.add(UIControl.textField(20), constraints);

        constraints.gridy++;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        constraints.weightx = (constraints.gridx == 0) ? 0.1 : 1.0;
        constraints.anchor = (constraints.gridx == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST;
        constraints.fill = (constraints.gridy == 0) ? GridBagConstraints.BOTH : GridBagConstraints.HORIZONTAL;
        pnlProjectData.add(UIComponent.label("Directory: "), constraints);

        constraints.gridx = 1;
        constraints.weightx = (constraints.gridx == 0) ? 0.1 : 1.0;
        constraints.anchor = (constraints.gridx == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST;
        constraints.fill = (constraints.gridy == 0) ? GridBagConstraints.BOTH : GridBagConstraints.HORIZONTAL;
        final var txtDirectory = UIControl.textField();
        txtDirectory.setEditable(false);
        pnlProjectData.add(txtDirectory, constraints);

        constraints.gridx = 2;
        constraints.weightx = (constraints.gridx == 0) ? 0.1 : 1.0;
        constraints.anchor = (constraints.gridx == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST;
        constraints.fill = (constraints.gridy == 0) ? GridBagConstraints.BOTH : GridBagConstraints.HORIZONTAL;
        pnlProjectData.add(UIControl.button("...", (ActionListener) _ -> {
            txtDirectory.setText(UIControl.chooseDirectory(this));
        }), constraints);
        // ###################################
        // Project Types
        // ###################################
        final var pnlProjectType = UIContainer.box(BoxLayout.X_AXIS);
        panel.add(pnlProjectType, BorderLayout.CENTER);

        final var pnlProjectTypes = UIContainer.box(BoxLayout.Y_AXIS);
//        pnlProjectTypes.setBackground(Color.PINK);
        SwingTools.emptyBorder(pnlProjectTypes, new br.fosge.graphics.Rectangle(0, 60, 40, 40));
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
}
