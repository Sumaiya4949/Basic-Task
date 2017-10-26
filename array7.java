
package basicjava;

import java.util.Scanner;


public class array7 {
    public static void main(String[] args) {
        
    

    int i;
        
       
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
             }
             
          }
            
    
}
        System.out.println("Largest number "+temp);
    }
}
