package com.company.app;

import com.company.domain.Pasek;
import com.company.domain.Sakiewka;
import com.company.ui.IdleGame;

// koszt via obiekt
// zakupy przez obiekt
// sakiewka poszerzony obiekt
// testy - createNew, domena cała,

public class Main {

    public static void main(String[] args) {
        IdleGame game = new IdleGame();
        game.createBoard();
        game.start();
    }
}
