import java.util.Scanner;

public class ClassObjectSampleWithFunctions {
	public static void main(String ar[]) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter two values");
	SubClass obj1=new SubClass();
	SubClass obj2=new SubClass();
	
	
	int num1=input.nextInt();
	int num2=input.nextInt();
	
	
	int num3=100;
	int num4=200;
	
	
	
	obj1.calculatesum(num1, num2);
	obj1.displaysum();

	obj2.calculatesum(num3, num4);
	obj2.displaysum();
	
	
	}
}
