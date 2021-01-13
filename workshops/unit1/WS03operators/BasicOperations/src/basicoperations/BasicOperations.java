/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Domenica
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int adden1;
        int adden2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int multiplication;              
        int multiplicand;
        int multiplier;
        
        int division;
        int dividend;
        int divider;
        int quotient;
        int module;
        
              
        // -23 - (-6) = -23 + 6 = -17
        // initilization
        adden1 = 5;
        adden2 = 18;
        
        minuend = -23;
        subtrahend = -6;
        
        multiplicand = 4;
        multiplier = 5;
        
        dividend = 20;
        divider = 4;
        
        
                
        
        // operation
        sum = adden1 + adden2;
        
        System.out.println("The addition of  " + adden1 + "+"  + adden2 + "is iqual to --> " + sum);
        
        ++sum;
        System.out.println("sum is iqual to --> " + sum);
        
        sum++;
        System.out.println("sum is iqual to --> " + sum);
        
        System.out.println("adding one to sum" + (sum++));
        
        System.out.println("adding one to sum " + (++sum));
        
        System.out.println("the subtratcion of  " + minuend + " - " + subtrahend + " is equal to " + (minuend - subtrahend));
        
        System.out.println("the multiplication of  " + multiplicand + " * " + multiplier + " is equal to " + (multiplicand * multiplier));
        
        System.out.println("the quotient of " + dividend + " / " + divider + " is iqual to " + (dividend / divider));
       
        System.out.println("the module of " + dividend + " % " + divider + " is iqual to " + (dividend % divider));
                
    }
    
}
