package br.fosge.editor.ui.component;

import br.fosge.Logger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;

public final class JImagePanel extends JPanel {
    private BufferedImage image;

    public JImagePanel(URI uri) {
        try {
            image = ImageIO.read(new File(uri));
        } catch (Throwable throwable) {
            Logger.warn("Failed to open image %s: %s", uri, throwable);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image == null) return;
        g.drawImage(image, 0, 0, this);
    }
}
