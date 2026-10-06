/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author REGIDOR_CPE113
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] IntergerValue={-1,2,-3,0,6,-7,8,-9,0,4,};
      Scanner input = new Scanner(System.in); 
       System.out.println("=== IntergerValues ===");
        for (int i = 0; i < IntergerValue.length; i++) {
  System.out.println(IntergerValue[i]);} {
        int choice;
        
        System.out.println("=== Choose a Number to Count ===");
            System.out.println("1. Positive Numbers");
            System.out.println("2. Negative Numbers");
            System.out.println("3. Zero Numbers ");
            System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Positve Numbers: ");
                    System.out.print("The Positive Numbers are 4");
                    break;
            
                case 2:
                    System.out.print("Negative Numbers: ");
                    System.out.print("The Negative Numbers are 4");
                    break;
                    
                case 3:
                    System.out.print("Zero Numbers: ");
                    System.out.print("The Zero Numbers are 3");
                    break;}
                   
            
    }
        
    }
    }
    

