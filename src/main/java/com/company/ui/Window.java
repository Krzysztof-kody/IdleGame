package com.company.ui;

import javax.swing.*;

public class Window extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 800;
    private static final int WINDOW_TOP = 100;
    private static final int WINDOW_LEFT = 100;
    private static final String NAME = "IdleGame";

    public Window() {
        this.setBounds(WINDOW_LEFT, WINDOW_TOP, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    public void changeVisible() {
        if (this.isVisible()) {
            this.setVisible(false);
        } else {
            this.setVisible(true);
        }
    }

}
