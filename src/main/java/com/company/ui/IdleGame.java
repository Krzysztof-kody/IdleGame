package com.company.ui;

import com.company.loaders.IconLoader;
import com.company.ui.PasekUI;
import com.company.ui.Window;

import java.awt.*;
import java.util.ArrayList;

public class IdleGame {
    private Window okno;
    private ArrayList<PasekUI> paski;
    private SkarbonkaUI skarbonkaUI;
    public enum Obrazki {buraki, chicken, cows, tree}


    public IdleGame() {
        okno = new Window();
        paski = new ArrayList<PasekUI>();
        skarbonkaUI = new SkarbonkaUI();
    }

    public Window getOkno(){
        return okno;
    }

    public ArrayList<PasekUI> getPaski() {
        return paski;
    }

    public void createBoard() {
        PasekUI pasek;
        skarbonkaUI.setBounds(2,0,SkarbonkaUI.P_WIDTH, SkarbonkaUI.P_HEIGHT);
        okno.add(skarbonkaUI);
        int i=0;
        for (Obrazki rodzaj: Obrazki.values()) {
            paski.add( new PasekUI(Color.black, IconLoader.loadImage(rodzaj.name())));
            paski.get(i).setBounds(2,100+100*i, PasekUI.P_WIDTH,PasekUI.P_HEIGHT);
            okno.add(paski.get(i));
            i++;
        }
    }

    public void start() {
        okno.changeVisible();
    }

}
