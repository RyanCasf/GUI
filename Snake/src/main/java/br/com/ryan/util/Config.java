package br.com.ryan.util;

import java.awt.*;

public class Config {

    public static final int SCREEN_WIDTH = 600;
    public static final int SCREEN_HEIGHT = 600;
    public static final int UNIT_SIZE = 25;
    public static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    public static final int DELAY = 70;

    public static final Font FONT_INK_FREE = new Font("Ink Free", Font.BOLD, 40);
}