import java.util.Scanner;

public class if_statement{

    public static void main(String args[]){
		
	    Scanner in= new Scanner(System.in);
	    System.out.println("Entre your number");
	    int n= in.nextInt();
		if (n%2==0) System.out.printf("%d is even\n", n);
		if (n%2==1) System.out.printf("%d is odd\n", n);
		

        
    }
}




