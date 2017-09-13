package structural.compositepattern.test;

import structural.compositepattern.model.Application;
import structural.compositepattern.model.Eclipse;
import structural.compositepattern.model.Game;
import structural.compositepattern.model.OS;
import structural.compositepattern.model.VideoPlayer;

public class OSTester {

	public static void main(String[] args) {
		Application game = new Game();
		//game.close();
		
		Application eclipse = new Eclipse();
		//eclipse.close();
		
		Application player = new VideoPlayer();
		//player.close();
		
		OS os = new OS();
		os.add(game);
		os.add(eclipse);
		os.add(player);
		os.close();
	}

}
