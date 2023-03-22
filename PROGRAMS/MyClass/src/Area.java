
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

