import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		
	          try {
	        	  
	        	  File ob = new File("myFile.txt");
	        	  
	        	  if(ob.createNewFile()) {
	        		  System.out.println("FILE CREATED"+ob.getName());
	        		  }
	        	  else {
	        		  System.out.println("FILE ALREADY EXIST");
	        	  }
	        	  
	        	  
	          }catch (IOException e) {
	        	  System.out.println("ERROR OCCURRED");
	        	  e.printStackTrace();
	          }       
	
	               }
	
}
