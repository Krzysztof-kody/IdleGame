package com.company.domain;

public class Pasek {
    private final int cost;
    private int counter;
    public Pasek(int cost) {
        this.cost = cost;
        this.counter = 0;
    }
    public void buy(Sakiewka sakiewka){
        if(sakiewka.remove(cost)) {
            counter++;
        }
    }
    public int getCounter() {
        return this.counter;
    }
}
