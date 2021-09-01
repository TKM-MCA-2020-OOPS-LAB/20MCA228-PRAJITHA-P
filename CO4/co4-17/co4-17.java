import java.util.*;
public class Mapinterface {
		public static void main(String args[])
	    {
	       
	        Map<Integer, String> hm1 = new HashMap<>();
	  
	        hm1.put(1, "Naveen");
	        hm1.put(2, "Glory");
	        hm1.put(3, "Sajo");
	        System.out.println("Initial Map: "+ hm1);
	        
	        hm1.put( (2), "Libin");
	        hm1.put((4), "Amily");
	     
	        System.out.println("Updated Map " + hm1);
	  
	        hm1.remove(4);
	  
	        System.out.println("After Removing 4th entry, Final Map  is : "+hm1);
	    
	    }
	}