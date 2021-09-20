package com.company.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PasekUI extends JPanel implements MouseListener {
    private boolean clicked = false;
    final static int P_WIDTH = 636;
    final static int P_HEIGHT = 98;

    private Image obrazek;
    private String text;
    public void setText(String text){
        this.text = text;
    }
    public PasekUI(Color color, Image icon) {
        this.setBackground(color);
        obrazek = icon;
        text = "0";
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int j = 0; j < 10; j++) {
            g.drawImage(obrazek, 64 * j, 36, null);
        }
        g.setColor(Color.white);
        g.drawString(text,5,15);
    }

    public boolean isClicked() {
        return clicked;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        clicked = true;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // to musi tu być
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        clicked = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // to musi tu być
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // to musi tu być
    }
}
