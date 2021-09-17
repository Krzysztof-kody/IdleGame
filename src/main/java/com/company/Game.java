package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class Game implements Serializable {
    private boolean menuShow;
    private boolean wizualizacja;
    private JFrame window;

    public boolean isMenuShow() {
        return menuShow;
    }

    public boolean isWizualizacja() {
        return wizualizacja;
    }

    public JFrame getWindow() {
        return window;
    }

    public int getCoins() {
        return coins;
    }

    public double[] getPrice() {
        return price;
    }

    private int coins;
    int[] lines = new int[4];
    double[] price = new double[4];

    public void setCoins(int coins) {
        this.coins = coins;
    }

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
        Board wyglad = new Board(this);
        Menu menu = new Menu(this);
        menu.setPreferredSize(new Dimension(640, 480));
        window.add(wyglad);
        window.add(menu);
        window.getContentPane().getComponent(0).setVisible(false);
        window.getContentPane().getComponent(1).setVisible(true);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
    }
    public void startGame(){
        window.setVisible(true);
        this.menuShow = true;
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Watek watek = new Watek(this);
        watek.runAsThread();
    }

    public void setMenuShow(boolean menuShow) {
        this.menuShow = menuShow;
    }

    public void setWizualizacja(boolean wizualizacja) {
        this.wizualizacja = wizualizacja;
    }
}
