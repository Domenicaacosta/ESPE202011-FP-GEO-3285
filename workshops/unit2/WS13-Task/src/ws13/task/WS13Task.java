/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // AREA OF GEOMETRIC FIGURES
        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • ");
        System.out.println("• • • • 𝓦𝓔𝓛𝓒𝓞𝓜𝓔 𝓣𝓞 𝓓𝓞𝓜𝓔𝓝𝓘𝓒𝓐'𝓢 𝓟𝓡𝓞𝓖𝓡𝓐𝓜 • • • • •");
        System.out.println("• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • ");

        do {
            System.out.println(" 𝒫𝓁𝑒𝒶𝓈𝑒 𝓈𝑒𝓁𝑒𝒸𝓉 𝓉𝒽𝑒 𝑜𝓅𝓉𝒾𝑜𝓃 𝓎𝑜𝓊 𝓌𝒶𝓃𝓉 ");
            System.out.println("                                   ");
            System.out.println(" 1 --> 𝘈𝘳𝘦𝘢 𝘰𝘧 𝘨𝘦𝘰𝘮𝘦𝘵𝘳𝘪𝘤 𝘧𝘪𝘨𝘶𝘳𝘦𝘴 ");
            System.out.println(" 2-->  𝘱𝘩𝘺𝘴𝘪𝘤 𝘧𝘰𝘳𝘮𝘶𝘭𝘢𝘴 ");
            System.out.println(" 0 --> 𝘦𝘹𝘪𝘵 ");

            option = input.nextInt();

            switch (option) {
                case 0:
                    System.out.println(" 𝘚𝘦𝘦 𝘺𝘰𝘶 𝘭𝘢𝘵𝘦𝘳 ");
                    System.exit(0);
                    break;

                case 1:
                    int figure;
                    do {
                        System.out.println(" 𝒫𝓁𝑒𝒶𝓈𝑒 𝓈𝑒𝓁𝑒𝒸𝓉 𝓌𝒽𝒶𝓉 𝒶𝓇𝑒𝒶 𝓎𝑜𝓊 𝓌𝒶𝓃𝓉 𝓉𝑜 𝒸𝒶𝓁𝒸𝓊𝓁𝒶𝓉𝑒 ");
                        System.out.println("                                   ");
                        System.out.println(" 1 --> 𝘊𝘪𝘳𝘤𝘭𝘦 𝘢𝘳𝘦𝘢      ⬤ ");
                        System.out.println(" 2-->  𝘱𝘦𝘯𝘵𝘢𝘨𝘰𝘯 𝘢𝘳𝘦𝘢   ⬟ ");
                        System.out.println(" 3 --> 𝘳𝘩𝘰𝘮𝘣𝘶𝘴 𝘢𝘳𝘦𝘢    ◆ ");

                        figure = input.nextInt();

                        switch (option) {

                            case 1:
                                double radio;
                                double circleArea;

                                calculateCircleArea(input);
                                break;
                            case 2:
                                double perimeter;
                                double apothem;
                                double pentagonArea;

                                calculatePentagonArea(input);
                                break;
                            case 3:
                                double majorDiagonal;
                                double minorDiagonal;
                                double rhombusArea;

                                calculateRhombusArea(input);
                                break;

                        }

                    } while (figure > 1 && figure <= 3);
                    break;
                case 2:
                    int formula;
                    do {
                        System.out.println(" 𝒫𝓁𝑒𝒶𝓈𝑒 𝓈𝑒𝓁𝑒𝒸𝓉 𝓌𝒽𝒶𝓉 𝒹𝑜 𝓎𝑜𝓊 𝓌𝒶𝓃𝓉 𝒸𝒶𝓁𝒸𝓊𝓁𝒶𝓉𝑒 ");
                        System.out.println("                                   ");
                        System.out.println(" 1-->  𝘊𝘢𝘭𝘤𝘶𝘭𝘢𝘵𝘦 𝘍𝘰𝘳𝘤𝘦 ");
                        System.out.println(" 2 --> 𝘊𝘢𝘭𝘶𝘭𝘢𝘵𝘦 𝘧𝘳𝘪𝘤𝘵𝘪𝘰𝘯 𝘧𝘰𝘳𝘤𝘦 ");
                        System.out.println(" 3-->  𝘊𝘢𝘭𝘤𝘶𝘭𝘢𝘵𝘦 𝘐𝘮𝘱𝘶𝘭𝘴𝘦 ");
                        formula = input.nextInt();
                        switch (option) {
                            case 1:
                                double mass;
                                double aceleration;
                                double force;

                                calculateForce(input);
                                break;
                            case 2:
                                double frictionCoefficient;
                                double normalForce;
                                double frictionForce;

                                calculateFrictionForce(input);
                                break;
                            case 3:
                                double impulseForce;
                                double time;
                                double impulse;

                                calculateImpulse(input);
                                break;

                        }
                    } while (formula >= 1 && formula <= 3);

            }
            {

            }
        } while (option > 0 && option <= 2);

    }

    private static void calculateImpulse(Scanner input) {
        double impulseForce;
        double time;
        double impulse;
        System.out.println(" 𝘠𝘰𝘶 𝘤𝘩𝘰𝘰𝘴𝘦 𝘵𝘩𝘪𝘴 𝘰𝘱𝘵𝘪𝘰𝘯 𝘵𝘰 𝘤𝘢𝘭𝘤𝘶𝘭𝘢𝘵𝘦 𝘵𝘩𝘦 𝘪𝘮𝘱𝘶𝘭𝘴𝘦 ");
        System.out.println("𝘱𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘵𝘩𝘦 𝘧𝘰𝘳𝘤𝘦 ");
        impulseForce = input.nextDouble();
        System.out.println(" 𝘱𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘵𝘩𝘦 𝘵𝘪𝘮𝘦 ");
        time = input.nextDouble();
        impulse = impulseForce * time;
        System.out.println(" 𝘵𝘩𝘦 𝘪𝘮𝘱𝘶𝘭𝘴𝘦 𝘪𝘴 " + impulse);
        return;
    }

    private static void calculateFrictionForce(Scanner input) {
        double frictionCoefficient;
        double normalForce;
        double frictionForce;
        System.out.println(" 𝘠𝘰𝘶 𝘤𝘩𝘰𝘰𝘴𝘦 𝘵𝘩𝘪𝘴 𝘰𝘱𝘵𝘪𝘰𝘯 𝘵𝘰 𝘤𝘢𝘭𝘤𝘶𝘭𝘢𝘵𝘦 𝘵𝘩𝘦 𝘧𝘳𝘪𝘤𝘵𝘪𝘰𝘯 𝘧𝘰𝘳𝘤𝘦 ");
        System.out.println(" 𝘱𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘵𝘩𝘦 𝘤𝘰𝘦𝘧𝘧𝘪𝘤𝘪𝘦𝘯𝘵 𝘰𝘧 𝘧𝘳𝘪𝘤𝘵𝘪𝘰𝘯 ");
        frictionCoefficient = input.nextDouble();
        System.out.println(" 𝘱𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘥𝘦 𝘯𝘰𝘳𝘮𝘢𝘭 𝘧𝘰𝘳𝘤𝘦 ");
        normalForce = input.nextDouble();
        frictionForce = frictionCoefficient * normalForce;
        System.out.println(" 𝘛𝘩𝘦 𝘧𝘳𝘪𝘤𝘵𝘪𝘰𝘯 𝘧𝘰𝘳𝘤𝘦 𝘪𝘴 " + frictionForce);
        return;
    }

    private static void calculateForce(Scanner input) {
        double mass;
        double aceleration;
        double force;
        System.out.println(" 𝘠𝘰𝘶 𝘤𝘩𝘰𝘰𝘴𝘦 𝘵𝘩𝘪𝘴 𝘰𝘱𝘵𝘪𝘰𝘯 𝘵𝘰 𝘤𝘢𝘭𝘤𝘶𝘭𝘢𝘵𝘦 𝘵𝘩𝘦 𝘧𝘰𝘳𝘤𝘦 ");
        System.out.println(" 𝘱𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘵𝘩𝘦 𝘮𝘢𝘴𝘴 ");
        mass = input.nextDouble();
        System.out.println(" 𝘱𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘵𝘩𝘦 𝘢𝘤𝘦𝘭𝘦𝘳𝘢𝘵𝘪𝘰𝘯");
        aceleration = input.nextDouble();
        force = mass * aceleration;
        System.out.println(" 𝘵𝘩𝘦 𝘧𝘰𝘳𝘤𝘦 𝘪𝘴 " + force);
        return;
    }

    private static void calculateRhombusArea(Scanner input) {
        double majorDiagonal;
        double minorDiagonal;
        double rhombusArea;
        System.out.println(" 𝘠𝘰𝘶 𝘤𝘩𝘰𝘰𝘴𝘦 𝘵𝘩𝘪𝘴 𝘰𝘱𝘵𝘪𝘰𝘯 𝘵𝘰 𝘤𝘢𝘭𝘤𝘶𝘭𝘢𝘵𝘦 𝘵𝘩𝘦 𝘢𝘳𝘦𝘢 𝘰𝘧 𝘳𝘩𝘰𝘮𝘣𝘶𝘴 ");
        System.out.println(" 𝘱𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘵𝘩𝘦 𝘮𝘢𝘫𝘰𝘳 𝘥𝘪𝘢𝘨𝘰𝘯𝘢𝘭 ");
        majorDiagonal = input.nextDouble();
        System.out.println(" 𝘱𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘵𝘩𝘦 𝘮𝘪𝘯𝘪𝘰𝘳 𝘥𝘪𝘢𝘨𝘰𝘯𝘢𝘭 ");
        minorDiagonal = input.nextDouble();
        rhombusArea = (majorDiagonal * minorDiagonal) / 2;
        System.out.println(" 𝘵𝘩𝘦 𝘢𝘳𝘦𝘢 𝘰𝘧 𝘳𝘩𝘰𝘮𝘣𝘶𝘴 𝘪𝘴 " + rhombusArea);
        return;
    }

    private static void calculatePentagonArea(Scanner input) {
        double perimeter;
        double apothem;
        double pentagonArea;
        System.out.println("𝘠𝘰𝘶 𝘤𝘩𝘰𝘰𝘴𝘦 𝘵𝘩𝘪𝘴 𝘰𝘱𝘵𝘪𝘰𝘯 𝘵𝘰 𝘤𝘢𝘭𝘤𝘶𝘭𝘢𝘵𝘦 𝘵𝘩𝘦 𝘢𝘳𝘦𝘢 𝘰𝘧 𝘱𝘦𝘯𝘵𝘢𝘨𝘰𝘯 ");
        System.out.println(" 𝘱𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘵𝘩𝘦 𝘱𝘦𝘳𝘪𝘮𝘦𝘵𝘦𝘳 ");
        perimeter = input.nextDouble();
        System.out.println(" 𝘱𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘵𝘩𝘦 𝘢𝘱𝘰𝘵𝘩𝘦𝘮 ");
        apothem = input.nextDouble();
        pentagonArea = (perimeter * apothem) / 2;
        System.out.println(" 𝘵𝘩𝘦 𝘢𝘳𝘦𝘢 𝘰𝘧 𝘱𝘦𝘯𝘵𝘢𝘨𝘰𝘯 𝘪𝘴 " + pentagonArea);
        return;
    }

    private static void calculateCircleArea(Scanner input) {
        double radio;
        double circleArea;
        System.out.println(" 𝘠𝘰𝘶 𝘤𝘩𝘰𝘰𝘴𝘦 𝘵𝘩𝘪𝘴 𝘰𝘱𝘵𝘪𝘰𝘯 𝘵𝘰 𝘤𝘢𝘭𝘤𝘶𝘭𝘢𝘵𝘦 𝘵𝘩𝘦 𝘢𝘳𝘦𝘢 𝘰𝘧 𝘤𝘪𝘳𝘤𝘭𝘦 ");
        System.out.println(" 𝘗𝘭𝘦𝘢𝘴𝘦 𝘦𝘯𝘵𝘦𝘳 𝘵𝘩𝘦 𝘳𝘢𝘥𝘪𝘰 ");
        radio = input.nextDouble();
        circleArea = (radio) * (radio) * (3.14);
        System.out.println(" 𝘵𝘩𝘦 𝘢𝘳𝘦𝘢 𝘰𝘧 𝘤𝘪𝘳𝘤𝘭𝘦 𝘪𝘴 " + circleArea);
        return;
    }

}
