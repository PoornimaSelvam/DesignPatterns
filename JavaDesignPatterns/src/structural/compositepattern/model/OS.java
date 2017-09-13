package structural.compositepattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite pattern should be applied only when the group of objects should behave as the single object.
 * Composite design pattern can be used to create a tree like structure to represent a part-whole hierarchy.
 * 
 * Composite pattern consists of 3:
 * 1. Base Component – Base component is the interface for all objects 
 * 2. Leaf – Defines the behaviour for the elements in the composition. 
 * 	  It is the building block for the composition and implements base component
 * 3. Composite – It consists of leaf elements and implements the operations in base component.
 * 
 * Example: java.awt.Container#add(Component) 
 */
public class OS implements Application {
	
	private List<Application> apps;
	
	public void add(final Application app)
	{
		if(apps == null){
			apps = new ArrayList<Application>();
		}
		apps.add(app);
	}

	@Override
	public void close() {
		for(Application app: apps)
		{
			app.close();
		}
		System.out.println("Shutting down the system..");
	}

}
