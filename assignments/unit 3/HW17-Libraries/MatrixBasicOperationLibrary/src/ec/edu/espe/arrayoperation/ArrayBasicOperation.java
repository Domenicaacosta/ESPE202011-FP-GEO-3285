/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arrayoperation;

/**
 *
 * @author Domenica
 */
public class ArrayBasicOperation {

    public static int[][] matrixAddition(int n, int matrixA[][], int matrixB[][]) {
        int matrixC[][];
        matrixC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixC;
    }

    public static int[][] matrixSubtraction(int n, int matrixA[][], int matrixB[][]) {
        int matrixC[][];
        matrixC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixC;
    }

    public static int[][] matrixMultiplication(int n, int matrixA[][], int matrixB[][]) {
        int matrixC[][];
        matrixC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixC;
    }

}
