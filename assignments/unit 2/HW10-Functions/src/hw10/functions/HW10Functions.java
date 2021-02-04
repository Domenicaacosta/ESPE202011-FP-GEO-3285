/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.functions;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x;
        int y=0;
        int dividend;
        int dividier;
        float quotient=0;
       int multiplicand;
       int stop=12;
       int product;
        
        
        
        
        System.out.println("┏ー∪∪━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓"); 
        System.out.println("♡∙   -WELCOME TO DOMENICA'S PROGRAM-   ∙♡");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
       
       System.out.println(" ➤ Please enter 2 numbers to do division 🡳 ");
        Scanner input = new Scanner(System.in);
        dividend = input.nextInt();
        dividier = input.nextInt();
        
        quotient = dividenumbers(dividend, dividier);
        System.out.println(" Quotient of " + dividend + " and " + dividier + " is ╰─►  " + quotient);
        
        
        System.out.println(" ➤ Please enter a number to do g(x)=x*x +2*x + 1  🡳 ");
        x= input.nextInt();
        y=g(x);
        System.out.println("x*x +2*x + 1 is equal to ╰─► " + y);
        
        
        System.out.println(" ➤ Please enter a number to do f(x)= x^x   🡳 ");
        x =input.nextInt();
        y=f(x);
        System.out.println("x^x is equal to ╰─► " + y);
        
        
        System.out.println(" ➤ Please enter a number you want the table 🡳 ");
             multiplicand=input.nextInt();
             
             for (int multiplier = 1; multiplier <= stop; multiplier++) {
                
            product= PracticeMultiplication(multiplier, multiplicand);
            
            System.out.println(multiplicand + " x " + multiplier + " = " + product);
    }
             System.out.println(" ✼✼✼✼See you later✼✼✼✼ ");
    }
        
        
        public static float dividenumbers(int dividend, int dividier){
            
            float quotient=0.0F;
                    
            quotient = (float) dividend / (float)dividier;
                    
            return quotient;
        }
        
        public static int g(int x){
            int y=0;
            
                    y= x*x +2*x + 1;
                    return y;
        }
        
        public static int f(int x){
            int y=0;
            
            y=x*x;
            return y;
        }
        
        public static int PracticeMultiplication (int multiplicand, int multiplier){
            int product=0;
        
            
           product = multiplicand * multiplier;
            
            return product;
            
            
        }

     
    }
    


