package com.company.ui;

import com.company.domain.GraApi;
import com.company.dto.GraDTO;
import com.company.loaders.IconLoader;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

// dodaj wątek, odświeżanie widoku
// pobiera informacje z GraApi

public class IdleGame {
    private Window okno;
    private List<PasekUI> paski;
    private SkarbonkaUI skarbonkaUI;
    private GraApi graApi;
    private final WatekUI watekUI;

    public void setStatus(GraDTO status) {
        for (int i = 0; i < status.getPaski().size(); i++) {
            this.paski.get(i).setStatus(status.getPaski().get(i));
        }
        skarbonkaUI.setStatus(status.getSakiewka());
    }

    public enum Obrazki {buraki, chicken, cows, tree}


    public IdleGame(GraApi graApi) {
        okno = new Window();
        paski = new ArrayList<>();
        skarbonkaUI = new SkarbonkaUI();
        this.graApi = graApi;
        watekUI = new WatekUI(graApi, this);
    }

    public Window getOkno() {
        return okno;
    }

    public List<PasekUI> getPaski() {
        return paski;
    }

    public void createBoard() {
        skarbonkaUI.setBounds(2, 0, SkarbonkaUI.P_WIDTH, SkarbonkaUI.P_HEIGHT);
        okno.add(skarbonkaUI);
        int i = 0;
        for (Obrazki rodzaj : Obrazki.values()) {
            paski.add(new PasekUI(Color.black, IconLoader.loadImage(rodzaj.name()), i, graApi));
            paski.get(i).setBounds(2, 100 + 100 * i, PasekUI.P_WIDTH, PasekUI.P_HEIGHT);
            okno.add(paski.get(i));
            i++;
        }
    }

    public void start() {
        okno.changeVisible();
        watekUI.start();

    }

}
