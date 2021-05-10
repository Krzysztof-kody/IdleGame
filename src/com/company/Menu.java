package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu extends JPanel implements MouseListener {

    ImageIcon btn;
    Game game;
    public Menu(Game game){
        this.game = game;
        ImageIcon img = new ImageIcon("src/com/company/img/ig.png");
        btn = img;
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
        if(e.getX()>70 && e.getX()<570)
            if(e.getY()>90 && e.getX()<390){
                game.menu = false;
                game.wizualizacja = true;
        //        System.out.println("bum");
            }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

