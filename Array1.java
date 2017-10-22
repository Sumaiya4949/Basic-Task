
package basicjava;

import java.util.Scanner;


public class Array1 {
    public static void main(String[] args) {
        int i;
        
        int[] number = new int[5];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 5 number");
        for( i=0;i<number.length;i++){
        number[i] = input.nextInt();
        }
         for( i=0;i<number.length;i++){
         System.out.println(number[i]);
          }
    }
          
    }
    
        
    


