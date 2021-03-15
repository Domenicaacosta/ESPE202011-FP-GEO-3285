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
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] integeresToSort = {9, 7, 1, 6, 2, 3};
        
        System.out.println("UNSORTED INTEGERS");
        printArray(integeresToSort);
        sortByBubbleSort(integeresToSort);
        System.out.println("");
        printArray(integeresToSort);
        
        int [] integeresToSort2 = {8, 1, 7, 2, 5};
        
        System.out.println("");
        System.out.println("UNSORTED INTEGERS");
        printArray(integeresToSort2);
        sortByBubbleSort(integeresToSort2);
        System.out.println("");
        printArray(integeresToSort2);
    }

    public static void sortByBubbleSort(int integers[]) {
        //for (int i=0; i < integers.length; i++){
        //}
        int n = integers.length;
        int temp;
        for (int i = 0; i < n - 1; i++) { // es (-1) porque ya le escogio al primero
            for (int j = 0; j < n - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    //Swap
                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                }
                System.out.println("sorting --> ");
                printArray(integers);
                
            }
            System.out.println("");
        }
    
    }

    public static void printArray(int[] integers) {
        int n = integers.length;
        for (int i = 0; i < n; i++) {
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }
}
