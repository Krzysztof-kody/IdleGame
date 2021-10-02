package com.company.domain;

public class Pasek {
    private final Pieniadze cost;
    private final int gain;
    private int counter;
    private boolean isAvaible;

    public Pasek(Pieniadze cost, int gain) {
        this.cost = cost;
        this.gain = gain;
        this.counter = 0;
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

    public Pieniadze getCena() {
        return cost;
    }
}
