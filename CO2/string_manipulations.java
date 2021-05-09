package java_lab;

public class string_manipulations {
	public static void main(String[] args) {
		String string1 = "my";
		String string2 = "WORD";
		String string3 = string1.toUpperCase();
		String string4 = string2.toLowerCase();
		
		System.out.println("String Manipulation in Java");
		
		System.out.println("\nUsing toLowerCase() and toUpperCase()");
		System.out.println(string1 + "   to uppercase=" +string3);
		System.out.println(string2 + "   to lowercase=" +string4);
		
		System.out.println("\nUsing compareTo()");
		int i = string3.compareTo(string4);
		if(i==0){
			System.out.println(string1+ "   &   " +string2+"   are equal");
		}
		else{
			System.out.print(string1+ "   &   " +string2+"   are not equal.");
		}
		
		System.out.println("\n\nString concatenation");
		System.out.print("concatenate   "+string1+"   &   "+string2+":");
		String result = string1+string2;
		System.out.print(result);
		
		System.out.println("\n\nGetting the substring from a given string");
		String str1= "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
		System.out.println("String=Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		System.out.println("substring(0,10):");
		System.out.println(str1.substring(0,10));
		
	}
		
}
