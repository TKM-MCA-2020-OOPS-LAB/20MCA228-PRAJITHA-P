package java_lab;

public class product {
	
	public int pcode;
	public String pname;
	public int price;
	
	public product(int pcode,String pname,int price) {
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	
	void display(){
	        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	        
	 }  

	public static void main(String[] args) {
		product ob1= new product(452,"Biscuit",600);
		product ob2= new product(853,"Cake",543);
		product ob3= new product(456,"Chips",356);
		
		
		 System.out.println("Product Information:\n Product_Code\tProduct_Name\tProduct_Price");
	        ob1.display();
	        ob2.display();
	        ob3.display();
		
		if(ob1.price<ob2.price && ob1.price<ob3.price) {
			
			System.out.println("\nLowest Price among the products="+ob1.price);
			
		}
		else if(ob2.price<ob1.price && ob2.price<ob3.price) {
			
			System.out.println("\nLowest Price among the products="+ob2.price);
		}
		else {
			System.out.println("\nLowest Price among the products="+ob3.price);
		}
			
		
		// TODO Auto-generated method stub

	}

}
