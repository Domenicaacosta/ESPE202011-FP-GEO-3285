/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12libraries;

import static ws12libraries.WS12Libraries.getAbsoluteValue;

/**
 *
 * @author Domenica
 */
public class WS12Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //If we have the math library
       //we import and use it
       
       float squareRoot= 0.0F;
       float number = 0.0F;
       float power = 0.0F;
       float base = 0.0F;
       float exponent = 0.0F;
                      
       number = 9; // squareRoot =? --> 3
       squareRoot = (float)Math.sqrt(number);
       System.out.println(" the square of --> " + number + " is " + squareRoot);
       
       number = 49; // squareRoot -->7
        squareRoot = (float)Math.sqrt(number);
       System.out.println(" the square of --> " + number + " is " + squareRoot);
       
       number = 5; // squareRoot --> 2.23
        squareRoot = (float)Math.sqrt(number);
       System.out.println(" the square of --> " + number + " is " + squareRoot);
       
       base =3;
       exponent =2;
       //power --> 9
        squareRoot = (float)Math.pow(base, exponent);
        System.out.println(" the power of --> " + base + " raise to " + exponent + " is "+ squareRoot);
       
       base = 2;
       exponent = 4;
       //power --> 16
       squareRoot = (float)Math.pow(base, exponent);
        System.out.println(" the power of --> " + base + " raise to " + exponent + " is "+ squareRoot);
       
        base = 78;
       power = 5;
       // calculator 78^5
       //2887174368
       squareRoot = (float)Math.pow(base, exponent);
       System.out.println(" the power of --> " + base + " raise to " + exponent + " is "+ squareRoot);
        
       
       
       base = 4.0F;
       exponent = 0.5F;
       power = (float)Math.pow(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + power);
        
        
        float getAbsoluteValue = getAbsoluteValue(number);
       number = -5;
       getAbsoluteValue = getAbsoluteValue(number);
        System.out.println(" absolute value of --> " + number + " is " + getAbsoluteValue);
        
       //if we dont have de library, what would we do?
       //we should create the feature, the library
       // our own algorithm to compute the square root.
       
       
    }
    
        
    public static float computepower(float base, float exponent){
        float power;
        power = 1.0F;
        
        for (int i = 1; i <= (int)exponent; i ++){
        power= power*base;
        }
        return power;
    }
    
    
        
    public static float getAbsoluteValue(float number){
        if(number < 0){
            return -number;
            
        }else{
            return number;
        }
//        if(number < 0 ){
//            number = number*-1 ;
//                    
//                   return number;
//        }
//    return number;
    }
    
    
    
    
}

