/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.libraries;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class HW12Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculate iva
        Scanner input = new Scanner(System.in);

        int option;

        System.out.println(" .     .     .     .     .   .   ");
        System.out.println("  𝓦𝓔𝓛𝓒𝓞𝓜𝓔 𝓣𝓞 𝓜𝓨 𝓟𝓡𝓞𝓖𝓡𝓐𝓜  ");
        System.out.println(" .     .     .     .     .   .   ");
        System.out.println("                                  ");

        do {
            System.out.println(" 𝓦𝓴𝓪𝓽 𝓭𝓸 𝔂𝓸𝓿 𝔀𝓪𝓷𝓽 𝓽𝓸  𝓬𝓪𝓵𝓬𝓿𝓵𝓪𝓽𝓮?");
            System.out.println("𝟏 --➤   Value Added Tax ");
            System.out.println("𝟐 --➤   Income Tax ");
            System.out.println("𝟑 --➤   Capital Outflow Tax ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    double cost;
                    double iva;
                    double ValueAddedTax;
                    double total;
                    iva = 0.12;

                    CalculateValueAddedTax(input, iva);
                    break;

                case 2:
                    double income;
                    double expenses;
                    double taxBase;
                    double difference;
                    double porcentage;

                    taxBase = CalculatetaxBase(input);

                    if (taxBase > 0 && taxBase <= 11212) {
                        CalculateBasicFraction1(taxBase);
                    } else {
                        if (taxBase > 11212 && taxBase <= 14285) {
                            CalculateBasicFraction2(taxBase);

                        } else {
                            if (taxBase > 14285 && taxBase <= 17854) {
                                CalculateBasicFraction3(taxBase);

                            } else {
                                if (taxBase > 17854 && taxBase <= 21442) {
                                    CalculateBasicFraction4(taxBase);

                                } else {
                                    if (taxBase > 21442 && taxBase <= 42874) {
                                        CalculateBasicFraction5(taxBase);
                                    } else {
                                        if (taxBase > 42874 && taxBase <= 64297) {
                                            CalculateBasicFraction6(taxBase);
                                        } else {
                                            if (taxBase > 64297 && taxBase <= 85729) {
                                                CalculateBasicFraction7(taxBase);
                                            } else {
                                                if (taxBase > 85729 && taxBase <= 114288) {
                                                    CalculateBasicFraction8(taxBase);
                                                } else {
                                                    if (taxBase > 114288) {
                                                        CalculateBasicFraction9(taxBase);
                                                    }

                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                    break;
                case 3:
                    double Money;
                    double CapitalOutflowTax;
                    int selection;
                    double SpendAbroad;
                    System.out.println("Please select the option ");
                    System.out.println(" 1 --> Carry or Send Money ");
                    System.out.println(" 2 --> Buy abroad ");
                    selection = input.nextInt();

                    switch (selection) {
                        case 1:
                            calculateTaxToSendMoney(input);
                            break;
                        case 2:
                            CalculateMoneySpendOnAbroad(input);
                            break;

                    }

            }
        } while ((option <= 3) && (option >= 1));

    }

    private static void CalculateMoneySpendOnAbroad(Scanner input) {
        double SpendAbroad;
        double CapitalOutflowTax;
        System.out.println("Please enter how you spend on abroad ");
        SpendAbroad = input.nextDouble();
        if (SpendAbroad > 5017.33) {
            CapitalOutflowTax = (SpendAbroad - 5017.33) * 0.05;
            System.out.println(" The capital Outflow Tax is " + CapitalOutflowTax);
        } else {
            System.out.println(" you haven't to pay any tax ");
        }
        return;
    }

    private static void calculateTaxToSendMoney(Scanner input) {
        double Money;
        double CapitalOutflowTax;
        System.out.println(" Please enter how much money you will take ");
        Money = input.nextDouble();
        if (Money > 1200) {
            CapitalOutflowTax = (Money - 1200) * 0.05;
            System.out.println(" The capital Outflow Tax is " + CapitalOutflowTax);

        } else {
            System.out.println(" you haven't to pay any tax ");
        }
        return;
    }

    private static void CalculateBasicFraction9(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 114288;
        porcentage = difference * 0.35;
        total = porcentage + 22366;
        System.out.println(" The Income Tax is " + total);
    }

    private static void CalculateBasicFraction8(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 85729;
        porcentage = difference * 0.3;
        total = porcentage + 13798;
        System.out.println(" The Income Tax is " + total);
    }

    private static void CalculateBasicFraction7(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 64297;
        porcentage = difference * 0.25;
        total = porcentage + 8440;
        System.out.println(" The Income Tax is " + total);
    }

    private static void CalculateBasicFraction6(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 42874;
        porcentage = difference * 0.2;
        total = porcentage + 4156;
        System.out.println(" The Income Tax is " + total);
    }

    private static void CalculateBasicFraction5(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 21442;
        porcentage = difference * 0.15;
        total = porcentage + 941;
        System.out.println(" The Income Tax is " + total);
    }

    private static void CalculateBasicFraction4(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 17854;
        porcentage = difference * 0.12;
        total = porcentage + 511;
        System.out.println(" The Income Tax is " + total);
    }

    private static void CalculateBasicFraction3(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 14285;
        porcentage = difference * 0.1;
        total = porcentage + 154;
        System.out.println(" The Income Tax is " + total);
    }

    private static void CalculateBasicFraction2(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 11212;
        porcentage = difference * 0.05;
        total = porcentage + 0;
        System.out.println(" The Income Tax is " + total);
    }

    private static void CalculateBasicFraction1(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 0;
        porcentage = difference * 0;
        total = porcentage + 0;
        System.out.println(" The contribution is not made ");
    }

    private static double CalculatetaxBase(Scanner input) {
        double income;
        double expenses;
        double taxBase;
        System.out.println("Please write your income");
        income = input.nextDouble();
        System.out.println("Plase write your expenses");
        expenses = input.nextDouble();
        taxBase = income - expenses;
        System.out.println("yout tax base is --> " + taxBase);
        return taxBase;
    }

    private static void CalculateValueAddedTax(Scanner input, double iva) {
        double cost;
        double ValueAddedTax;
        double total;
        System.out.println("Please enter the cost you want to calculate Value added tax");
        cost = input.nextDouble();
        ValueAddedTax = cost * iva;
        total = cost + ValueAddedTax;
        System.out.println("The Value added tax of " + cost + " is " + ValueAddedTax);
        System.out.println(" The total you have to pay is " + total);
        System.out.println("                                        ");
        return;
    }

}
