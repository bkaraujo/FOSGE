package br.fosge.editor.ui.component;

import br.fosge.Logger;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.file.Path;

public final class FGImagePanel extends FGPanel {
    private Path imagePath;
    private BufferedImage image;

    public FGImagePanel() {
        super(new FlowLayout());
    }

    public FGImagePanel(Path path) {
        super(new FlowLayout());
        setImage(path);
    }

    public void setImage(Path path) {
        if (imagePath != null && imagePath.equals(path)) {
            return;
        }

        try {
            imagePath = path;
            image = ImageIO.read(path.toFile());
        } catch (Throwable throwable) {
            Logger.warn("Failed to load %s. %s", path, throwable);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image == null) return;

        g.drawImage(image, 0, 0, this);
    }
}
