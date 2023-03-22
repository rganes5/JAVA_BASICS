import java.util.Scanner;

public class IfSample {
public static void main(String a[])
{
	System.out.println("Enter a number : ");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int sum=0;
	for(int i=1;i<num;i++)
	{
		sum=sum+i;
	}
System.out.println("The sum is "+ sum);

}

}