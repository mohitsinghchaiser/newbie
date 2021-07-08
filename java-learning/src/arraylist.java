import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("MOHIT SINGH");
		name.add("ISHWAR SINGH");
		name.add("MUKESH JOSHI");
		
		System.out.println(name);
	     
		String n = name.get(2);
		System.out.println(n);
		
		name.set(2, "DEEPAK SINGH");
		
		System.out.println(name);
		
		int i= name.size();
		System.out.println(i);
	}
}
