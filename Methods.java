
package basicjava;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        star();    
    }
    public static void star(){
        int i,num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num of row");
        num = input.nextInt();
        System.out.println("Enter a num of col");
       int x= input.nextInt();
        
        for(i=1;i<=num;i++){
            for(int j=1;j<=x;j++){
                       System.out.print("*");   
    }
            System.out.println(""); 
    }
}
}