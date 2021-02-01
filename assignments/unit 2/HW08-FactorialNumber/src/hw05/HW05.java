/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw05;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class HW05 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // DONE n!= 1*2*3*.....*(n-2)*(n-1)*n
        long factorial=1;
        long number ;
        long i;
        
             
        
            System.out.println("enter the number you want the factorial");
            Scanner input = new Scanner (System.in);
            number = input.nextLong();
            
                
             if (number <= 15){
                            
                for ( i= 1 ; i <= number  ; i++ ) {
                factorial *= i;
                }
            System.out.println("the factorial of " + number + " is iqual to " + factorial);
             }
             else {
            
             System.out.println("only admit numbers < 15");
            
             }
               
         
               
          }
    
}

