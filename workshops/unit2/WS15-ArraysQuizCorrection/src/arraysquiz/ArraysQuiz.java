/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysquiz;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class ArraysQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalOfPlayers = 0;
        String[] players;
        float[] goalAverages;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of records --> ");
        totalOfPlayers = scanner.nextInt();

        players = new String[totalOfPlayers];
        goalAverages = new float[totalOfPlayers];

        for (int i = 0; i < totalOfPlayers; i++) {
            System.out.println("Please enter the name of the player # " + i);
            players[i] = scanner.nextLine();
            System.out.print(" Please enter " + players[i] + "goal average");
            goalAverages[i] = scanner.nextFloat();

        }
        System.out.println("Player --> /t   goal average" );
        
        for (int i = 0; i < totalOfPlayers; i++) {
            System.out.println(players[i] + " /t " + goalAverages[i]);

        }
        
        //Excercise 1 correction
        
        int customers = 0;
        String[] names;
        int[] ages;
        
        System.out.print("Please enter the number of customers --> ");
        customers = scanner.nextInt();
        
        names = new String [customers];
        ages = new int [customers];
        
        for (int i =0 ; i < customers; i++){
        scanner.nextLine();
            System.out.println("Please enter the name of customer " + i );
            names[i] = scanner.nextLine();
            System.out.println("Please enter " + names [i] + " age");
            ages [i]= scanner.nextInt();
        }
        
        System.out.println("name -->     age-->");
        for (int i =0; i < customers; i++ ){
            System.out.println(" --> " + ages[i]);
        }
        

    }

}
