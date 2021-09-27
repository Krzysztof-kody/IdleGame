package com.company.domain;

import com.company.dto.GraDTO;

public class Gra {
    private final Pasek[] paski;
    private final Sakiewka sakiewka;


    public Gra() {
        paski = new Pasek[4];
        paski[0] = new Pasek(KosztPaska.builder().pieniadze(1).build(), 1);
        paski[1] = new Pasek(KosztPaska.builder().pieniadze(10).build(), 2);
        paski[2] = new Pasek(KosztPaska.builder().pieniadze(100).build(), 3);
        paski[3] = new Pasek(KosztPaska.builder().pieniadze(1000).build(), 5);
        sakiewka = new Sakiewka();
        sakiewka.add(1);
    }


    public void runda() {
        for (int i = 0; i < 4; i++) {
            sakiewka.add(paski[i].getCounter() * paski[i].getGain());
        }
    }

    public Sakiewka getSakiewka() {
        return sakiewka;
    }

    public Pasek[] getPaski() {
        return paski;
    }

    public boolean kup(int nrPaska) {
        return paski[nrPaska].buy(sakiewka);

    }

    public GraDTO getStatus() {
        return GraDTO.createNew(sakiewka, paski);
    }
}
