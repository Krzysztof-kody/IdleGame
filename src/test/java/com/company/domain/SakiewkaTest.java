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
        Assertions.assertThat(sakiewka.get().pieniadze()).isZero();
    }

    @Test
    void shouldCanBeLessThenZero() {
        Assertions.assertThat(sakiewka.remove(Pieniadze.builder().pieniadze(10).build())).isFalse();
        Assertions.assertThat(sakiewka.get().pieniadze()).isZero();
    }

    @Test
    void shouldAddValue() {
        sakiewka.add(Pieniadze.builder().pieniadze(10).build());
        Assertions.assertThat(sakiewka.get().pieniadze()).isEqualTo(10);
    }
    @Test
    void shouldBeSix() {
        sakiewka.add(Pieniadze.builder().pieniadze(10).build());
        sakiewka.remove(Pieniadze.builder().pieniadze(4).build());
        Assertions.assertThat(sakiewka.get().pieniadze()).isEqualTo(6);
    }
}