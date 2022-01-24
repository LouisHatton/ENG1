package net.shipsandgiggles.pirate.conf;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class Configuration {

	public static final Skin SKIN = new Skin(Gdx.files.internal("skin/comic-ui.json"));
	public static final float PIXEL_PER_METER = 1f;

	public static final Label SPACER_LABEL = new Label(" ", Configuration.SKIN);

}