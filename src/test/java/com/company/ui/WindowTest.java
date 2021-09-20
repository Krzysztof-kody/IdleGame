package com.company.ui;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowTest {
    private Window window;

    @BeforeEach
    void setUp() {
        window = new Window();
    }

    @Test
    void shouldBeVisible() {
        window.changeVisible();
        Assertions.assertThat(window.isVisible()).isTrue();
    }

    @Test
    void shouldBeNotVisible() {
        window.changeVisible();
        window.changeVisible();
        Assertions.assertThat(window.isVisible()).isFalse();
    }
}