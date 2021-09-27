package com.company.app;

import com.company.domain.GraApi;
import com.company.domain.GraRepository;
import com.company.ui.IdleGame;

// koszt via obiekt
// zakupy przez obiekt
// sakiewka poszerzony obiekt
// testy - createNew, domena cała,

public class Main {

    public static void main(String[] args) {
        IdleGame game = new IdleGame(new GraApi(new GraRepository()));
        game.createBoard();
        game.start();
    }
}
