package br.fosge.editor;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileTree extends JFrame {
    private JTree tree;
    private Path path;

    public FileTree(Path path) {
        this.path = path;
        setTitle("File Tree");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeComponents();
        pack();
        setVisible(true);
    }

    public void initializeComponents()
    {
        try {
            tree = new JTree(new CustomTreeModel(new DefaultMutableTreeNode("Data"), path));
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(
                    this,
                    "Error while reading input file.",
                    "error",
                    JOptionPane.ERROR_MESSAGE
            );
        }

        tree.setRootVisible(false);
        add(new JScrollPane(tree));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try { UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); }
            catch (Exception e) { }

            String path = "/home/mohamed/Desktop/abc.csv";
            if (args.length > 0) { path = args[0]; }
            new FileTree(Paths.get(path));
        });
    }
}

class CustomTreeModel extends DefaultTreeModel {
    private static final long serialVersionUID = -274517614354269449L;

    public CustomTreeModel(TreeNode root, Path path) throws IOException {
        super(root);
        try (final var br = new BufferedReader(new FileReader(path.toFile()))) {
            String s;
            DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) root;
            int skipFirstLine = -1;
            List<String> items = new ArrayList<>();

            DefaultMutableTreeNode parentName;
            DefaultMutableTreeNode quantity;
            DefaultMutableTreeNode componentName;

            while ((s = br.readLine()) != null) {
                if (skipFirstLine == -1) {
                    skipFirstLine = 0;
                    continue;
                }

                items.addAll(Arrays.asList(s.split("\\s")));
                items.removeAll(List.of(""));

                if (items.size() == 3) {
                    parentName = new DefaultMutableTreeNode(items.get(0));
                    parentName.setAllowsChildren(false);
                    quantity = new DefaultMutableTreeNode(items.get(1));
                    quantity.setAllowsChildren(false);
                    componentName = new DefaultMutableTreeNode(items.get(2));

                    componentName.add(parentName);
                    componentName.add(quantity);

                    rootNode.add(componentName);
                }
                items.clear();
            }
            setRoot(rootNode);
        } catch (IOException e) {
            throw e;
        }
    }
}
