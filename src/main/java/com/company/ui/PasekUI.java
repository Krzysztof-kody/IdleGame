package com.company.ui;

import com.company.domain.GraApi;
import com.company.dto.PasekDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PasekUI extends JPanel implements MouseListener {
    static final int P_WIDTH = 636;
    static final int P_HEIGHT = 98;
    private boolean clicked = false;
    private final Image obrazek;
    private String text;
    public void setText(String text){
        this.text = text;
    }
    public PasekUI(Color color, Image icon) {
        this.setBackground(color);
        obrazek = icon;
        text = "0";
        this.graApi = graApi;
        this.idPaska = idPaska;
        addMouseListener(this);
    }

    public void setText(String text) {
        this.text = text;
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
        graApi.kup(idPaska,1);
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

    public void setStatus(PasekDTO pasekDTO) {
        text = String.valueOf(pasekDTO.getIlosc());
        repaint();
    }
}
