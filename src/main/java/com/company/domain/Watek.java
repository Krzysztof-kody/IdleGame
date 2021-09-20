package com.company.domain;


public class Watek implements Runnable {

    private Gra gra;

    Watek(Gra gra) {
        this.gra = gra;
    }

    public void start() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            gra.runda();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
