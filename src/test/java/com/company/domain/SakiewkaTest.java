package com.company.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SakiewkaTest {
    private Sakiewka sakiewka;

    @BeforeEach
    void setUp() {
        sakiewka = new Sakiewka();
    }

    @Test
    void shouldBeZeroOnInit() {
        Assertions.assertThat(sakiewka.get()).isZero();
    }

    @Test
    void shouldCanBeLessThenZero() {
        Assertions.assertThat(sakiewka.remove(10)).isFalse();
        Assertions.assertThat(sakiewka.get()).isZero();
    }

    @Test
    void shouldAddValue() {
        sakiewka.add(10);
        Assertions.assertThat(sakiewka.get()).isEqualTo(10);
    }
    @Test
    void shouldBeSix() {
        sakiewka.add(10);
        sakiewka.remove(4);
        Assertions.assertThat(sakiewka.get()).isEqualTo(6);
    }
}