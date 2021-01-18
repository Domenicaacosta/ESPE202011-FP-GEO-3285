

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean rainLoop = true;
        int option;
        
        do{
            System.out.println("----UNIFORMLY VARIED RECTILINEAR MOVEMENT----");
            System.out.println(" 1 --> Final Position");
            System.out.println("2 --> Initial Position");
            System.out.println("3 --> Velocity ");
            System.out.println("4 --> Aceleration ");
            
            System.out.println("What option do you want to calculate? ");
            option = input.nextInt();
            
            switch(option){
    
                case 1:
                    float initial_position;
                    float velocity;
                    float time;
                    float aceleration;
                    float final_position;

                    System.out.println("Enter initial position --> ");
                    initial_position = input.nextFloat();
                    System.out.println("Enter initial velocity --> ");
                    velocity = input.nextFloat();
                    System.out.println("Enter time -->");
                    time = input.nextFloat();
                    System.out.println("Enter aceleration --> ");
                    aceleration = input.nextFloat();
                    final_position = initial_position + (velocity * time ) + ((aceleration * (time * time)) / 2 );
                    System.out.println("The final position is --> " + final_position);
                    break;
                case 2:
                    System.out.println("Enter final position --> ");
                    final_position = input.nextFloat();
                    System.out.println("Enter initial velocity --> ");
                    velocity = input.nextFloat();
                    System.out.println("Enter time -->");
                    time = input.nextFloat();
                    System.out.println("Enter aceleration --> ");
                    aceleration = input.nextFloat();
                    initial_position = final_position - (velocity * time) - ((aceleration * (time *time)) / 2);
                            System.out.println("The initial position is --> " + initial_position);
                    break;
                case 3:
                    System.out.println("Enter final position --> ");
                    final_position = input.nextFloat();
                    System.out.println("Enter initial position --> ");
                    initial_position = input.nextFloat();
                    System.out.println("Enter time -->");
                    time = input.nextFloat();
                    System.out.println("Enter aceleration --> ");
                    aceleration = input.nextFloat();
                    velocity = (final_position / time) - (initial_position / time ) - ((aceleration * time ) /2 );
                            System.out.println("The velocity is --> " + velocity);
                    break;
                case 4:
                    System.out.println("Enter final position --> ");
                    final_position = input.nextFloat();
                    System.out.println("Enter initial position --> ");
                    initial_position = input.nextFloat();
                    System.out.println("Enter velocity -->");
                    velocity = input.nextFloat();
                    System.out.println("Enter time --> ");
                    time = input.nextFloat();
                    aceleration  = ((2*(final_position))/(time * time)) - ((2*(initial_position))/(time * time))- ((2*(velocity * time))/(time * time));
                            System.out.println("The aceleration is --> " + aceleration);
                    break;
                    
                    default:
                    System.out.println("Invalid option");
                    break;
                    
                    
                    
                    
                    
                    

         }
                    
                    
            
        } while (option != 5);
    } 
    
}
        
        
        
            
                
                
                    
            

