import java.util.*;

class operations
{
	public void operations()
	{
		int top=-1,n,ch,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of stack:");
		n=sc.nextInt();
		int[] arr=new int[n];
		do
		{
			System.out.println("\n -----MENU----- \n 1.push \n 2.pop \n 3.display");
			System.out.println("\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				    if(top==n-1)
				    {
				    	System.out.println("Stack is full");
				    }
				    else
				    {
				    	System.out.println("Enter element");
				    	e=sc.nextInt();
				    	top++;
				    	arr[top]=e;
				    		
				    }
				    break;
				    
			case 2:
				    if(top==-1)
				    {
				    	System.out.println("stack is empty");
				    	
				    }
				    else
				    {
				    	System.out.println(arr[top]+" is removed");
				    	top--;
				    }
				    break;
				    
			case 3:
				    if(top==-1)
				    {
				    	System.out.println("stack is empty");
				    }
				    else
				    {
				    	System.out.println("Displaying the elements");
				    	for(int i=top;i>=0;i--)
				    	{
				    		System.out.println(arr[i]);
				    	}
				    }
				    break;
				    
			case 4: System.out.println("Enter a valid choice");
			}
		}
		while(ch!=5);
		
	}
}
public class GenericStack {

	public static void main(String[] args) {
		operations o=new operations();
		o.operations();
		

	}

}