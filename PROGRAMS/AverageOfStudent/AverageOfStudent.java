import java.util.Scanner;

public class AverageOfStudent {
public static void main(String[] args) {
	
	float grade;
	
	System.out.println("Program to calculate the aggregate score of Students: ");
	Scanner s=new Scanner(System.in);
	
	
	System.out.println("Enter the written score: ");
	float written=s.nextInt();
	System.out.println("Enter the lab score: ");
	float lab=s.nextInt();
	System.out.println("Enter the Assignment score: ");
	float ass=s.nextInt();

	
	grade=(written*70)/100 + (lab*20)/100 + (ass*10)/100;
	
	System.out.println("The Grade of the Student is: "+ grade);


}
}
