/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acostadomenicaexamunit1;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class AcostaDomenicaExamUnit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        boolean rainLoop = true;
        int option;
        
        do{
            System.out.println("=== MULTIPLICATION TABLES ===");
            System.out.println("1 --> continue multiplying");
            System.out.println("0---> exit");
            
            System.out.println("enter the menu option");
            option = input.nextInt();
            
            switch(option){
                
                    
                case 1:
                        int top=12;
                        int product=0;
                        int i;
                        System.out.println("enter the table that you want to study ");
                        int table = input.nextInt() ;
                        for (i = 1 ; i <= top ; i++){
                        product = table *i;
                
                        System.out.println(table + "*" + i + " = " + product);}                    
                        break;
            
                case 0:
                        System.out.println("good bye");
                        System.exit(0);
                        break;
                        
                default:
                    System.out.println("No valid option");
                    break;
            }
                        
                        
                        
                        
        
        
        
        
      } while(option != 3); 
    } 
}
    
