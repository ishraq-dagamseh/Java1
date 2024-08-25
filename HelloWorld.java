import java.util.Scanner;

public class HelloWorld{

    public static void main(String args[]){
        
         System.out.println("Entre first number, please!");
         Scanner input= new Scanner (System.in);
		 int num1, num2, sum;
		 num1= input. nextInt();
		 System.out.println("Entre second number ,please!");
		 num2= input.nextInt();
		 sum=num1+num2;
		 System.out.println("The sum of two numbers is: "+ sum);
		 
    }
}





