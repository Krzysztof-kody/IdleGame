package com.company.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasekTest {
    private Pasek pasek;


    @BeforeEach
    void setUp() {
        pasek = new Pasek(100);
    }

    @Test
    void shouldNotChange() {
        executeBuy(10);
        Assertions.assertThat(pasek.getCounter()).isZero();
    }

    @Test
    void shouldChange() {
        executeBuy(100);
        Assertions.assertThat(pasek.getCounter()).isEqualTo(1);
    }

    private void executeBuy(int money) {
         Sakiewka sakiewka = new Sakiewka(money);
         pasek.buy(sakiewka);
    }
}