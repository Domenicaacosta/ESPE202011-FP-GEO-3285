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
        BubbleSort.sort(integeresToSort);
        System.out.println("");
        printArray(integeresToSort);
        
        int [] integeresToSort2 = {8, 1, 7, 2, 5};
        
        System.out.println("");
        System.out.println("UNSORTED INTEGERS");
        printArray(integeresToSort2);
        BubbleSort.sort(integeresToSort2);
        System.out.println("");
        printArray(integeresToSort2);
        
        integeresToSort2 = new int [] {9,7,3,1,4};
        
        System.out.println("UNSORTED INTEGERS");
        printArray(integeresToSort2);
        BubbleSort.sort(integeresToSort2);
        System.out.println("");
        printArray(integeresToSort2);
        
        SelectionSort selectionsort = new SelectionSort();
        
        integeresToSort2 = new int [] {42,30,-5,7,1,50};
        
        System.out.println("Sorting integers by SELECTION SORT");
        printArray(integeresToSort2);
        int[] sortedArray = selectionsort.sort(integeresToSort2);
        System.out.println("");
        printArray(sortedArray);
        
        
    }


    public static void printArray(int[] integers) {
        int n = integers.length;
        for (int i = 0; i < n; i++) {
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }
}
