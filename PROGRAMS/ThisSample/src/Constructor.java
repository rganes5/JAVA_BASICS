
public class Constructor {
int a=100,b=200;

Constructor(int a,int b){
	System.out.println("This is from the local variables "+a +" "+b);
	a=this.a;
	b=this.b;
	System.out.println("This is from the global variables "+ a + " "+ b);
}
}
