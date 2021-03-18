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
public class SelectionSort {

    public int[] sort(int[] unsortedArray) {
        int size = unsortedArray.length;
        int minum;
        int pos;

        for (int i = 0; i < size - 1; i++) {
            minum = unsortedArray[i];
            pos =i;
            for (int j = i + 1; j < size; j++) {
                if (unsortedArray[j] < minum) {
                    minum = unsortedArray[j];
                    pos =j;
                }

                //swap
                unsortedArray[pos] = unsortedArray[i];
            unsortedArray[i] = minum;

            printMatrix(unsortedArray);

            }
        }

        return unsortedArray;
    }

    public void printMatrix(int[] unsortedArray) {
        for (int element : unsortedArray) {
            System.out.print(element + " \t ");
        }
        System.out.println("");
    }

    public int[] sort2(int[] unsortedArray) {
        int size = unsortedArray.length;
        int minumumIndex;
        int pos;

        for (int i = 0; i < size - 1; i++) {
            minumumIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (unsortedArray[j] < unsortedArray[minumumIndex]) {
                    minumumIndex = j;
                }

                //swap
            }
            pos = unsortedArray[minumumIndex];
            unsortedArray[minumumIndex] = unsortedArray[i];
            unsortedArray[i] = pos;
            
            printMatrix(unsortedArray);
        }

        return unsortedArray;
    }

}
