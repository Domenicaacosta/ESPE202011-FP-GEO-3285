/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class HW18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d;
        int[] ages = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int data;
        int age;
        System.out.println("Author: Domenica Acosta");
        System.out.println("");
        System.out.println("---------WELCOME---------");
        System.out.println("**Secuential search**");

        System.out.println("A company gives toys for children's day to the children of its employees");
        System.out.println("");

        System.out.println("please enter the age you want to know if have priority");
        age = input.nextInt();
        data = lookForages(ages, age);
        System.out.println("the age " + age + " is in " + data + " position of priority to receive the toys");

        System.out.println("");
        System.out.println("**Binary search**");
        System.out.println("Check 2020 Ecuadorian University ranking");
        int result;
        int[] university = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int p;
        int n;
        n = university.length;
        //"USFQ", "ESPOL", "EPN", "PUCE", "UCE", "Universidad de Cuenca", "ESPE", "UEES", "UDLA", "UTPL"

        
        System.out.println("Please enter the place you want to search");

        p = input.nextInt();

        result = universityRankingBinarySearch(university, 0, n - 1, p);

        if (result == 0) {
            System.out.println("The university which is in " + (result + 1) + " place is USFQ");
        } else {
            if (result == 1) {
                System.out.println("The university which is in  " + (result + 1) + " place is ESPOL");
            } else {
                if (result == 2) {
                    System.out.println("The university which is in  " + (result + 1) + " place is  EPN");
                } else {
                    if (result == 3) {
                        System.out.println("The university which is in  " + (result + 1) + " place is PUCE");
                    } else {
                        if (result == 4) {
                            System.out.println("The university which is in  " + (result + 1) + " place is UCE");
                        } else {
                            if (result == 5) {
                                System.out.println("The university which is in  " + (result + 1) + " place is Universidad de Cuenca");
                            } else {
                                if (result == 6) {
                                    System.out.println("The university which is in  " + (result + 1) + " place is ESPE");
                                } else {
                                    if (result == 7) {
                                        System.out.println("The university which is in  " + (result + 1) + " place is UEES");
                                    } else {
                                        if (result == 8) {
                                            System.out.println("The university which is in  " + (result + 1) + " place is UDLA");
                                        } else {
                                            if (result == 9) {
                                                System.out.println("The university which is in  " + (result + 1) + " plce is UTPL");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }

    public static int lookForages(int elements[], int x) {
        int n = elements.length;

        for (int i = 0; i < n; i++) {
            if (elements[i] == x) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int universityRankingBinarySearch(int elements[], int left, int right, int x) {

        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (elements[mid] == x) {
                return mid;
            }

            if (elements[mid] > x) {
                return universityRankingBinarySearch(elements, left, mid - 1, x);
            }

            return universityRankingBinarySearch(elements, mid + 1, right, x);
        }
        return -1;
    }
}
