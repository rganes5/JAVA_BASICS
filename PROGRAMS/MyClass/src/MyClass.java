import java.awt.geom.Area;
import java.util.Scanner;

public class MyClass extends Area{
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				float r,l,b,h;
				Scanner sc=new Scanner(System.in);
				char ch;
				do
				{
					System.out.println("1.Circle\n2.Square\n3.Rectangle\n4.Triangle\nEnter your choice:");
					int choice=sc.nextInt();
					switch(choice)
					{
					case 1:System.out.println("enter the radius");
					r=sc.nextFloat();
					circle(r);
					break;
					case 2:System.out.println("enter the length");
					l=sc.nextFloat();
					square(l);
					break;
					case 3:System.out.println("enter the length and breadth");
					l=sc.nextFloat();
					b=sc.nextFloat();
					rectangle(l,b);
					break;
					case 4:System.out.println("enter the base and height");
					b=sc.nextFloat();
					h=sc.nextFloat();
					triangle(b,h);
					break;
					default:System.out.println("invalid entry");
					break;
					}
					System.out.println("do you want to continue");
					ch=sc.next().charAt(0);
				}while(ch=='Y'||ch=='y');
			}
		}

