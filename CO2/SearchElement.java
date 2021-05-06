//Search an element in an array.

package java_lab;
import java.util.Scanner;

public class SearchElement {

	    public static void main(String[] args) 
	    {
	        int num, s, flag = 0, i = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter no. of elements  in Array:");
	        num = sc.nextInt();
	        int arr[] = new int[num];
	        System.out.println("Enter  the elements in to the Array:");
	        for(i = 0; i < num; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter the element you want to Search:");
	        s = sc.nextInt();
	        for(i = 0; i < num; i++)
	        {
	            if(arr[i] == s)
	            {
	                flag = 1;
	                break;
	            }
	            else
	            {
	                flag = 0;
	            }
	        }
	        if(flag == 1)
				System.out.println("Element found at position:"+(i + 1));
	        else
	            System.out.println("Element not found");
	    }
}
