package java_lab;
import java.util.*;

public class employee {


		int eno,esalary;
		String ename;
		
		public void getinfo()
		{
			Scanner inp1 = new Scanner(System.in);
			System.out.println("Enter eno : ");
			eno = inp1.nextInt();
			System.out.println("Enter ename : ");
			ename = inp1.next();
			System.out.println("Enter esalary : ");
			esalary = inp1.nextInt();
			
		}
		
		public void display()
		{
			System.out.println("eno : "+eno);
			System.out.println("ename : "+ename);
			System.out.println("esalary : "+esalary);
			
		}
		
		public static void main(String[] args)
		{
			int i;
			
			Scanner inp2 = new Scanner(System.in);
			System.out.println("Enter no of employees ");
			int no = inp2.nextInt();
			
			employee arr[] = new employee[no];
			
			
			for(i=0;i<no;i++)
			{
				 arr[i] = new employee();
				 arr[i].getinfo();
			}
			
			System.out.println("Enter eno of the employee to get the details :");
			int choice = inp2.nextInt();
			
			
			boolean check = false;
			
			for(i=0;i<no;i++)
			{
				if(choice == arr[i].eno)
				{
					check = true;
					break;
				}
				
			}
			if(check == true)
			{
				arr[i].display();
			}
			else
			{
				System.out.println("employee not found");
			}
			
			
			
		}

	

}
