import java.util.Scanner;

public class job_Application{

    public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("whats your age?");
		int age;
		age=sc.nextInt();
		
	    System.out.println("whats your sex (M/F)?");
		String s=sc.next();
		char sex=s.charAt(0);
		if(!(sex=='M' && age>=25 || sex=='F' && age>=20)) System.out.println("your application not accepted!");
		if((sex=='M' && age>=25)|| (sex=='F' && age>=20))    {System.out.print("Do you have Bsc degree y/n \n");
		       String b=sc.next();
		       char bsc=b.charAt(0);
			   if(bsc=='y') System.out.print("Your application accepted!");
			   if(bsc=='n') System.out.print("Your application not accepted!");}
			 
			 
		    
            
        
    }
}



