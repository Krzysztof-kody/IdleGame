package com.company.ui;

import com.company.domain.GraApi;
import org.springframework.stereotype.Service;

import java.util.Date;

public class WatekUI implements Runnable {

    private final GraApi graApi;
    private final IdleGame idleGame;

    public WatekUI(GraApi graApi, IdleGame idleGame) {
        this.graApi = graApi;
        this.idleGame = idleGame;
    }

    @Override
    public void run() {
        while (true) {

            idleGame.setStatus(graApi.getStatus(1));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        new Thread(this).start();
    }
}
