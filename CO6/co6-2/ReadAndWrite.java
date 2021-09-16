/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandling;
import  java.io.*;

public class ReadAndWrite {
    public static void main(String []args){
       
        try{
        
                File f= new File("L:\\Test\\output.txt");
                
                if(f.createNewFile()){
                    System.out.println(f.getName());
                }
                else{
                      System.out.println("File already exist");
                }
                
                FileWriter fw=new FileWriter(f);
                fw.write("Java is a programming language");
                fw.close();
                System.out.println("Successfully wrote to the file");
        
                FileReader fr=new FileReader(f);
                BufferedReader br=new  BufferedReader(fr);
                String s;
                while((s = br.readLine())  != null){
                            
                        System.out.println(s);
                 }
                br.close();
                fr.close();
               
        }
        catch(Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        
        
    }
    
}
