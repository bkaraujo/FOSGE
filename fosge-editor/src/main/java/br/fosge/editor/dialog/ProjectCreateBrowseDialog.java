package br.fosge.editor.dialog;

import br.fosge.Logger;
import br.fosge.Triplet;
import br.fosge.editor.command.CreateProjectCommand;
import br.fosge.editor.command.OpenWindowCommand;
import br.fosge.editor.ui.*;
import br.fosge.editor.ui.component.DocumentAdapter;
import br.fosge.editor.ui.component.JImagePanel;
import br.fosge.editor.ui.component.RadioButtonSpec;
import br.fosge.graphics.Rectangle;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProjectCreateBrowseDialog extends FPanel {

    private final JFrame window;
    private JTextField txtName;
    private JTextField txtDirectory;
    private ButtonGroup groupProjectType;

    private Border txtNameBorder;
    private Border txtDirectoryBorder;

    public ProjectCreateBrowseDialog(JFrame window) {
        this.window = window;
        setLayout(new BorderLayout());
        SwingTools.emptyBorder(this, new Rectangle(10, 10));

        add(newCreateProjectControls(), BorderLayout.CENTER);
        add(newCreateProjectActions(), BorderLayout.SOUTH);
        reset();
    }

    private JPanel newCreateProjectControls() {
        final var panel = UIContainer.border();
        // ###################################
        // Project Data
        // ###################################
        final var constraints = new GridBagConstraints();

        final var pnlProjectData = UIContainer.girdBag();
        SwingTools.emptyBorder(pnlProjectData, new br.fosge.graphics.Rectangle(10, 0));
        panel.add(pnlProjectData, BorderLayout.NORTH);

        UIContainer.gridBagXYWH(constraints, 0, 0, 1, 1);
        UIContainer.gridBagWXWY(constraints, (constraints.gridx == 0) ? 0.1 : 1.0, 1.0);
        UIContainer.gridBagAF(constraints,
                (constraints.gridx == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST,
                (constraints.gridy == 0) ? GridBagConstraints.BOTH : GridBagConstraints.HORIZONTAL
        );
        pnlProjectData.add(UIComponent.label("Name: "), constraints);

        UIContainer.gridBagXYWH(constraints, 1, 0, 2, 1);
        UIContainer.gridBagWXWY(constraints, (constraints.gridx == 0) ? 0.1 : 1.0, 1.0);
        UIContainer.gridBagAF(constraints,
                (constraints.gridx == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST,
                (constraints.gridy == 0) ? GridBagConstraints.BOTH : GridBagConstraints.HORIZONTAL
        );
        txtName = UIControl.textField(20, new DocumentAdapter() {
            private final JTextComponent component = txtName;
            private Border border;

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (border == null) { border = component.getBorder(); }

                if (!component.getText().trim().isEmpty()) {
                    if (component.getBorder() != border) {
                        component.setBorder(border);
                    }
                }
            }
        });
        txtNameBorder = txtName.getBorder();
        pnlProjectData.add(txtName, constraints);

        UIContainer.gridBagXYWH(constraints, 0, 1, 1, 1);
        UIContainer.gridBagWXWY(constraints, (constraints.gridx == 0) ? 0.1 : 1.0, 1.0);
        UIContainer.gridBagAF(constraints,
                (constraints.gridx == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST,
                (constraints.gridy == 0) ? GridBagConstraints.BOTH : GridBagConstraints.HORIZONTAL
        );
        pnlProjectData.add(UIComponent.label("Directory: "), constraints);

        UIContainer.gridBagXYWH(constraints, 1, 1, 1, 1);
        UIContainer.gridBagWXWY(constraints, (constraints.gridx == 0) ? 0.1 : 1.0, 1.0);
        UIContainer.gridBagAF(constraints,
                (constraints.gridx == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST,
                (constraints.gridy == 0) ? GridBagConstraints.BOTH : GridBagConstraints.HORIZONTAL
        );
        txtDirectory = UIControl.textField(new DocumentAdapter() {
            private final JTextComponent component = txtDirectory;
            private Border border;

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (border == null) { border = component.getBorder(); }
                if (!component.getText().trim().isEmpty()) {
                    if (component.getBorder() != border) {
                        component.setBorder(border);
                    }
                }
            }
        });
        txtDirectory.setEditable(false);
        txtDirectoryBorder = txtDirectory.getBorder();
        pnlProjectData.add(txtDirectory, constraints);

        UIContainer.gridBagXYWH(constraints, 2, 1, 1, 1);
        UIContainer.gridBagWXWY(constraints, (constraints.gridx == 0) ? 0.1 : 1.0, 1.0);
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
        SwingTools.emptyBorder(pnlProjectTypes, new br.fosge.graphics.Rectangle(0, 60, 40, 40));
        groupProjectType = new ButtonGroup();

        UIControl
                .radioButton(
                        new RadioButtonSpec(groupProjectType, "Empty"),
                        new RadioButtonSpec(groupProjectType, "1st Person"),
                        new RadioButtonSpec(groupProjectType, "3rd Person"))
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

    public void reset() {
        txtName.setText("");
        txtName.setBorder(txtNameBorder);

        txtDirectory.setText("");
        txtDirectory.setBorder(txtDirectoryBorder);

        UIControl.clear(groupProjectType);
    }

    @Override
    public List<Triplet<?>> values() {
        final var values = new ArrayList<Triplet<?>>();

        values.add(new Triplet<>("name", String.class, txtName.getText()));
        values.add(new Triplet<>("path", String.class, txtDirectory.getText()));
        final var radioButton = UIControl.radioButton(groupProjectType);
        if (radioButton != null) { values.add(new Triplet<>("type", String.class, radioButton.getName())); }

        return values;
    }

    private JPanel newCreateProjectActions() {
        final var panel = UIContainer.flow(5, 40);
        panel.add(UIControl.button("Create", (ActionListener) _ -> {
            boolean valid = true;
            txtName.setBorder(txtNameBorder);
            txtDirectory.setBorder(txtDirectoryBorder);

            final var projectName = txtName.getText();
            if (projectName == null || projectName.isEmpty()) {
                Logger.warn("Project Name not defined");
                if (txtName.getBorder() == txtNameBorder) {
                    txtName.setBorder(UIControl.errorBorder());
                }

                valid = false;
            }

            final var projectDirectory = txtDirectory.getText();
            if (projectDirectory == null || projectDirectory.isEmpty()) {
                Logger.warn("Project Directory not defined");
                if (txtDirectory.getBorder() == txtDirectoryBorder) {
                    txtDirectory.setBorder(UIControl.errorBorder());
                }

                valid = false;
            }

            final var radioButton = UIControl.radioButton(groupProjectType);
            if (radioButton == null) {
                Logger.warn("No Project Type Selected");
                valid = false;
            }

            if (!valid) {
                return;
            }

            if (!new CreateProjectCommand().execute(values())) {
                reset();
            }

            if (!new OpenWindowCommand().execute(List.of(
                    new Triplet<>("frame", JFrame.class, Forms.editor()),
                    new Triplet<>("path", Path.class, Path.of(txtDirectory.getText(), txtName.getText()))
            ))) {
                JOptionPane.showMessageDialog(
                        null,
                        "Failed to open project window",
                        "FOSGE :: error",
                        JOptionPane.ERROR_MESSAGE
                );
            }

            window.dispose();
        }));

        panel.add(Box.createHorizontalStrut(80));
        panel.add(UIControl.button("Cancel", (ActionListener) _ -> reset()));

        return panel;
    }
}
