/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayquiz;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class ArrayQuiz {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // Name and Age of customers
        Scanner input = new Scanner(System.in);
        String names;
        int[] customers;
        int[] ages = {15, 59, 46, 20, 78, 62};
        int customer;
        int age;
       
        

        System.out.print("Enter the number of customer --> ");
        customer = input.nextInt();
        customers = new int[customer];
        //Customer [0] = Juan
        //Customer [1] = María
        //Customer [2] = Lola
        //Customer [3] = Fernando
        //Customer [4] = Karen
        //Customer [5] = Diego
       
        for (int i = 0; i < customer; i++) {
            System.out.print("Please enter the names of customers " + (i + 1) + " -> ");
            names = input.nextLine();

        }
        
        for (int i = 0; i < ages.length ; i++) {
            System.out.println("the age pf customer " + (i + 1) + " -> " + ages);
        }

    }

}
