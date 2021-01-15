/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean rainLoop = true;
        int option;
        
        do {
            System.out.println("====Calculaator====");
            System.out.println(" 1 --> Addition");
            System.out.println(" 2 --> Subtraction");
            System.out.println("3 --> Multiplication");
            System.out.println("4 --> Division");
            System.out.println("5 --> Exit");
            
            System.out.println("Enter your menu option");
            option = input.nextInt();
            
            switch(option) {
                
                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 --> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 --> ");
                    addend2 = input.nextInt();
                    sum= addend1 + addend2;
                    System.out.println("the sum is --> " + sum );
                    break;
                case 2:
                    int minuend;
                    int subtrahend;
                    int subtraction;
                    System.out.println("Enter minuend --> ");
                    minuend = input.nextInt();
                    System.out.println("Enter subtrahend --> ");
                    subtrahend = input.nextInt();
                    subtraction = minuend - subtrahend;
                    System.out.println("The subtraction is --> " + subtraction);
                    break;
                case 3:
                    int factor1;
                    int factor2;
                    int multiplication;
                    System.out.println("Enter factor 1 --> ");
                    factor1 = input.nextInt();
                    System.out.println("Enter factor 2 --> ");
                    factor2 = input.nextInt();
                    multiplication = factor1 * factor2;
                    System.out.println("The multiplication is --> " + multiplication );
                    break;
                case 4:
                    float dividend;
                    float divider;
                    float division;
                    System.out.println("Enter dividend --> ");
                    dividend = input.nextFloat();
                    System.out.println("Enter divider --> ");
                    divider = input.nextFloat();
                    division = dividend/divider;
                    System.out.println("The division is --> " + division );
                    break;
                case 5:
                    System.out.println("See you later");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
                                   
                            
                
            }
                    
                    
            
        } while (option != 5);
    }
    
}
