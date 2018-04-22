/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaa6;

import javax.swing.JOptionPane;
import javax.swing.*; 

/**
 *
 * @author γοργόνα
 */
public class JavaA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String in;
         int m=0, p;
        char ch='a';
        in=JOptionPane.showInputDialog("Δώσατε ένα αλφαριθμητικό: ");
        in=in.toLowerCase().trim(); 
        for (int i=0;i<in.length();i++) 
        {
            if (in.charAt(i)>ch) 
                  ch=in.charAt(i);
        }
        for (int i=0;i<in.length();i++) 
            {
              if (in.charAt(i)==ch)
                 {
                    ch=in.charAt(i);
                    m=m+1;
                 }
            }
        p=in.indexOf("ch")+2;
    System.out.println("Το μεγαλύτερο γράμμα είναι το: " + ch + ",εμφανίζεται " + m + " φορές και η πρώτη του εμφάνιση είναι στη θέση " + p );
    System.exit(0);
    }   
}