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
public class ReverseString {
    String input ="Lambton";
    char[] temp = input.toCharArray();
    int left =0;
  
   
    int right =temp.length -1;
    
    
        
   
    for(left=0; left<right ; left++ ; right--)
    {
        char t =temp [left];
        temp[left]=temp[right];
        temp[right]=t;
        
    }    
     for (char c :t)
     {
     System.out.println(c);
     System.out.println();
     }}

    
    

    
