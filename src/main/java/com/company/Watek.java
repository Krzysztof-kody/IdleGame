package com.company;

import javax.swing.*;


public class Watek extends Thread{
     Game game;
    public Watek(Game game){
        this.game = game;
    }

    public void windows(){
        if(!game.isMenuShow() && game.getWindow().getContentPane().getComponent(1).isVisible())
            game.getWindow().getContentPane().getComponent(1).setVisible(false);
        if(game.isMenuShow() && !game.getWindow().getContentPane().getComponent(1).isVisible())
            game.getWindow().getContentPane().getComponent(1).setVisible(true);

        if(!game.isWizualizacja() && game.getWindow().getContentPane().getComponent(0).isVisible())
            game.getWindow().getContentPane().getComponent(0).setVisible(false);
        if(game.isWizualizacja() && !game.getWindow().getContentPane().getComponent(0).isVisible())
            game.getWindow().getContentPane().getComponent(0).setVisible(true);
    }
    @Override
    public void run(){
            int sec = 0;
            while (true) {
                windows();
                sec++;
                if(game.isWizualizacja() && sec % 20 == 0)
                {
                    game.setCoins(game.getCoins() + game.lines[0]);
                    game.setCoins(game.getCoins() + game.lines[1] * 3);
                    game.setCoins(game.getCoins() + game.lines[2] * 10);
                    game.setCoins(game.getCoins() + game.lines[3] * 50);
                    JPanel a = (JPanel)game.getWindow().getContentPane().getComponent(0);
                    ((JLabel)a.getComponent(0)).setText(String.valueOf(game.getCoins()));
                    sec = 0;
                }
                    String tmp;
                for(int i =0; i< 4; i++) {
                    tmp = game.lines[i] + " (" + (int)game.price[i] + ")";
                    ((Board)game.getWindow().getContentPane().getComponent(0)).getCounts()[i].setText(tmp);
                }
                try {
                    sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                    break;
                }
            }
    }
}
