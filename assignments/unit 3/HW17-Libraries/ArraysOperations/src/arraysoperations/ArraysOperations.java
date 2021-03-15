/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysoperations;

import ec.edu.espe.arrayoperation.ArrayBasicOperation;
import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class ArraysOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;

        System.out.println(".     .     .     .     .     .     .    ");
        System.out.println(".   WELCOME TO MATRIX CALCULATOR    .    ");
        System.out.println(".     .     .     .     .     .     .    ");
        System.out.println("");
        System.out.println("Please enter the dimension of the matrix ");

        n = input.nextInt();

        System.out.println("Please enter the numbers of matrix A you want to sum ");

        matrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("--ROW Numbers--" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print("matrix A" + " [ " + (i + 1) + " ] [ " + (j + 1) + " ] --> ");
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("Please enter the numbers of matrix B you want to sum ");

        matrixB = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("--ROW Numbers--" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print("matrix B" + " [ " + (i + 1) + " ] [ " + (j + 1) + " ] --> ");
                matrixB[i][j] = input.nextInt();
            }
        }

        System.out.println("");
        System.out.println("------Matrix A------ ");

        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {

                System.out.print("\t" + "[ " + matrixA[i][j] + " ] ");
            }

        }
        System.out.println("");

        System.out.println("");
        System.out.println("------Matrix B------");

        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {

                System.out.print("\t" + "[ " + matrixB[i][j] + " ] ");
            }

        }
        matrixC = ArrayBasicOperation.matrixAddition(n, matrixA, matrixB);
        System.out.println("");
        System.out.println("");

        System.out.println("Addition ");

        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + "[ " + matrixC[i][j] + " ] ");

            }
        }

        matrixC = ArrayBasicOperation.matrixSubtraction(n, matrixA, matrixB);
        System.out.println("");
        System.out.println("");

        System.out.println("Subtraction ");

        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + "[ " + matrixC[i][j] + " ] ");

            }
        }

        matrixC = ArrayBasicOperation.matrixMultiplication(n, matrixA, matrixB);
        System.out.println("");
        System.out.println("");

        System.out.println("Multiplication ");

        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + "[ " + matrixC[i][j] + " ] ");

            }
        }

    }
}
