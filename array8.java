/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class array8 {
 public static void main(String[] args) {
        
    

    int i,j=0;
        
       
        int[] number = new int[5];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 5 number");
        for( i=0;i<number.length;i++){
        number[i] = input.nextInt();
        }
         System.out.println("\n");
          int temp = number[0];
        for( i=0;i<number.length;i++){
          {
             if(temp<number[i]){
                 temp = number[i];
                 j=i;
             }
             
          }
            
    
}
        System.out.println("Largest number "+temp+ " Index is "+(j+1));
    }
}
 
