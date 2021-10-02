package com.company.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class Sakiewka {
    private Pieniadze aktualnyStan = new Pieniadze();

    public int getMoney() {
        return aktualnyStan.pieniadze();
    }

    public int getBuraki() {
        return aktualnyStan.buraki();
    }
    // zmienić poniższe
    public int getKury() {
        return aktualnyStan.pieniadze();
    }
    public int getKrowy() {
        return aktualnyStan.pieniadze();
    }
    public int getDrzewa(){ return aktualnyStan.pieniadze(); }


    public Sakiewka() {

    }
    public Sakiewka(int money) {
        this.aktualnyStan = Pieniadze.builder().pieniadze(money).build();
    }


    public boolean remove(Pieniadze cost) {
        return aktualnyStan.minus(cost);

    }




    public Pieniadze get() {
        return aktualnyStan;
    }

    public void add(Pieniadze i) {
        aktualnyStan.add(i);
    }
}
