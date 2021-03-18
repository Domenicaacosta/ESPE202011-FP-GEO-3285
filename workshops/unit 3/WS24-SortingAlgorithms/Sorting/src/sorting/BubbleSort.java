/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Domenica
 */
public class BubbleSort {

    public static void sort(int[] integers) {
        //for (int i=0; i < integers.length; i++){
        //}
        int n = integers.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            // es (-1) porque ya le escogio al primero
            for (int j = 0; j < n - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    //Swap
                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                }
                System.out.println("sorting --> ");
                Sorting.printArray(integers);
            }
            System.out.println("");
        }
    }
    
}
