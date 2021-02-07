/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.refactory;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class HW11Refactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        boolean rainLoop = true;
        int option;
        int demographic;
        int social;
        int m;
        int economic;
        int geographyc;
        int Quality = 0;
        int number;

        //Recursion Aplication
        System.out.println(" ‘‘ Hｅｌｌｏ’’ ");
        System.out.println(" You can get sum of n numbers ");
        System.out.println(" please enter a number   ");

        number = input.nextInt();
        int sum = 0;
        sum = AddOfnNumbers(number);
        System.out.println("sum of " + number + " first numbers is equal to --> " + sum);

        // Project
        do {

            option = ChooseMenuOptions(input);

        } while (option <= 5);

    }

    private static int ChooseMenuOptions(Scanner input) {
        int option;
        int demographic;
        int social;
        int economic;
        int geographyc;
        int Quality;
        System.out.println("%%%%%%%%%%UPDATING OF CARTOGRAPHIC DATA%%%%%%%%%%");
        System.out.println("0--->Exit");
        System.out.println("1--->Demographic data ");
        System.out.println("2--->Social datas ");
        System.out.println("3--->economic datas ");
        System.out.println("4--> geographic features");
        System.out.println("5--> quality measures");
        System.out.println("Please enter your menu option");
        option = input.nextInt();
        switch (option) {
            case 0:
                System.out.println("See you later");
                ChooseExitOption();
                break;
            case 1:
                do {
                    System.out.println("what would you like to know about Demographic datas ");
                    System.out.println("1--> What is the population of Ecuador?");
                    System.out.println("2--> Migrant Population");

                    demographic = chooseDemographicOption(input);

                    switch (demographic) {
                        case 1: {
                            choosePopulationInformation();
                            break;
                        }
                        case 2:
                            ChooseMigrantInformation();
                            break;

                    }
                } while (demographic <= 2);
            case 2:
                do {
                    System.out.println("what would you like to know about social datas");
                    System.out.println("1--> half Blood people data");
                    System.out.println("2--> montubio people data");
                    System.out.println("3--> Afro-Ecuadorian people data");
                    System.out.println("4--> indigenous poeple data");
                    System.out.println("5--> withe people data");
                    social = ChooseSocialInformation(input);
                    switch (social) {
                        case 1:
                            ChooseHalfBloodPeopleData();
                            break;
                        case 2:
                            ChooseMontubioPeopleData();
                            break;
                        case 3:
                            ChooseAfroEcuadorianPeopleData();
                            break;
                        case 4:
                            ChooseIndigenousPeopleData();
                            break;
                        case 5:
                            ChooseWithePeopleData();
                            break;

                    }

                } while (social <= 5);
            case 3:
                do {
                    System.out.println("what would you like to know about economic datas");
                    System.out.println("1-->Lower class data");
                    System.out.println("2-->vulnerable middle class data");
                    System.out.println("4-->high class");
                    economic = ChooseEconomicOption(input);

                    switch (economic) {
                        case 1:
                            ChooseLowerClassData();
                            break;
                        case 2:
                            ChooseVulnerableMiddlerClassData();
                            break;
                        case 3:
                            ChooseHighClassData();
                            break;
                    }
                } while (economic <= 4);
            case 4:
                do {
                    System.out.println("what would you like to know about geographyc features");
                    System.out.println("1--> by inclination");
                    System.out.println("2--> fluvial accidents");
                    System.out.println("3--> mountainous and glacial features");
                    System.out.println("4--> volcanic accidents");
                    geographyc = ChooseGeographycOption(input);

                    switch (geographyc) {
                        case 1:
                            ChooseGeographycFeaturesByInclinationData();
                            break;
                        case 2:
                            ChooseGeographycFeaturesFluvialAccidentsData();
                            break;
                        case 3:
                            ChooseGeographycFeaturesMountainsAndGlaciaslData();
                            break;
                        case 4:
                            ChooseGeographycFeaturesVolcaniclAccidentsData();
                            break;
                    }
                } while (geographyc <= 4);
            case 5:
                do {
                    System.out.println("what would you like to know about quality measures");
                    System.out.println("1--> Means of communication");
                    System.out.println("2--> Transportation  ");
                    System.out.println("3--> Services");
                    System.out.println("4--> Public buildings");
                    Quality = ChooseQualityOption(input);
                    switch (Quality) {
                        case 1:

                            ChooseMeansOfCommunicationData();
                            break;
                        case 2:
                            ChooseTransportationData();
                            break;
                        case 3:
                            ChooseServicesData();
                            break;
                        case 4:
                            ChoosePublicBuildingsData();
                            break;
                    }

                } while (Quality <= 4);

        }
        return option;
    }

    private static void ChoosePublicBuildingsData() {
        System.out.println(" a example of Public buildings: ");
        System.out.println(" SRI");
        System.out.println(" Hospital ");
        System.out.println(" central bank ");
        return;
    }

    private static void ChooseServicesData() {
        System.out.println(" a example of Services ");
        System.out.println(" Water ");
        System.out.println(" electricity");
        System.out.println(" sever ");
        System.out.println("national police ");
        return;
    }

    private static void ChooseTransportationData() {
        System.out.println(" a example of :Transportation  ");
        System.out.println(" Metrobus");
        System.out.println(" private car");
        return;
    }

    private static void ChooseMeansOfCommunicationData() {
        System.out.println(" a example of Means of communication:");
        System.out.println(" telephone ");
        System.out.println(" internet");
        return;
    }

    private static int ChooseQualityOption(Scanner input) {
        int Quality;
        Quality = input.nextInt();
        return Quality;
    }

    private static void ChooseGeographycFeaturesVolcaniclAccidentsData() {
        System.out.println(" a example of volcanic accidents are: ");
        System.out.println(" lava tubes in ''el sombrero chino Island'' Galapagos ");
        System.out.println(" Catopaxi Volcano ");
        System.out.println(" Sangay Volcano ");
        return;
    }

    private static void ChooseGeographycFeaturesMountainsAndGlaciaslData() {
        System.out.println(" a example of mountainous and glacial features ");
        System.out.println(" Antisana ");
        System.out.println(" Cotopaxi ");
        System.out.println(" Illinizas ");
        System.out.println(" all of them are located in volcanic craters ");
        return;
    }

    private static void ChooseGeographycFeaturesFluvialAccidentsData() {
        System.out.println(" a example of fluvial accidents are gulfs and bays: ");
        System.out.println(" Guayaquil gulf ");
        System.out.println(" Tortuga bay on Galapagos Island");
        return;
    }

    private static void ChooseGeographycFeaturesByInclinationData() {
        System.out.println(" a example of geographyc feature by inclination is an cliff ");
        System.out.println(" Puerto Baquerizo Moreno Cliff");
        System.out.println(" Jama Cliff");
        return;
    }

    private static int ChooseGeographycOption(Scanner input) {
        int geographyc;
        geographyc = input.nextInt();
        return geographyc;
    }

    private static void ChooseHighClassData() {
        System.out.println("1,1% of the population belongs to the high class");
        System.out.println("high class income is 1633,42  ");
        return;
    }

    private static void ChooseVulnerableMiddlerClassData() {
        System.out.println("65,4% of the population belongs to the vulnerable middle class data");
        System.out.println("median income is $738,81 ");
        return;
    }

    private static void ChooseLowerClassData() {
        System.out.println("33.6% of the population belongs to the lower class");
        System.out.println("median income is $ 149,71");
        return;
    }

    private static int ChooseEconomicOption(Scanner input) {
        int economic;
        economic = input.nextInt();
        return economic;
    }

    private static void ChooseWithePeopleData() {
        System.out.println("Ecuador indigenous people porcent is 6,1%");
        return;
    }

    private static void ChooseIndigenousPeopleData() {
        System.out.println("Ecuador indigenous people porcent is 7%");
        return;
    }

    private static void ChooseAfroEcuadorianPeopleData() {
        System.out.println("Ecuador Afro-Ecuadorian people porcent is 7,2%");
        return;
    }

    private static void ChooseMontubioPeopleData() {
        System.out.println("Ecuador montubios people porcent is 7,4%");
        return;
    }

    private static void ChooseHalfBloodPeopleData() {
        System.out.println("Ecuador half blood people porcent is 71,99%");
        return;
    }

    private static int ChooseSocialInformation(Scanner input) {
        int social;
        social = input.nextInt();
        return social;
    }

    private static void ChooseMigrantInformation() {
        int m;
        int k = 1183685;
        m = ((k * 100) / 17794929);
        System.out.println("there are about " + k + " migrants");
        System.out.println("it represents" + m + " % of Ecuador ");
        return;
    }

    private static void choosePopulationInformation() {
        int n = 17794929;
        int j = 8884493;
        System.out.println("The current population in Ecuador is " + n);
        System.out.println(j + " are women");
        System.out.println((n - j) + " are men");
        return;
    }

    private static int chooseDemographicOption(Scanner input) {
        int demographic;
        demographic = input.nextInt();
        return demographic;
    }

    private static void ChooseExitOption() {
        System.exit(0);
        return;
    }

    private static int AddOfnNumbers(int number) {
        int sum;

        if (number == 1) {
            return 1;

        } else {
            sum = number + AddOfnNumbers(number - 1);

        }
        return sum;
    }

}
