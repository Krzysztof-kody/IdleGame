package com.company.app;

import com.company.domain.Gra;

public class Watek implements Runnable {

    private Gra gra;

    Watek(){
        gra = new Gra();
    }

    public void start(){
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(true){
           gra.runda();
            try {
                wait(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
