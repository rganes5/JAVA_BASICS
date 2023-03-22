
public class SubClassB extends SubClassA {
	int a;
	
	
	SubClassB(){
		System.out.println("This is a constructor of B");
	}
	SubClassB(int a){
		super(a);
		System.out.println("This is a constructor with argument of B "+ a );
	}
	
	
void display(){
	System.out.println("It is B");
	a=50;
	super.a=100;
	int c=a+super.a;
	System.out.println(c);
}


void DisplaySubClassA() {
	super.display();

}



public static void main(String[] args) {
	SubClassB obj= new SubClassB(10);
//	obj.display();
//	obj.DisplaySubClassA();
	

}
}
