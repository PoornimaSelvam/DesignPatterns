package structural.flyweightpattern.model;

public class JavaPlatform implements Platform {
	
	private String language;
	
	public JavaPlatform(String language){
		this.setLanguage(language);
		System.out.println("JavaPlatform object created");
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
