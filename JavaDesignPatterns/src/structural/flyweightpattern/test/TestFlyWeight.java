package structural.flyweightpattern.test;

import structural.flyweightpattern.model.Code;
import structural.flyweightpattern.model.Platform;
import structural.flyweightpattern.model.PlatformFactory;

public class TestFlyWeight {
	
	public static void main(String[] args) {
		
		Code code = new Code();
		Platform platform;
		
		code.setCode("JAVA Code");
		platform = PlatformFactory.getPlatformInstance("JAVA");
		platform.execute(code);
		System.out.println("-----------------------------------------");
		
		code.setCode("JAVA Code2");
		platform = PlatformFactory.getPlatformInstance("JAVA");
		platform.execute(code);
		System.out.println("-----------------------------------------");
		
		code.setCode("C Code");
		platform = PlatformFactory.getPlatformInstance("C");
		platform.execute(code);
		System.out.println("-----------------------------------------");
		
		code.setCode("Ruby Code");
		platform = PlatformFactory.getPlatformInstance("RUBY");
		platform.execute(code);

	}
}
