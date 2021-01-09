/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwprimitivedata;

/**
 *
 * @author Domenica
 */
public class HWprimitiveData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //A vehicle company sells a car for n dollars, for a seasonal offer they reduce 500 dollars to the cost
        int n;
        int discount;
       
        
        
        n = 26780;
        discount = (n-500);
        
        System.out.println("the cost of the car is " + discount);    
        
        // iva cost 
        float iva;
        
        
        iva = (float) (discount*0.12);
        
        System.out.println("the cost of the iva is " + iva);
        //Extras
        int air_conditioning;
        int electric_window;
        int extras;
        
        air_conditioning = 1000;
        electric_window = 500;   
        
         extras = air_conditioning + electric_window;               
         System.out.println("the cost of the extras is " + extras);
         
        // total cost of the vehicle              
        
        System.out.println("The total cost without extras is " + (discount + iva  ));
        System.out.println("The total cost with extras is " + (discount + iva + extras ));
        
        // If you want to pay in installments the insurance is mandatory
         short policy;
        short years;
        short insurance;
        short months;
        
        policy = 400;
        years = 5;
        insurance = (short) (policy*years);
        months = (short) (years*12);
        
        System.out.println("the monthly cost in " + months + " fees without extras " + ((discount + iva + insurance)/months) );
        System.out.println("the monthly cost in " + months + " fees with extras " + ((discount + iva + extras + insurance)/months) );
        
        
        
     
        
        
        
        
        
        
                
        
        
        
        
        
    }
    
}
   