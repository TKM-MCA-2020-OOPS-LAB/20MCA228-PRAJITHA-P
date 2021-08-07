import java.util.*;
public class stack {
	public static void main(String args[])
	{
		
		Stack<String> stack = new Stack<String>();

		stack.add("Athira");
		stack.add("Aswathi");
		stack.add("Nisha");
		stack.add("Achu");
		stack.add("Madhav");

	
		System.out.println("Stack: " + stack);

		String rem = stack.remove(1);

		System.out.println("Removed element: "+ rem);

		System.out.println("Final Stack: "+ stack);
	}
}