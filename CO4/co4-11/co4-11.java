 
import java.util.*;
public class mca {
	
	public static void main(String[] args) {
	    LinkedList<String> student = new LinkedList<>();

	    student.add("Nila");
	    student.add("Arya");
	    student.add("Hari");
	    student.add("Tom");
	    student.add("Archana");
	    System.out.println("Students in MCA: " + student);

	   
	    String str = student.remove(3);
	    System.out.println("Removed student: " + str);
      
	    
	    System.out.println("Updated List: " + student);
	 
        student.clear();
 
        
        System.out.println("List after clearing all elements: " + student);
  
	  }
}
