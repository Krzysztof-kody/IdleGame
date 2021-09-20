package com.company.domain;

public class Pasek {
    private final int cost;
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
    public void buy(Sakiewka sakiewka) {
        if (sakiewka.remove(cost)) {
            counter++;
        }
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

    public int getCena() {
        return cost;
    }
}
