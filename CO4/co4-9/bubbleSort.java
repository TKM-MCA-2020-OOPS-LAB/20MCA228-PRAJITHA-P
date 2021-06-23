
import java.util.Scanner;

class Bubble {

	void sort(int ar[],int n) {
		int temp;
		int i,j;
		for( i=0;i<ar.length-1;i++) {
			for(j=0;j<ar.length-1-i;j++) {

				if(ar[j]>ar[j+1]) {
					 temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}

	}

	void display(int ar[],int n) {
		for (int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
			}

}
}

public class BubbleSort {

	public static void main(String[] args) {

		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size :");
		n=sc.nextInt();
		System.out.println("Enter Your Elements :");

		int ar[] = new int[n];
		for(i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		Bubble  obj= new Bubble  ();
		System.out.println("Before Sorting the Array is:");
		obj.display(ar,n);
		 obj.sort(ar,n);

		System.out.println("\nSorted Array is :");
		 obj.display(ar,n);
	}
}