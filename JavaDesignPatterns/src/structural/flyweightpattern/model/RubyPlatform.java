package structural.flyweightpattern.model;

public class RubyPlatform implements Platform {
	
	private String language;
	
	public RubyPlatform(String language){
		this.setLanguage(language);
		System.out.println("RubyPlatform object created");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Compiling and executing Java Code");
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
