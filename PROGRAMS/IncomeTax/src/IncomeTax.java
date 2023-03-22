import java.util.Scanner;

public class IncomeTax {
public static void main(String[] args) {
	float tax;
	Scanner s=new Scanner(System.in);
	System.out.println("Income tax calculator");
	System.out.println("Enter the income : ");
	float income=s.nextFloat();
	
	if(income<250000)
	{
		System.out.println("No tax");
	}
	else if(income>=250000 && income<500000)
	{
		tax=(income*5)/100;
		System.out.println("The tax percentage for your salary is: "+ tax);
	}
	else if(income>=500000 && income<1000000)
	{
		tax=(income*20)/100;
		System.out.println("The tax percentage for your salary is: "+ tax);		
	}
	else if(income>=1000000 && income>=5000000)
	{
		tax=(income*30)/100;
		System.out.println("The tax percentage for your salary is: "+ tax);
	}
	else {
		System.out.println("Contact Income Tax Department !");
	}




}

}
