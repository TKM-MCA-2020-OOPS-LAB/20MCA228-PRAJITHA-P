import java.net.*; 
import java.io.*;

public class Client {
      public static void main(String args[]) throws Exception{
 

	try {
		 Socket s = new Socket ("localhost", 2665);
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		pw.println("Hello Server!! How are you?");
		
		InputStreamReader isr = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		String str= br.readLine();
		System.out.println("Message from Server: "+str);
		pw.close();
		s.close();
	  }
	catch(Exception e) {
		System.out.println("An error occured..." +e);
              }
      }
}	

import java.net.*;
import java.io.*;
public class Server {
        public static void main(String[] args) throws Exception {

try {
ServerSocket ss = new ServerSocket(2665);
System.out.println("Server is waiting for the client	");
Socket s = ss.accept();
System.out.println("CONNECTION ESTABLISHED !!!");
InputStreamReader isr = new InputStreamReader(s.getInputStream());
BufferedReader br = new BufferedReader(isr);
String str = br.readLine();
System.out.println("Message from Client: "+str);
//Server is responding through its OutputStream
PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
pw.println("Hi Client!! I'm good.");
pw.close();
}
catch(Exception e) {
             System.out.println("An error occured.."+e);
}
     }
}
