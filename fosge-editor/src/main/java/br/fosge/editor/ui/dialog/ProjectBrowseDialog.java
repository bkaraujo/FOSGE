package br.fosge.editor.ui.dialog;

import br.fosge.Logger;
import br.fosge.annotation.Lifecycle;
import br.fosge.editor.ui.Components;
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
            createPanelActionTypes();
            createPanelActions();

            return true;
        } catch (Throwable throwable) {
            Logger.error("Failed to initialize form: %s", throwable);
            return false;
        }
    }

    private void createPanelActionTypes() {
        final var pnlActionTypes = new JPanel();
        pnlActionTypes.setLayout(new FlowLayout(FlowLayout.CENTER));

        final var lblOpenProject = Components.label("Open Project", new Rectangle(40, 60));
        lblOpenProject.setBackground(Color.MAGENTA);
        lblOpenProject.setFont(Components.fontDroidSerifRegular(20));
        lblOpenProject.setOpaque(true);
        pnlActionTypes.add(lblOpenProject);

        final var lblCreateProject = Components.label("Create Project", new Rectangle(40, 60));
        lblCreateProject.setBackground(Color.PINK);
        lblCreateProject.setOpaque(true);
        lblCreateProject.setFont(Components.fontDroidSerifRegular(20));
        pnlActionTypes.add(lblCreateProject);
        add(pnlActionTypes, BorderLayout.NORTH);
    }

    private void createPanelActions() {
        final var layout = new CardLayout();
        final var pnlActionPanel = new JPanel();
        pnlActionPanel.setLayout(layout);
        add(pnlActionPanel, BorderLayout.CENTER);

        pnlActionPanel.add(createPanelOpenProject(layout), "OpenProject");
        pnlActionPanel.add(createPanelCreateProject(layout), "CreateProject");
    }

    private JPanel createPanelOpenProject(CardLayout layout) {
        // #####################################
        // Panel that will be added to the main layout
        // #####################################
        final var thisPanel = new JPanel();
        thisPanel.setLayout(new BorderLayout());
        Components.emptyBorder(thisPanel, new Rectangle(10, 10));

        // #####################################
        // Panel with the desired controls
        // #####################################
        final var pnlControls = new JPanel();
        pnlControls.setLayout(new BorderLayout());
        pnlControls.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
        thisPanel.add(pnlControls, BorderLayout.CENTER);

        // #####################################
        // Panel for the project type
        // #####################################

        final var pnlProjectType = new JPanel();
        pnlProjectType.setLayout(new BoxLayout(pnlProjectType, BoxLayout.X_AXIS));
        pnlControls.add(pnlProjectType, BorderLayout.CENTER);

        final var pnlProjectTypeDescription = new JPanel();
        pnlProjectType.add(pnlProjectTypeDescription);

        pnlProjectTypeDescription.setLayout(new FlowLayout());
        final var pnlNorthTypes = new JPanel();
        pnlNorthTypes.setLayout(new BoxLayout(pnlNorthTypes, BoxLayout.Y_AXIS));
        final var ckbGroup = new CheckboxGroup();
        final var ckbEmpty = new Checkbox("Empty");
        ckbEmpty.setCheckboxGroup(ckbGroup);
        final var ckb1stPerson = new Checkbox("1st Person");
        ckb1stPerson.setCheckboxGroup(ckbGroup);
        final var ckb3rdPerson = new Checkbox("3rd Person");
        ckb3rdPerson.setCheckboxGroup(ckbGroup);
        pnlNorthTypes.add(ckbEmpty);
        pnlNorthTypes.add(ckb1stPerson);
        pnlNorthTypes.add(ckb3rdPerson);
        // #####################################
        // Panel for the image
        // #####################################
        final var pnlProjectTypeImage = new JPanel();
        pnlProjectType.add(pnlProjectTypeImage);

        // #####################################
        // Panel for data input
        // #####################################
        final var pnlDataInput = new JPanel();
        pnlControls.add(pnlDataInput, BorderLayout.SOUTH);
        pnlDataInput.setLayout(new GridBagLayout());
        final var constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        pnlDataInput.add(Components.label("Name: "), constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        pnlDataInput.add(Components.textField(20), constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        pnlDataInput.add(Components.label("Directory: "), constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        pnlDataInput.add(Components.textField(20), constraints);

        return thisPanel;
    }

    private JPanel createPanelCreateProject(CardLayout layout) {
        final var panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 3, true));

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
