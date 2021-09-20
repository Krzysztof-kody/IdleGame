package com.company.domain;

import com.company.dto.GraDTO;

import java.util.HashMap;
import java.util.Map;

public class Gra {
    private final Pasek[] paski;
    private final Sakiewka sakiewka;
    private static final Map<Long, Gra> graMapa = new HashMap<>();

    public Gra() {
        paski = new Pasek[4];
        paski[0] = new Pasek(1, 1);
        paski[1] = new Pasek(10, 2);
        paski[2] = new Pasek(100, 3);
        paski[3] = new Pasek(1000, 5);
        sakiewka = new Sakiewka();
        sakiewka.add(1);
    }


    public static Gra getInstance(long idGra) {
        return graMapa.computeIfAbsent(idGra, Gra::nowa );
    }

    private static Gra nowa(long id ){
        Gra gra = new Gra();
        new Watek(gra).start();

        return gra;
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

    public void kup(int nrPaska) {
        paski[nrPaska].buy(sakiewka);
    }

    public GraDTO getStatus() {
        return GraDTO.createNew(sakiewka, paski);
    }
}
