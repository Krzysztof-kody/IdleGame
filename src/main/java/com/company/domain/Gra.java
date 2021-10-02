package com.company.domain;

import com.company.dto.GraDTO;

import java.util.Date;

public class Gra {
    private final Pasek[] paski;
    private final Sakiewka sakiewka;
    private Date czas;
    private final int DIV_TIME;
    public Gra() {
        DIV_TIME = 100;
        czas = new Date();
        paski = new Pasek[4];
        paski[0] = new Pasek(Pieniadze.builder().pieniadze(1).build(), 1);
        paski[1] = new Pasek(Pieniadze.builder().pieniadze(10).build(), 2);
        paski[2] = new Pasek(Pieniadze.builder().pieniadze(100).build(), 3);
        paski[3] = new Pasek(Pieniadze.builder().pieniadze(1000).build(), 5);
        sakiewka = new Sakiewka();
        sakiewka.add(Pieniadze.builder().pieniadze(1).build());
    }

    public void aktualizuj(Date czas){
        long rund = (czas.getTime()-this.czas.getTime())/DIV_TIME;
        this.czas = czas;
        for (long i=0; i<rund; i++){
            runda();
        }

    }
    public void runda() {
        for (int i = 0; i < 4; i++) {
            sakiewka.add(Pieniadze.builder().pieniadze(paski[i].getCounter() * paski[i].getGain()).build() );
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
        czas = new Date();
        aktualizuj(czas);
        return GraDTO.createNew(sakiewka, paski);
    }
}
