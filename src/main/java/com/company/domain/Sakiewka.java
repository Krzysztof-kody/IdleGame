package com.company.domain;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Sakiewka {
    private AtomicInteger money;

    public Sakiewka() {
        money = new AtomicInteger();
    }
    public Sakiewka(int money) {
        this.money = new AtomicInteger(money);
    }

    public boolean remove(int cost) {
        AtomicBoolean wasChanged = new AtomicBoolean(true);
        money.updateAndGet(current -> current >= cost ? current - cost : orginal(wasChanged, current));
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
