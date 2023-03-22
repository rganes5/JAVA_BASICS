import java.util.Scanner;

public class ArithmeticFuctions {
public static void main(String ar[]) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the first number : ");
	int num1=s.nextInt();
	System.out.println("Enter the second number : ");
	int num2=s.nextInt();
	System.out.println("Enter 1 for addition ");
	System.out.println("Enter 2 for subtraction ");
	System.out.println("Enter 3 for multiplication");
	System.out.println("Enter 4 for division ");
	int choice=s.nextInt();
	
	SubClass obj1=new SubClass();
	
	if(choice==1) {
		obj1.addition(num1, num2);
		int print= obj1.result;
		System.out.println("The result is" + print);
	}
	else if(choice==2){
		obj1.subtraction(num1, num2);
	}
	else if(choice==3) {
		obj1.multiplication(num1, num2);
	}
	else if(choice==4) {
		obj1.division(num1, num2);
	}
	else {
		System.out.println(false);
	}
	
	
	
	
	
}
}

