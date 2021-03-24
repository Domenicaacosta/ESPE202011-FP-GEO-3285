/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Formulary.view;

/**
 *
 * @author Domenica
 */
public class sortNumbers {

    public static void orderNumbers(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int pos = i;
            while ((pos > 0) && (array[pos - 1] > temp)) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = temp;
        }
    }

}
