import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class filehandling4 {
	public static void main(String[] args){
	
		try {
		File ob = new File("C:\\Users\\ishu\\MOHITfilehandling2.txt");
	    Scanner myReader = new Scanner(ob);
	    
	    while(myReader.hasNextLine()){
	    	String data = myReader.nextLine();
	    	System.out.println(data);
	    	
	    }
	    myReader.close();
	}catch(FileNotFoundException e) {
		System.out.println("ERROR OCCURRED");
		e.printStackTrace();
	}
	

}
}
