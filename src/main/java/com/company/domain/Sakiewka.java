package com.company.domain;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Sakiewka {
    private AtomicInteger money;

    public int getMoney() {
        return money.get();
    }

    public int getBuraki() {
        return buraki.get();
    }

    public int getKury() {
        return kury.get();
    }

    public int getKrowy() {
        return krowy.get();
    }
    public int getDrzewa(){

            return drzewa.get();

    }
    private AtomicInteger buraki;
    private AtomicInteger kury;
    private AtomicInteger krowy;
    private AtomicInteger drzewa;


    public Sakiewka() {
        money = new AtomicInteger();
    }
    public Sakiewka(int money) {
        this.money = new AtomicInteger(money);
    }

    public boolean remove(KosztPaska cost) {
        AtomicBoolean wasChanged = new AtomicBoolean(true);
        money.updateAndGet(current -> current >= cost.pieniadze ? current - cost.pieniadze : orginal(wasChanged, current));
        buraki.updateAndGet(current -> current >= cost.buraki ? current - cost.buraki : orginal(wasChanged, current));
        kury.updateAndGet(current -> current >= cost.kury ? current - cost.kury : orginal(wasChanged, current));
        krowy.updateAndGet(current -> current >= cost.krowy ? current - cost.krowy : orginal(wasChanged, current));

        return wasChanged.get();
    }

    private int orginal(AtomicBoolean wasChanged, int value) {
        wasChanged.set(false);
        return value;
    }


    public int get() {
        return money.get();
    }

    public void add(int i) {
        money.addAndGet(i);
    }
}
