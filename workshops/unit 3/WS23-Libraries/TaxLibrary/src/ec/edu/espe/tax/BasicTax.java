/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;

/**
 *
 * @author Domenica
 */
public class BasicTax {

    public static float computeIva(float basePrice, float percetageValue) {
        float iva;
        iva = basePrice * percetageValue / 100;
        return iva;
    }

}