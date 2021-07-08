import java.io.IOException;
import java.io.FileWriter;
public class filehandling3 {
	public static void main(String[] args){
		
		try {
			FileWriter ob = new FileWriter("C:\\Users\\ishu\\MOHITfilehandling2.txt");
			ob.write("HELLO MY NAME IS MOHIT SINGH ");
			ob.close();
			System.out.println("SUCCESSFULLY WRITER");
			
		}catch(IOException e) {
			System.out.println("ERROR OCCURRED ");
			e.printStackTrace();
		}
		
	}

}
