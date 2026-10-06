/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regidor;

import java.util.Scanner;

/**
 *
 * @author REGIDOR_CPE113
 */
public class Regidor {

    /**
     * @param args the command line arguments
     */
    // Problem 1.
    public static void main(String[] args) {
   int A[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Scanner input=new Scanner(System.in);
        
        for (int i = 0; i < A.length; i++){
            System.out.println("Enter a number for index"+i);
            A[i]=input.nextInt();
        }
        
        System.out.println("Enter a number for search");
        int search=input.nextInt();
        
        for(int j = 0; j < A.length; j++){
            if (search==A[j]){
            System.out.println("Number is in index"+j);
            
            
        }else{
                System.out.println("pakyouuu");
            }
    }
    }   
}