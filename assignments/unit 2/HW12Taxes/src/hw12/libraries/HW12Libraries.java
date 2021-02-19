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

                    System.out.println("Please enter the cost you want to calculate Value added tax");
                    cost = input.nextDouble();
                    ValueAddedTax = CalculateValueAddedTax(cost, iva);
                    total = CalculateTotalToPayValueAddedTax(cost, ValueAddedTax);
                    System.out.println("The Value added tax of " + cost + " is " + ValueAddedTax);
                    System.out.println(" The total you have to pay is " + total);
                    System.out.println("                                        ");
                    break;

                case 2:
                    double income;
                    double expenses;
                    double taxBase;
                    double difference;
                    double porcentage;

                    System.out.println("Please write your income");
                    income = input.nextDouble();
                    System.out.println("Plase write your expenses");
                    expenses = input.nextDouble();
                    taxBase = CalculateTaxBase(income, expenses);
                    System.out.println("yout tax base is --> " + taxBase);
                    System.out.println("                                        ");
                    if (taxBase > 0 && taxBase <= 11212) {

                        CalculateBasicFraction1(taxBase);
                        System.out.println(" The contribution is not made ");
                    } else {
                        if (taxBase > 11212 && taxBase <= 14285) {
                            total = CalculateBasicFraction2(taxBase);
                            System.out.println(" The Income Tax is " + total);
                            System.out.println("                                        ");
                        } else {
                            if (taxBase > 14285 && taxBase <= 17854) {

                                total = CalculateBasicFraction3(taxBase);
                                System.out.println(" The Income Tax is " + total);
                                System.out.println("                                        ");
                            } else {
                                if (taxBase > 17854 && taxBase <= 21442) {

                                    total = CalculateBasicFraction4(taxBase);
                                    System.out.println(" The Income Tax is " + total);
                                    System.out.println("                                        ");
                                } else {
                                    if (taxBase > 21442 && taxBase <= 42874) {

                                        total = CalculateBasicFraction5(taxBase);
                                        System.out.println(" The Income Tax is " + total);
                                        System.out.println("                                        ");
                                    } else {
                                        if (taxBase > 42874 && taxBase <= 64297) {
                                            total = CalculateBasicFraction6(taxBase);
                                            System.out.println(" The Income Tax is " + total);
                                            System.out.println("                                        ");
                                        } else {
                                            if (taxBase > 64297 && taxBase <= 85729) {

                                                total = CalculateBasicFraction7(taxBase);
                                                System.out.println(" The Income Tax is " + total);
                                                System.out.println("                                        ");
                                            } else {
                                                if (taxBase > 85729 && taxBase <= 114288) {

                                                    total = CalculateBasicFraction8(taxBase);
                                                    System.out.println(" The Income Tax is " + total);
                                                    System.out.println("                                        ");
                                                } else {
                                                    if (taxBase > 114288) {

                                                        total = CalculateBasicFraction9(taxBase);
                                                        System.out.println(" The Income Tax is " + total);
                                                        System.out.println("                                        ");
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

                            System.out.println(" Please enter how much money you will take ");
                            Money = input.nextDouble();
                            if (Money > 1200) {
                                CapitalOutflowTax = CalculateMoneyToSendTax(Money);
                                System.out.println(" The capital Outflow Tax is " + CapitalOutflowTax);
                                System.out.println("                                        ");

                            } else {
                                System.out.println(" you haven't to pay any tax ");
                                System.out.println("                                        ");
                            }
                            break;
                        case 2:

                            System.out.println("Please enter how you spend on abroad ");
                            SpendAbroad = input.nextDouble();
                            if (SpendAbroad > 5017.33) {
                                CapitalOutflowTax = CalculateMoneySpendOnAbroad(SpendAbroad);
                                System.out.println(" The capital Outflow Tax is " + CapitalOutflowTax);
                                System.out.println("                                        ");
                            } else {
                                System.out.println(" you haven't to pay any tax ");
                                System.out.println("                                        ");
                            }
                            break;

                    }

            }
        } while ((option <= 3) && (option >= 1));

    }

    private static double CalculateMoneySpendOnAbroad(double SpendAbroad) {
        double CapitalOutflowTax;
        CapitalOutflowTax = (SpendAbroad - 5017.33) * 0.05;
        return CapitalOutflowTax;
    }

    private static double CalculateMoneyToSendTax(double Money) {
        double CapitalOutflowTax;
        CapitalOutflowTax = (Money - 1200) * 0.05;
        return CapitalOutflowTax;
    }

    private static double CalculateBasicFraction9(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 114288;
        porcentage = difference * 0.35;
        total = porcentage + 22366;
        return total;
    }

    private static double CalculateBasicFraction8(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 85729;
        porcentage = difference * 0.3;
        total = porcentage + 13798;
        return total;
    }

    private static double CalculateBasicFraction7(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 64297;
        porcentage = difference * 0.25;
        total = porcentage + 8440;
        return total;
    }

    private static double CalculateBasicFraction6(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 42874;
        porcentage = difference * 0.2;
        total = porcentage + 4156;
        return total;
    }

    private static double CalculateBasicFraction5(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 21442;
        porcentage = difference * 0.15;
        total = porcentage + 941;
        return total;
    }

    private static double CalculateBasicFraction4(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 17854;
        porcentage = difference * 0.12;
        total = porcentage + 511;
        return total;
    }

    private static double CalculateBasicFraction3(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 14285;
        porcentage = difference * 0.1;
        total = porcentage + 154;
        return total;
    }

    private static double CalculateBasicFraction2(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 11212;
        porcentage = difference * 0.05;
        total = porcentage + 0;
        return total;
    }

    private static void CalculateBasicFraction1(double taxBase) {
        double difference;
        double porcentage;
        double total;
        difference = taxBase - 0;
        porcentage = difference * 0;
        total = porcentage + 0;
    }

    private static double CalculateTaxBase(double income, double expenses) {
        double taxBase;
        taxBase = income - expenses;
        return taxBase;
    }

    private static double CalculateTotalToPayValueAddedTax(double cost, double ValueAddedTax) {
        double total;
        total = cost + ValueAddedTax;
        return total;
    }

    private static double CalculateValueAddedTax(double cost, double iva) {
        double ValueAddedTax;
        ValueAddedTax = cost * iva;
        return ValueAddedTax;
    }

}
