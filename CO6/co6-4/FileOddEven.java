/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandling;

import java.io.*;
import java.io.IOException;

public class FileOddEven{

	 public static void main(String args[]) throws IOException{ 
             
                      
                             FileInputStream num = new FileInputStream("L:\\Test\\numbers.txt");
                             FileOutputStream odd = new FileOutputStream("L:\\Test\\OddNumbers.txt");
                             FileOutputStream even = new FileOutputStream("L:\\Test\\EvenNumbers.txt");
                             System.out.println("Odd numbers and Even numbers are  ..copied to separate files"); 
                             int i;
                             while((i=num.read()) != -1)   {
                                      if(i%2==0)
                                                 even.write(i);
                                      else
                                                 odd.write(i);
                              }

                              num.close();
                              odd.close();
                              even.close();
                        

                    }
}

