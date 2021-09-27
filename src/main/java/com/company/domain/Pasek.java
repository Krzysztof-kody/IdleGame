package com.company.domain;

public class Pasek {
    private final KosztPaska cost;
    private final int gain;
    private int counter;
    private boolean isAvaible;

    public Pasek(int cost, int gain) {
        this.cost = cost;
        this.gain = gain;
        this.counter = 1;
        this.isAvaible = false;
    }
    public int getGain(){
        return gain;
    }
    public boolean buy(Sakiewka sakiewka) {
        if (sakiewka.remove(cost)) {
            counter++;
            return true;
        }
        return false;
    }

    public void turnOn() {
        isAvaible = true;
    }

    public boolean getAvailble() {
        return isAvaible;
    }

    public int getCounter() {
        return this.counter;
    }

    public KosztPaska getCena() {
        return cost;
    }
}
