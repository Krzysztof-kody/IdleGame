package com.company.domain;

public class Gra {
    private final Pasek[] paski;
    private final Sakiewka skarbonka;
    public Gra(){
        paski = new Pasek[4];
        paski[0] = new Pasek(1,1);
        paski[1] = new Pasek(10,2);
        paski[2] = new Pasek(100,3);
        paski[3] = new Pasek(1000,5);
        skarbonka = new Sakiewka();
        skarbonka.add(1);
    }

    public void runda(){
        for(int i =0; i<4; i++){
            skarbonka.add(paski[i].getCounter()*paski[i].getGain());
        }
    }

    public Sakiewka getSkarbonka() {
        return skarbonka;
    }

    public Pasek[] getPaski() {
        return paski;
    }
}
