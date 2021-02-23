/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class HW15MatrixOperation {

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

        a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Please enter the numbers of matrix B you want to sum : " + n + " in row and  " + m + " in column");
        b = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = input.nextInt();
            }
        }

        c = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\nequals to ");
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < m; j++) {
                System.out.print("\t " + c[i][j]);

            }
        }
        System.out.println("");
    }

}
