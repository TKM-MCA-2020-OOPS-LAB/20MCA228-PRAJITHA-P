import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> n=new ArrayList<String>();
		n.add("Glory");
	    n.add("Rahul");
		n.add("Asha");
		n.add("Lijo");
	    n.add("Amily");
	    System.out.println("Original ArrayList:");
	    for(String str:n)
	    	System.out.println(str);
	    System.out.println(" After addition of an element ArrayList:");
	    n.add(2,"Sajo");
	    for(String str:n)
	    	System.out.println(str);
	    System.out.println("Set new element ArrayList:");
	    n.set(1,"Libin");
	    for(String str:n)
	    	System.out.println(str);
	    System.out.println("element removed from ArrayList:");
	    n.remove("Lijo");
	    for(String str:n)
	    	System.out.println(str);
	    System.out.println("Sorted ArrayList:");
	    Collections.sort(n);
	    for(String str:n)
	    	System.out.println(str);
	    System.out.println("Size of the ArrayList:"+n.size());
	    System.out.println("Amily is present in List:"+n.contains("Amily"));
	    n.clear();
	    System.out.println("ArrayList after clear method:"+n);
	    
			      

	}

}