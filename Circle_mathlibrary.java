
//import Math;
import java.util.Scanner;
public class Circle_mathlibrary{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		 double radius;
		 //radius= sc.nextDouble();
		 System.out.print("entre radious of the circle!");
		 radius=sc.nextDouble();
		 System.out.printf("The diemeter is%.2f", (2* radius));
		 System.out.printf("the circumference is %.2f\n", (2* Math.PI* radius));
		 System.out.printf("Area is %.2f\n", Math.PI* Math.pow(radius,2));
        
    }
}



