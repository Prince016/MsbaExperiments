package Constructor;

public class TennisCoach  {

	
	
	


 
 
private String name;


public TennisCoach() {
	System.out.println("calling from the constructor");
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	
	
}

public void bestcoach() {
	System.out.println(" comming from the bestcoach");
}

public void initcalled() {
	System.out.println("Calling init method ");
}

public void destroycalled() {
	System.out.println("destroy method calling ");
}

 
	
}
