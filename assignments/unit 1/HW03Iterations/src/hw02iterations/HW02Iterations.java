/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02iterations;

/**
 *
 * @author Domenica
 */
public class HW02Iterations {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        i =0;
        
        System.out.println(" This is a while loop from 0 to 1 ");
        
        while (i <1){
            System.out.println(" i -->" + (i +1));
            //i += 1;
            i++;
            //i = i +1;
        }
        
        System.out.println("first 1 even number");
        i =2;
        while (i<=1);{
        System.out.println(i + " --> is even");
        i += 2;
    }
        
        System.out.println(" first 1 odd number");
        
        int stop;
        stop=20;
        for (int j=0; j<1; j+=2){
            System.out.println("odd number --> " + j);
        }
        
        System.out.println(" Multiplication tables: 1");
            int top=12;
            int product =0;
            int table = 1 ;
            for (int j = 1 ; j <= top ; j++){
                product = table *j;
                System.out.println(" 1 * " + j + " = " + product);
        }
        
            // find the terms of the series before number 100  " 1, 3, 9, ....."
            
            int lock=100;
            int result=0;
            int serie= 1;
            for (int m = 1 ; m < lock ; m = (3 * m)){
                result=3*m;
        
            
            
            System.out.println( " The next term of the serie is: " + m );
                 
                    
            
        
        }
    }
}
        
    

    

