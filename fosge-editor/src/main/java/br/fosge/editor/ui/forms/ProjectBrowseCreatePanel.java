package br.fosge.editor.ui.forms;

import br.fosge.editor.project.ProjectType;
import br.fosge.editor.ui.framework.component.FGButtonGroup;
import br.fosge.editor.ui.framework.component.FGFrame;
import br.fosge.editor.ui.framework.component.FGImagePanel;
import br.fosge.editor.ui.framework.component.FGPanel;
import br.fosge.editor.ui.framework.listener.CursorHoverListener;
import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public final class ProjectBrowseCreatePanel extends FGPanel {
    public static final String ACTION = "Create";

    private final FGFrame parent;
    private final JFileChooser chooser = new JFileChooser();
    private final FGButtonGroup buttonGroup = new FGButtonGroup();
    private final JTextField txtProjectName = new JTextField();
    private final JTextField txtProjectPath = new JTextField();

    ProjectBrowseCreatePanel(FGFrame parent) {
        setLayout(new MigLayout("fillx, insets 20 50 20 50", "[grow]"));
        this.parent = parent;

        chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        chooser.setDialogTitle("Select Project Folder");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        createLayout();
    }

    private void createLayout() {
        final var lblProjectName = new JLabel("Project Name: ");
        lblProjectName.putClientProperty(FlatClientProperties.STYLE, "font: bold +2");
        add(JLabel.class, lblProjectName, "width 120, split");
        add(JTextField.class, txtProjectName, "growx, wrap");
        txtProjectName.putClientProperty(FlatClientProperties.STYLE, "background:darken(@background, 1%)");

        final var lblProjectFolder = new JLabel("Project Folder: ");
        lblProjectFolder.putClientProperty(FlatClientProperties.STYLE, "font: bold +2");
        add(JLabel.class, lblProjectFolder, "width 120, split");
        add(JTextField.class, txtProjectPath, "growx");
        txtProjectPath.setEditable(false);
        txtProjectPath.putClientProperty(FlatClientProperties.STYLE, "background:darken(@background, 1%)");

        final var btnProjectFolder = add(JButton.class, new JButton("..."), "align right, wrap");
        btnProjectFolder.addActionListener((_) -> {
            if (chooser.showOpenDialog(parent) == JFileChooser.APPROVE_OPTION) {
                final var path = chooser.getSelectedFile().getAbsolutePath();
                txtProjectPath.setText(path.replace('\\', '/'));
            }
        });

        add(Box.createVerticalStrut(60), "wrap");

        final var pnlProjectTypes = add(FGPanel.class, mig("fill", "[]"), "width 100, split"); {
            pnlProjectTypes.add(Box.createVerticalStrut(100), "wrap");
            for (final var option : ProjectType.values()) {
                final var button = buttonGroup.add(JRadioButton.class, new JRadioButton(option.displayName));
                button.addMouseListener(new CursorHoverListener(Cursor.HAND_CURSOR));
                button.putClientProperty(FlatClientProperties.STYLE, "font: bold +2");
                pnlProjectTypes.add(button, "width 120, wrap");
            }
            pnlProjectTypes.add(Box.createVerticalStrut(100));
        }

        add(new FGImagePanel(), "grow, wrap");
        add(Box.createVerticalStrut(60), "wrap");
    }

    @Override
    public Map<String, ?> values() {
        final var values = new ConcurrentSkipListMap<String, Object>();
        values.put("project.name", txtProjectName.getText());
        values.put("project.path", txtProjectPath.getText());

        final var selected = buttonGroup.getSelected();
        values.put("project.type", selected != null ? selected.getText() : null);

        return values;
    }

    @Override
    public void reset() {
        txtProjectName.setText("");
        txtProjectPath.setText("");
        buttonGroup.clearSelection();
    }
}
