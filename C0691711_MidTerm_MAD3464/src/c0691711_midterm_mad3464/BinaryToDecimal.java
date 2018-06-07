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
public class BinaryToDecimal 
{
     public static int binaryToDecimal(int num){
         int result =0;
         while(num>0)
         {
             
             
             int mod =num%2;
             result = result *1 +mod;
         }
     return result;
      
    
    
}
public static void main(String args[])
    {
        
            }



}

