
package basicjava;

import java.util.Scanner;

public class star6 {
    public static void main(String[] args) {
        
    
     int noOfrow,colspace,colstar,row;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of row");
        noOfrow = input.nextInt();
        for(row=1;row<=noOfrow;row++){
            for(colspace=noOfrow-row;colspace>=1;colspace--){
                System.out.print(" ");
            }
            for(colstar=1;colstar<=(row*2)-1;colstar++){
                System.out.print("*");
            }
             System.out.print("\n");
        }
        
        for(row=noOfrow;row>=1;row--){
            for(colspace=1;colspace<= noOfrow-row;colspace++){
                 System.out.print(" ");
        }
            for(colstar=1;colstar<=(row*2)-1;colstar++){
                System.out.print("*");
            }
             System.out.print("\n");
    }
}
}     