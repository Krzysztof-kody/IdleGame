package com.company.ui;

import com.company.dto.SakiewkaDTO;

import javax.swing.*;
import java.awt.*;

public class SkarbonkaUI extends JPanel {

    private String text;
    final static int P_WIDTH = 636;
    final static int P_HEIGHT = 98;

    public SkarbonkaUI() {
        text = "0";
        setBackground(Color.DARK_GRAY);
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawString(text, 5, 15);
    }

    public void setStatus(SakiewkaDTO sakiewka) {
        text = String.valueOf(sakiewka.getKwota());
        repaint();
    }
}
