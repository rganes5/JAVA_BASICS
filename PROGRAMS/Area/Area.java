
public class Area extends Area {
	public static void main(String[] args) {
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
		public class Area {
			public static void circle(float r)
			{
				float area=(22*r*r)/7;
				System.out.println("Area="+area);
			}
			public static void square(float l)
			{
				float area=l*l;
				System.out.println("Area="+area);
			}
			public static void rectangle(float l,float b)
			{
				float area=l*b;
				System.out.println("Area="+area);
			}
			public static void triangle(float b,float h)
			{
				float area=(h*b)/2;
				System.out.println("Area="+area);
			}
		}

	}

}
