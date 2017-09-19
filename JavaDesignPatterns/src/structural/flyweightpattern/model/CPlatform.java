package structural.flyweightpattern.model;

public class CPlatform implements Platform {
	
	private String language;
	
	public CPlatform(String language){
		this.setLanguage(language);
		System.out.println("C Platform object created");
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
