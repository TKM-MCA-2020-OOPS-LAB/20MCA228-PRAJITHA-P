/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.io.File;

class filelist {
  public static void main(String[] args) {

    File file = new File("L:\\S2 notes\\ACN");
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}