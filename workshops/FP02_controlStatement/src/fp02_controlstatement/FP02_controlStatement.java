/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatement;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class FP02_controlStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Please enter an integer --");
        
        int num;
        num = scanner.nextInt();
        
        if (num % 2 == 0) {
           System.out.println("  The number entered is even--" + num );
        } else {
            System.out.println("The number entered is odd--" +num);
        }
        
    }
    
}
