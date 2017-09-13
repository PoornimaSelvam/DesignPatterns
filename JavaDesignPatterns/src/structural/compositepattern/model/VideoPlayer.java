package structural.compositepattern.model;

public class VideoPlayer implements Application {

	@Override
	public void close() {
		System.out.println("Closing VideoPlayer..");
	}

}
