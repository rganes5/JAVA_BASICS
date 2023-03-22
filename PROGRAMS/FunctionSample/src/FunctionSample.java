import java.util.Scanner;

public class FunctionSample {
public static void main(String a[]) {
	System.out.println("Enter two numbers :");
	Scanner s=new Scanner(System.in);
			int num1=s.nextInt();
			int num2=s.nextInt();
			int res=sum(num1,num2);
			System.out.println("The result is : "+ res);
}




static int sum(int a,int b)
{
	int result;
	result=a+b;
	return result;
	
}
}
