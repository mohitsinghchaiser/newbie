import java.util.ArrayList;
import java.util.Collections;

public class LoopArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>(); // ArrayList use to add ,modify in array  
		name.add("MOHIT SINGH");
		name.add("ROHIT SINGH");
		name.add("ARJUN KUMAR");
		name.add("ISHWAR SINGH");
		
		Collections.sort(name); //order in alphabatical order 
		
		for(int i=0;i<name.size();i++) {
			
			System.out.println(name.get(i));   //get() is ArrayList method
			
		}
		
	}

}
