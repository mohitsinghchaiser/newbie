
public class recursion {
	public static void main(String[] args ) {
		
		int result =sum(10);        // ADDING NUMBER FROM 0 TO 10
		int total = sum(3,10);     // ADDING NUMBER FROM 3 TO 10
		
		System.out.println(result);
		System.out.println(total);
		
	}
	
	
	public static int sum(int k) {
	
		    if(k>0) {
		    	
		               return k + sum(k-1); 
		    
		             }
		    
		        else {
		    	
		    	    return 0;
		    	
		             }
		    
		                         }
	
	
	public static int sum(int first,int last) {
		
		if(last>first) {
			
			             return last + sum(first,last-1);
			
		               }
		
	          	  else {
			
			  return last;
			
		               }
	                                           }
	
	
	}	


