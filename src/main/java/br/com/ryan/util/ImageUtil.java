package br.com.ryan.util;

import javax.imageio.ImageIO;
import java.awt.*;

public class ImageUtil {

    private Image icon(final String DIR) {
        try {
            return ImageIO.read(getClass().getResourceAsStream(DIR));
        }
        catch (Exception e) {
            return null;
        }
    }
}