/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws04logicaloperators;

/**
 *
 * @author Domenica
 */
public class WS04logicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 4;
        if (x != 4) {
            System.out.println("x is equals to 4");
        } else {
            System.out.println("x is NOT equal to 4");
        }

        boolean y = x != 4;
        System.out.println("x != 4 --> " + (y));
        System.out.println("x == 4 --> " + (x == 4));
        System.out.println("x = 5 -->   " + (x = 5));
        System.out.println("x > 5 -->  " + (x > 5));
        System.out.println("x >= 5 --> " + (x >= 5));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 4;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 5;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        System.out.println(" Domenica Acosta AND TRUTH TABLE odd numbers -> &&  even numbers ->||");
        
        
        boolean p;
        boolean q;

        p = true;
        q = false;
        
        System.out.println ("( " + p + " ∨ " + p + " ) " + ( p || p));
        System.out.println(" ( " + p + " ∨ " + q + " ) " + (p || q));
        System.out.println(" ( " + q + " ∨ " + p+ " ) "  + ( q || p ));
        System.out.println(" ( " + q + " ∨ " + q + ") " + (q || q));
        
        
        
        
    }
    
}
