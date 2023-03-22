
public class StaticSample {
	int a=10;
	static int b=20;
	public static void main(String ar[]) {
		
		
		StaticSample obj1=new StaticSample();
		StaticSample obj2=new StaticSample();
		obj1.b=150;
		obj1.b=2500;
		obj1.b=300;
		obj2.b=5000;
		obj2.b=1000000;
		obj2.a=35000;
		System.out.println("Static variable b1: "+ obj1.b);
		System.out.println("Static variable b1:"+ obj1.b);
		System.out.println("Sample a1 :"+obj1.a);
		System.out.println("Static variable b2:"+ obj2.b);
		System.out.println("Static variable a2:"+ obj2.a);

	}

}
