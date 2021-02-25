/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16.matrixfunction;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class HW16MAtrixFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int a[][];
        int b[][];
        int c[][];
        int n;
        int m;

        System.out.println("Please enter the dimension of the matrix ");

        System.out.println("Row n-->");
        n = input.nextInt();
        System.out.println("Column m -->");
        m = input.nextInt();
        System.out.println("Please enter the numbers of matrix A you want to sum : " + n + " in row and  " + m + " in column ");

        a = showMatrixA(n, m, input);

        System.out.println("Please enter the numbers of matrix B you want to sum : " + n + " in row and  " + m + " in column");
        b = showMatrixB(n, m, input);

        c = AddTwoMatrces(n, m, a, b);

        System.out.println("\nequals to ");
        printMatrixAddition(n, m, c);
        System.out.println("");
    }

    private static void printMatrixAddition(int n, int m, int[][] c) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < m; j++) {
                System.out.print("\t " + c[i][j]);

            }
        }
    }

    private static int[][] AddTwoMatrces(int n, int m, int[][] a, int[][] b) {
        int[][] c;
        c = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    private static int[][] showMatrixB(int n, int m, Scanner input) {
        int[][] b;
        b = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("--ROW Numbers--" + (i + 1) + "--");
            for (int j = 0; j < m; j++) {
                System.out.print("B" + " [ " + (i + 1) + " ] [ " + (j + 1) + " ] --> ");
                b[i][j] = input.nextInt();
            }
        }
        return b;
    }

    private static int[][] showMatrixA(int n, int m, Scanner input) {
        int[][] a;
        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("--ROW Numbers--" + (i + 1) + "--");
            for (int j = 0; j < m; j++) {
                System.out.print("A" + " [ " + (i + 1) + " ] [ " + (j + 1) + " ] --> ");
                a[i][j] = input.nextInt();
            }
        }
        return a;
    }

}
