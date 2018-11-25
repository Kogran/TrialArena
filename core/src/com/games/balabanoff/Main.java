package com.games.balabanoff;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.games.balabanoff.view.GameScreen;

public class Main extends Game {

    private Screen gameScreen;

    @Override
    public void create() {
        gameScreen = new GameScreen();
        setScreen(gameScreen);
    }
}
