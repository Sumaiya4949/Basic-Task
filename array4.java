/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class array4 {
    public static void main(String[] args) {
        int i;
        int count=0;
        
        int[] number = new int[5];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 5 number");
        for( i=0;i<number.length;i++){
        number[i] = input.nextInt();
        }
         System.out.println("\n\n");
        for( i=0;i<number.length;i++){
          if(number[i]<10){
             count++;
          }
           
          
    }
         System.out.println("The number of digit less than 10 is "+count);
    
}

    
}
