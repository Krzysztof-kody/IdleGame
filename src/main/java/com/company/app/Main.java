package com.company.app;

import com.company.domain.GraApi;
import com.company.domain.GraRepository;
import com.company.ui.IdleGame;

// koszt via obiekt
// zakupy przez obiekt
// sakiewka poszerzony obiekt


// sobota
// TODO testy - createNew, domena cała,
// TODO żeby dany pasek generował odpowiedni zasób i by kosztowały dane zasoby
// TODO gain ma być pieniądzem
// TODO spring
// TODO zastanowiś cię jak wywalić wątek
// TODO https://spring.io/quickstart

public class Main {

    public static void main(String[] args) {
        IdleGame game = new IdleGame(new GraApi(new GraRepository()));
        game.createBoard();
        game.start();
    }
}
