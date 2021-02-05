/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11.refactory;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class WS11Refactory {

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
                ShowMultiplication(operand1, operand2);
            }
       else {
           if (operand1 %3==0 && operand2 %3==0){
                    ShowAddition(operand1, operand2);
           }
           else {
               if (operand1 %7==0 && operand2 %7==0){
                        ShowModulus(operand1, operand2);
               }
               else {
                if (operand1 %11==0 && operand2 %11==0){
                            ShowMultiplicationTables(operand1, multiplier, stop, operand2);
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
               
        
        int fact=0;
        int number=5 ;
        fact= factorial(number);
        System.out.println("factorial of " + number + " is equal to --> "+ fact);
        
        }

    private static void ShowMultiplicationTables(float operand1, float multiplier, float stop, float operand2) {
        float table;
        if (operand1 !=0){
            System.out.println(" -----The table of  " + operand1 + "------");
            
            for (int i=1; multiplier <= stop; multiplier++){
                table = (int)(operand1 * multiplier);
                System.out.println("The table of " + operand1 + "*" + multiplier + " is  " + table);
            } multiplier=1;
            
            System.out.println(" -----The table of  " + operand2 + "------");
            if (operand2 !=0){
                for (int i=1; multiplier <= stop; multiplier++){
                    table = (int)(operand2 * multiplier);
                    System.out.println("The table of " + operand2 + "*" + multiplier + " is  " + table);
                } multiplier=1;
            }
            
        }
    }

    private static void ShowModulus(float operand1, float operand2) {
        float module;
        module = operand1 % operand2;
        System.out.println("The module of " + operand1 + "%" + operand2 + " is  " + module);
    }

    private static void ShowMultiplication(float operand1, float operand2) {
        int product;
        product= (int)(operand1 * operand2);
        System.out.println("The product of " + operand1 + "*" + operand2 + " is  " + product);
    }

    private static void ShowAddition(float operand1, float operand2) {
        float addition;
        addition= operand1 + operand2;
        System.out.println("The addition of " + operand1 + "+" + operand2 + " is  " + addition);
    }
    
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
        
    
                
        
        
           
       }
    }
}
      
