import java.util.Scanner;
public class switchCase{

    public static void main(String args[]){
		char grade;
		Scanner s= new Scanner(System.in);
		int score= s.nextInt();
		if(score<0|| score>100)
			System.out.println("Invalid score");
		else{
			switch(score/10){
				case 10:
				case 9:
				   grade='A'; break;
				case 8:
				   grade='B'; break;
				case 7: 
				   grade='C'; break;
				case 6:
				case 5:
				   grade='D'; break;
				default: 
				   grade='F'; break;
				
				
			}
			System.out.println("The grade is"+ grade);
		}
	  }	
}



