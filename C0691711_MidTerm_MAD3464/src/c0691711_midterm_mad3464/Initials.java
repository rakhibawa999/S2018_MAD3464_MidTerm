/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0691711_midterm_mad3464;

/**
 *
 * @author macstudent
 */
public class Initials {
    
    
     
    static void printInitials(String name)
    {
        if (name.length() == 0)
            return;
 
        
        System.out.print(Character.toUpperCase(
            name.charAt(0)));
 
       
        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(
         name.charAt(i + 1)));
    }
 
   
    public static void main(String args[])
    {
        String name = "rakhi bawa";
        printInitials(name);
    }
}
    

