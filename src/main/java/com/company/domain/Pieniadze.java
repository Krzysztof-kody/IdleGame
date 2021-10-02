package com.company.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Pieniadze {
    private Map<Integer, Integer> values = new HashMap<>();

    public static Pieniadze builder() {
        return new Pieniadze();
    }
// synchronized - tej metody nie wywoła drugi watek na tym obiekcie
    public synchronized boolean minus(Pieniadze cost) {
        Map<Integer, Integer> result = new HashMap<>(values);

        for (Map.Entry<Integer, Integer> costItem : cost.values.entrySet()) {
            int mam = result.getOrDefault(costItem.getKey(), 0);
            if (mam >= costItem.getValue()) {
                result.put(costItem.getKey(), mam - costItem.getValue());
            } else {
                return false;
            }
        }
        values = result;
        return true;
    }
// dodać gettery jak poniżej
    public int pieniadze() {
        return values.getOrDefault(0, 0);
    }

    public int buraki() {
        return values.getOrDefault(1, 0);
    }

    public Pieniadze pieniadze(int value) {
        values.put(0, value);
        return this;
    }

    public Pieniadze buraki(int value) {
        values.put(1, value);
        return this;
    }
// usunąć
    public Pieniadze build() {
        return this;
    }

    public synchronized void add(Pieniadze i) {
        for (Map.Entry<Integer, Integer> costItem : i.values.entrySet()) {
            int mam = values.getOrDefault(costItem.getKey(), 0);
            values.put(costItem.getKey(), mam + costItem.getValue());
        }
    }
}
