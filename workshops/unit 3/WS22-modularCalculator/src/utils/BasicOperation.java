/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Domenica
 */
public class BasicOperation {
    //addition, subtraction, division, multiplication

    //es add porque el nombre de los metodoso siempre es verbo
    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float subtractTwoNumbers(float minuend, float subtraend) {
        float subtraction = 0;
        subtraction = minuend - subtraend;
        return subtraction;
    }

    public static float multiplicateTwoNumbers(float factor1, float factor2) {
        float multiplication = 0;
        multiplication = factor1 * factor2;
        return multiplication;
    }

    public static float divideTwoNumbers(float dividend, float divider) {
        float division = 0;
        division = dividend / divider;
        return division;
    }
}
