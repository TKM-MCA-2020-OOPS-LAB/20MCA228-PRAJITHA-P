package java_lab;
import java.util.Scanner;

public class method_overloading {


		void area(double r)
		{
			System.out.println("Area of circle is:"+3.14*r*r);
		}
	    void area(int l, int b)
		{
			System.out.println("Area of rectangle is:"+l*b);
		}
		void area(int a )
		{
			System.out.println("Area of square is:"+a*a);
		}
		

		public static void main(String[] args) {
			method_overloading obj=new method_overloading();
			System.out.println("Enter the radius of circle:");
			Scanner s=new Scanner(System.in);
			double r=s.nextDouble();
			obj.area(r);
			
			System.out.println("Enter the length and breadth of rectangle:");
			int l=s.nextInt();
			int b=s.nextInt();
			obj.area(l,b);
			
			System.out.println("Enter the side of square:");
			int a=s.nextInt();
			obj.area(a);
			

			

		}

}
