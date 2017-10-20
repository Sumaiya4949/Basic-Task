
package basicjava;

import java.util.Scanner;


public class Problem1 {
    
    public static void main(String[] args) {
        star();    
    }
    public static void star(){
        int i,num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num");
        num = input.nextInt();
        
        for(i=0;i<num;i++){
            System.out.print("*");              
    
}
    }
}
