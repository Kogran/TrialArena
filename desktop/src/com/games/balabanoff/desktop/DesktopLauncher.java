package com.games.balabanoff.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.games.balabanoff.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//TexturePacker.process("input", "output", "playerTextures");
		config.title = "Trial Arena Game";
		config.width = 800;
		config.height = 600;
		config.resizable = false;
		new LwjglApplication(new Main(), config);
	}
}
