/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.EcuadorCities.controller;

/**
 *
 * @author Domenica
 */
public class searchCity {

    public static int findCity(String[] array, String cityToFind) {
        int n = array.length;
       for (int i = 0; i < n; i++) {
            if (cityToFind.equals(array[i])) {
                return 1;
            }
        }
    return -1;
    }
}


