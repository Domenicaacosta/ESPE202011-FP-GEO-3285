/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21.functions;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int hour;
        int ignitionWatts;
        int shutdownWatts;
        int totalConsumePerDay;

        System.out.println("AUTHOR: DOMENICA ACOSTA");                
        System.out.println("-------------------**-------------------------");
        System.out.println("HOW MUCH ENERGY DOES YOUR PC CONSUME?");
        System.out.println("-------------------**-------------------------");

        System.out.println("");
        System.out.println("Please enther the number of hours your PC is on");
        hour = input.nextInt();
        ignitionWatts = calculateIgnitionWatts(hour);
        shutdownWatts = calculateShutdownWatts(hour);
        totalConsumePerDay = calculateTotalConsumePerDay(ignitionWatts, shutdownWatts);
        System.out.println("Your PC on consume " + ignitionWatts + "W per day");
        System.out.println("Your PC off consume " + shutdownWatts + "W per day");
        System.out.println("The total consume per day of your PC is " + totalConsumePerDay + "W");

    }

    private static int calculateTotalConsumePerDay(int ignitionWatts, int shutdownWatts) {
        int totalConsumePerDay;
        totalConsumePerDay = (ignitionWatts + shutdownWatts);
        return totalConsumePerDay;
    }

    private static int calculateShutdownWatts(int hour) {
        int shutdownWatts;
        shutdownWatts = 4 * (24 - hour);
        return shutdownWatts;
    }

    private static int calculateIgnitionWatts(int hour) {
        int ignitionWatts;
        ignitionWatts = 220 * hour;
        return ignitionWatts;
    }

}
