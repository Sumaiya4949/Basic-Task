
package basicjava;

import java.util.Scanner;


public class array2 {
     public static void main(String[] args) {
        int[] number = new int[5];
        int i;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 5 number");
        
        for(i=0;i<5;i++){
        number[i] = input.nextInt();
        }
        
        for(i=4;i>0;i--){
           
         System.out.println(number[i]);
        
         
        
         
     
          
    }
    
}

}