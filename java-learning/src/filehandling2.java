import java.io.File;
import java.io.IOException;
public class filehandling2 {

	public static void main(String[] args){
		
		try {
			
			/*change file created location*/
			File obj =new File("C:\\Users\\ishu\\MOHITfilehandling2.txt");
			if(obj.createNewFile()) {
				System.out.println("FILE CREATED "+obj.getName());
			}
			else {
				System.out.println("FILE ALREADY EXIST ");
			}
		}catch(IOException e) {
			System.out.println("ERROR OCCURRED ");
			e.printStackTrace();
		}
		
	}
}
