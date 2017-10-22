
package basicjava;

import java.util.Scanner;

public class array3 {
     public static void main(String[] args) {
        int i;
        
        int[] number = new int[5];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 5 number");
        for( i=0;i<number.length;i++){
        number[i] = input.nextInt();
        }
         System.out.println("\n\n");
        for( i=0;i<number.length;i++){
          if(number[i]<10){
             
         System.out.println(number[i]);
          }
          
          
    }
    
}


    
}
