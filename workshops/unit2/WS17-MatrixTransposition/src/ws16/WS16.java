/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws16;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class WS16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float[][] a;
        float[][] b;
        float[][] t;
        float[][] c;
        int n = 0;
        int m = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the matrix dimensions");
        System.out.print("\n m -->");
        m = input.nextInt();

        System.out.print("\n n -->");
        n = input.nextInt();

        a = new float[m][n];
        b = new float[m][n];
        c = new float[m][n];

        t = new float[n][m];

        System.out.println("---Enter the elements of the matrix---");

        a = readMatrixElements(m, n, "A", input);
        b = readMatrixElements(m, n, "B", input);

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.print("\t");
        }
        System.out.print(" A ");

        prettyPrintMatrix(m, n, a);
        System.out.println("");

        System.out.print(" B ");
        prettyPrintMatrix(m, n, b);

        transpose(n, m, t, a);

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.print("\t");
        }

        System.out.print(" T ");
        prettyPrintMatrix(n, m, t);

        System.out.println("-- The sum of matrices is --");

        c = addTwoMatrices(m, n, a, b);
        prettyPrintMatrix(m, n, c);
    }

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.print("--ROW Numbers--" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + " [ " + (i + 1) + " ] [ " + (j + 1) + " ] --> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static void transpose(int n, int m, float[][] t, float[][] a) {
//transposition operation (transpose)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                t[i][j] = a[j][i];
            }
        }
    }

    public static float[][] addTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == m - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("\t");
                    }

                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == m - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
        }
        System.out.println("");
    }

    public static void printMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("/\t");
                    } else if (i == m - 1) {
                        System.out.print("╱╱╱ \t");

                    } else {
                        System.out.print("|\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");

                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print("\t ");
                    } else if (i == m - 1) {
                        System.out.print("\t  ");

                    } else {
                        System.out.print("\t ");
                    }
                }
            }
        }
        System.out.println("");
    }

}
