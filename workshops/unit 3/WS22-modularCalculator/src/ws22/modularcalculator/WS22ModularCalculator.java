/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22.modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;

/**
 *
 * @author Domenica
 */
public class WS22ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //las 3 variables viven en el main (es el alcance de las variables)
        float opperand1;
        float Opperand2;
        float result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers");
        opperand1 = input.nextFloat();
        Opperand2 = input.nextFloat();

        System.out.println("---ADDITION---");
        result = BasicOperation.addTwoNumbers(opperand1, Opperand2);
        System.out.println("The sum of " + opperand1 + " + " + Opperand2 + " is equal to " + result);

        System.out.println("---SUBTRACTION----");
        result = BasicOperation.subtractTwoNumbers(opperand1, Opperand2);
        System.out.println("The subtraction of " + opperand1 + " - " + Opperand2 + " is equal to " + result);

        System.out.println("---MULTIPLICATION----");
        result = BasicOperation.multiplicateTwoNumbers(opperand1, Opperand2);
        System.out.println("The subtraction of " + opperand1 + " * " + Opperand2 + " is equal to " + result);
        
        System.out.println("---DIVISION----");
        result = BasicOperation.divideTwoNumbers(opperand1, Opperand2);
        System.out.println("The subtraction of " + opperand1 + " / " + Opperand2 + " is equal to " + result);

    }

}
