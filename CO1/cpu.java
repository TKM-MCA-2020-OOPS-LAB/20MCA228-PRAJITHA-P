/*Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)
and static nested class RAM (memory, manufacturer). Create an object of CPU and print
information of Processor and RAM.*/

package java_lab;

import java.util.Scanner;
import java.lang.String;

public class CPU {

	   double price;
	   public class Processor{
		   float ncores;
		   String manufacturer;
		   void pinfo(float a,String processorname) {
		          ncores=a;
		          manufacturer=processorname;
		          System.out.println("\nInformation of Processor");
		          System.out.println("No. of cores:"+ncores+"\nManufacturer:" +manufacturer);	
		   }
	   }
	   static class RAM{
		   float memory;
		   String manufacturer;
		   void prinfo(float b,String ramname) {
			   memory=b;
			   manufacturer=ramname;
			   System.out.println("\nInformation of RAM" ); 
		       System.out.println("No. of cores:"+memory+"\nManufacturer:"+manufacturer);	
		    }
	   }

		public static void main(String[] args) {
			CPU obj=new CPU();
			CPU.Processor obj1=obj.new Processor();
			CPU.RAM obj2=new CPU.RAM();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter price of CPU");
			obj.price=sc.nextInt();
			
			System.out.println("Enter Processor details(no. of cores, manufacturer):");
			float a=sc.nextFloat();
			Scanner sc1=new Scanner(System.in);
			String processorname=sc1.nextLine();
			
			System.out.print("Enter RAM details(memory, manufacturer):");
			float b=sc.nextFloat();
			String ramname=sc1.nextLine();
			
			sc.close();
			sc1.close();
			
			System.out.println("\nThe price of CPU is"+obj.price);
			
			obj1.pinfo(a, processorname);
			obj2.prinfo(b, ramname);
		}

}
