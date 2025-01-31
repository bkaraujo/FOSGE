package br.fosge.editor.ui.framework.container;

import br.fosge.commons.Logger;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.file.Path;

public final class FGImagePanel extends FGPanel {
    private Path imagePath;
    private BufferedImage image;

    public FGImagePanel() {
        setLayout(new FlowLayout());
        setBackground(Color.PINK);
    }

    public FGImagePanel(Path path) {
        setLayout(new FlowLayout());
        setImage(path);
        setBackground(Color.PINK);
    }

    public void setImage(Path path) {
        if (imagePath != null && imagePath.equals(path)) {
            return;
        }

        try {
            imagePath = path;
            image = ImageIO.read(path.toFile());
        } catch (Throwable throwable) {
            Logger.warn("Failed to load image %s: %s", imagePath, throwable);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image == null) return;

        g.drawImage(image, 0, 0, this);
    }
}
