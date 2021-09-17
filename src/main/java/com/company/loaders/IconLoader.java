package com.company.loaders;

import javax.swing.*;
import java.awt.*;

/**
 * Import obrazków do aplikacji
 */
public class IconLoader {
    private IconLoader() {
        // klasa narzędziowa
    }

    private static ImageIcon loadIcon(String icon) {
        return new ImageIcon(ResourceLoader.loadResource(String.format("/img/%s.png", icon)));
    }

    public static Image loadImage(String icon) {
        return loadIcon(icon).getImage();
    }
}
