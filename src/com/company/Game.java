package com.company;

import javax.swing.*;
import java.awt.*;

public class Game {
    public boolean menu;
    public boolean wizualizacja;
    public JFrame window;
    public int coins;
    int[] lines = new int[4];
    double[] price = new double[4];

    public Game(){
        coins = 1;
        window = new JFrame("IdleGame");
        lines[0] = 1;
        lines[1] = 0;
        lines[2] = 0;
        lines[3] = 0;

        price[0] = 1;
        price[1] = 10;
        price[2] = 100;
        price[3] = 1000;


        Board wizualizacja = new Board(this);
        Menu menu = new Menu(this);
        menu.setPreferredSize(new Dimension(640, 480));
        window.add(wizualizacja);
        window.add(menu);


        window.getContentPane().getComponent(0).setVisible(false);
        window.getContentPane().getComponent(1).setVisible(true);
        //window.setSize(640,480);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        this.menu = true;
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Watek watek = new Watek(this);
        watek.run();
    }

}
