import java.util.Scanner;

public class PrimeNumberSample {
public static void main(String ar[]) {

	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number to check weather prime or not: ");
	int num=s.nextInt();
	int flag=0;
	for(int i=1;i<num/2;i++)
	{
		if(num%i==0) {
			flag++;
		}
	}
	if(flag==1)
	{
		System.out.println("The number "+num+" is prime");
		
	}
	else
	{
		System.out.println("The number "+num+" is not prime");
	}
}
}
