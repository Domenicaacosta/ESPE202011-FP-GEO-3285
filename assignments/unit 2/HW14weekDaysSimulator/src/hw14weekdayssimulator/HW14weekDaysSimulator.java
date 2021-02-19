/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14weekdayssimulator;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class HW14weekDaysSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);

        System.out.println(" please enter de name of the day ");

        for (String weekDay : weekDays) {
            System.out.println("The name of the days of the week are -> " + weekDay);
        }
        int[] familyMembers;
        int n;
        System.out.println("Enter the family last name  -> ");
        n = input.nextInt();

        familyMembers = new int[n];
//         familyMembers[0] = 6;
//         familyMembers[1] = 5;
//         familyMembers[2] = 3;
//         familyMembers[3] = 7;
//         familyMembers[4] = 8;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter how many members are in the family " + (i + 1) + " -> ");
            familyMembers[i] = input.nextInt();
        }
        for (int familyMember : familyMembers) {
            System.out.println("family members are " + familyMember);
        }
        
        float [] monthlyIncomePerFamily ={1200F, 690.53F, 865.56F, 480.65F, 543.65F };
        for (int i = 0; i < monthlyIncomePerFamily.length ; i++) {
            System.out.println("Monthly income per family " + (i + 1) + " -> " + monthlyIncomePerFamily[i]);
        }
    }

}
