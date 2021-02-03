/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw09.embeddedstructures;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class HW09EmbeddedStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float operand1;
        float operand2;
        int product = 0;
        float addition;
        float module;
        float table;
        float multiplier=1;
        float stop=12;
        float division;
        
        do{
        System.out.println("Please enter to operand1 and operand2");
        Scanner input = new Scanner (System.in);
        
       operand1 = input.nextInt();
       operand2 = input.nextInt();
       
       
       if (operand1 %2==0 && operand2 %2==0){
           product= (int)(operand1 * operand2);
           System.out.println("The product of " + operand1 + "*" + operand2 + " is  " + product);
                   

       }
       else {
           if (operand1 %3==0 && operand2 %3==0){
           addition= operand1 + operand2;
           System.out.println("The addition of " + operand1 + "+" + operand2 + " is  " + addition);
           
       }
           else {
               if (operand1 %7==0 && operand2 %7==0){
                   module = operand1 % operand2;
                   System.out.println("The module of " + operand1 + "%" + operand2 + " is  " + module);
               }
               else {
                if (operand1 %11==0 && operand2 %11==0){
                    if (operand1 !=0){
                    System.out.println(" -----The table of  " + operand1 + "------");
   
                   for (int i=1; multiplier <= stop; multiplier++){ 
                   table = operand1 * multiplier;
                   System.out.println("The table of " + operand1 + "*" + multiplier + " is  " + table);
                } multiplier=1;
                
                System.out.println(" -----The table of  " + operand2 + "------");
                if (operand2 !=0){
                    for (int i=1; multiplier <= stop; multiplier++){ 
                   table = operand2 * multiplier;
                   System.out.println("The table of " + operand2 + "*" + multiplier + " is  " + table);
                } multiplier=1;
                }
                
               }
           }  
                else {
                    if (operand1 %13==0 && operand2 %13==0){
                        division = operand1 / operand2;
                   System.out.println("The divition of " + operand1 + "/" + operand2 + " is  " + division);
                    }                                                  
                                         
                                  
                }                       
                     
                    }
                }
       }
        } while((operand1 %2==0 && operand2 %2==0) | (operand1 %3==0 && operand2 %3==0) | (operand1 %7==0 && operand2 %7==0) | (operand1 %11==0 && operand2 %11==0) | (operand1 %13==0 && operand2 %13==0)); 
        System.out.println("no valid option");
               
               
        }
               
           
       } 
      
