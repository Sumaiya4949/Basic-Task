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
public class sstart {
     public static void main(String[] args) {
         int row,col1,col2,noOfrow,noOfcol;
          Scanner input=new Scanner(System.in);
        noOfrow = input.nextInt();
        noOfcol=noOfrow-1;
        for( row=1;row<=noOfrow;row++){
            for(col1=1;col1<= noOfcol;col1++){
                System.out.print(" "); 
                 
                         
    }
            noOfcol--;
           for(col2=1;col2<=row;col2++){
                System.out.print("*"); 
            
    }
      System.out.print("\n");
    }
  
}
}
