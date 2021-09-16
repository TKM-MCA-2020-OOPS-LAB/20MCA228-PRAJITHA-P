/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandling;

import java.io.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class FileCopy{
 
	public static void main(String[] args) {
 
		try {
			FileReader fr = new FileReader("L:\\Test\\file.txt");
			BufferedReader br = new BufferedReader(fr);
                        
			FileWriter fw = new FileWriter("L:\\Test\\fileCopy.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s+"\n"); // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
                                                 System.out.println("file copied");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}