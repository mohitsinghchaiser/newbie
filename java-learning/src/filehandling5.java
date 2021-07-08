import java.io.File;
public class filehandling5 {

	public static void main(String[] args) {
		
		File ob = new File("C:\\Users\\ishu\\MOHITfilehandling2.txt");
	    if(ob.exists()) {
	    	System.out.println("file-name : "+ob.getName());
	    	System.out.println("absolute-path : "+ob.getAbsolutePath());
	    	System.out.println("writeable : "+ob.canWrite());
	    	System.out.println("readable : "+ob.canRead());
	    	System.out.println("file size in byte : "+ob.length());
	    	
	    }
	    else {
	    	System.out.println("FILE DOESN'T EXIST");
	    }
	}
}
