package com.games.balabanoff.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.games.balabanoff.model.Warrior;

public class GameScreen implements Screen {

    private Texture warriorTexture;
    private SpriteBatch batch;
    private Warrior warrior;

    @Override
    public void show() {
        batch = new SpriteBatch();
        warriorTexture = new Texture(Gdx.files.internal("input/warrior_stay.png"));
        warrior = new Warrior(warriorTexture, 30, 0, 64,64);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        warrior.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        warriorTexture.dispose();
        batch.dispose();
    }
}
