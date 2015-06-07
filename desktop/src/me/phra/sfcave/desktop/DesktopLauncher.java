package me.phra.sfcave.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import me.phra.sfcave.SFCave;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.backgroundFPS = 30;
		cfg.foregroundFPS = 120;
		cfg.fullscreen = false;
		cfg.width = 800;
		cfg.height = 600;
		cfg.resizable = false;
		cfg.title = "SFCave";
		cfg.vSyncEnabled = false;
		cfg.x = -1;
		cfg.y = -1;
		new LwjglApplication(new SFCave(), cfg);
	}
}
