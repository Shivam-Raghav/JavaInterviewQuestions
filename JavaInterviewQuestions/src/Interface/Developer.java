package Interface;

public interface Developer {
 
 default void init() {
	System.out.println(" this is default method for all developer");
 }
	
	void develop();
}
