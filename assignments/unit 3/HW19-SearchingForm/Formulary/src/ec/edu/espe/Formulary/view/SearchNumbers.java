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
public class SearchNumbers {

    public static int searchNumber(int array[], int n) {
        n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
