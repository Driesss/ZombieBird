package be.driesstelten.zombiebird;

import com.badlogic.gdx.Game;
import be.driesstelten.zombiebird.screens.SplashScreen;
import be.driesstelten.zombiebird.zbhelpers.AssetLoader;

public class ZBGame extends Game {

	@Override
	public void create() {
		System.out.println("ZBGame created");
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
