package com.company.app;

import com.company.domain.GraApi;
import com.company.ui.IdleGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    private GraApi graApi;

    @Override
    public void run(String... args) {
        IdleGame game = new IdleGame(graApi);
        game.createBoard();
        game.start();
    }
}
