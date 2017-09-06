package structural.proxypattern.virtualproxy.model;

public class ProxyImage implements Image {
	
	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void showImage() {
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		
		realImage.showImage();
	}

}
