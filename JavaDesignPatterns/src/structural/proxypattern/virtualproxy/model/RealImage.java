package structural.proxypattern.virtualproxy.model;

import java.io.File;

public class RealImage implements Image {
	
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	private void loadFromDisk(String fileName) {
		File imgFile = new File(fileName);
		System.out.println("Loading " + imgFile.getAbsolutePath());
	}

	@Override
	public void showImage() {
		System.out.println("Displaying : " + fileName);
	}

}
