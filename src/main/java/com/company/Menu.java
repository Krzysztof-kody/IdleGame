package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu extends JPanel implements MouseListener {

    ImageIcon btn;
    private Game game;
    public Menu(Game game){
        this.game = game;
        btn = new ImageIcon("src/main/java/com/company/img/ig.png");

        setSize(640, 480);
        addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g){
            super.paintComponent(g);

            g.drawRect(40, 80, 640 - 80, 480 - 160);
            g.drawImage(btn.getImage(), 70, 90, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if((e.getX()>70 && e.getX()<570)&&(e.getY()>90 && e.getY()<390)){
                game.setMenuShow(false);
                game.setWizualizacja(true);
            }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // to implement
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // to implement
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // to implement
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // to implement
    }
}

