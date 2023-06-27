package br.com.ryan.util;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageUtil {

    public Image image(final String DIR) {
        try {
            return ImageIO.read(getClass().getResourceAsStream(DIR));
        }
        catch (Exception e) {
            return null;
        }
    }

    public Icon icon(final String DIR) {
        try {
            BufferedImage bufferedImage = ImageIO.read(getClass().getResourceAsStream(DIR));
            return new ImageIcon(bufferedImage);
        }
        catch (Exception e) {
            return null;
        }
    }
}