import java.util.*;
public class scanner {
public static void main(String[] args) {
	
	Scanner ob = new Scanner(System.in);
	
	System.out.println("NAME : ");
	String name = ob.nextLine();
	
	System.out.println("AGE : ");
	int age = ob.nextInt();
	
	System.out.println("SALARY : ");
	float salary = ob.nextFloat();
	
	
	
	
	
	System.out.println("YOUR NAME IS : "+name);
	System.out.println("AND YOU ARE "+age+" YEAR OLD");
	System.out.println("YOUR ANNUAL SALARY IS "+salary);
	
	if((age<22) && (salary>10000000)) {
		System.out.println("YOU ARE 21 GENERATION WEILTHY PERSON");
		
	}
	
	else {
		  System.out.println("NEVER GIVE UP");
		
	}
	
}
}
