/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab;

import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;


public class UserChoice extends Applet implements ItemListener {

    Choice uChoice;

    int rectX;
    int rectY;
    int rectWidth ;
    int rectHeight;
    String shape;
    int Selection; 

    public void init()
    {
        
        uChoice = new Choice();
        uChoice.addItem("Pick a shape to draw");
        uChoice.addItem("Draw an triangle");
        uChoice.addItem("Draw an circle");
        uChoice.addItem("Draw a rectangle");
        uChoice.addItem("Draw a square");
       
        
        add(uChoice);
        uChoice.addItemListener(this);
    }

   public void itemStateChanged (ItemEvent e){
        
         Selection = uChoice.getSelectedIndex();
         repaint();
    }

   public void paint(Graphics g){
         super.paint(g);
         g.setColor(Color.red);
          if (Selection ==1){
             
             g.drawLine(120, 130, 280, 130);
             g.drawLine(120, 130, 200, 65);
             g.drawLine(200, 65, 280, 130);
         }
         if (Selection == 2){
               g.drawOval(200, 160, 100, 100);
             
         }
        
          if (Selection == 3){  
             
                 g.drawRect(20, 60, 200, 40);
         }
         if (Selection == 4){
        	 g.drawRect(100,100,200,200);
         }
   }
}
