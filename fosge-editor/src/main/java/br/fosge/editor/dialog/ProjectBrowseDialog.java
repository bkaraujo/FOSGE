package br.fosge.editor.dialog;

import br.fosge.Logger;
import br.fosge.annotation.Lifecycle;
import br.fosge.editor.ui.SwingTools;
import br.fosge.editor.ui.UIComponent;
import br.fosge.editor.ui.UIContainer;
import br.fosge.graphics.Rectangle;
import br.fosge.tools.Meta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProjectBrowseDialog extends JFrame implements Lifecycle {

    @Override
    public boolean initialize() {
        try {
            setTitle("FOSGE :: Project Browse");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(800, 600);
            setResizable(false);

            setLayout(new BorderLayout());
            final var cards = new CardLayout();
            final var pnlCards = UIContainer.card(cards);

            final var pnlActionType = UIContainer.flow();
            final var lblOpenProject = UIComponent.label(
                    "Open Project",
                    new Rectangle(20, 40),
                    new MouseAdapter(){
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            cards.show(pnlCards, Meta.fqn(ProjectOpenBrowseDialog.class));
                        }
                    });
            SwingTools.onMouseHover(lblOpenProject, Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            pnlActionType.add(lblOpenProject);

            pnlActionType.add(Box.createHorizontalStrut(80));

            final var lblCreateProject = UIComponent.label(
                    "Create Project",
                    new Rectangle(20, 40),
                    new MouseAdapter(){
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            cards.show(pnlCards, Meta.fqn(ProjectCreateBrowseDialog.class));
                        }
                    });
            SwingTools.onMouseHover(lblCreateProject, Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            pnlActionType.add(lblCreateProject);

            pnlCards.add(new ProjectOpenBrowseDialog(), Meta.fqn(ProjectOpenBrowseDialog.class));
            pnlCards.add(new ProjectCreateBrowseDialog(), Meta.fqn(ProjectCreateBrowseDialog.class));

            add(pnlActionType, BorderLayout.NORTH);
            add(pnlCards, BorderLayout.CENTER);
            cards.show(pnlCards, Meta.fqn(ProjectOpenBrowseDialog.class));

            return true;
        } catch (Throwable throwable) {
            Logger.error("Failed to initialize form: %s", throwable);
            return false;
        }
    }
}
