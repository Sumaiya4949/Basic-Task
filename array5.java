
package basicjava;


import java.util.Scanner;


public class array5 {
    public static void main(String[] args)  {
        int num,i,flag=0;
        
        
       
        
        int[] number = new int[5];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 5 number");
        for( i=0;i<number.length;i++){
        number[i] = input.nextInt();
        }
        System.out.println("Enter the search number");
         num = input.nextInt();
        for( i=0;i<number.length;i++){
         if(number[i]==num){
           flag=1;  
        break;
         
        }
         else{
             flag=0;
         }
         
         
    }
        if(flag==1){
            System.out.println(+num+" is Found");
        }
        else{
            System.out.println(+num+" Not found");
        }
    }
}
    
        
       
       
       
           
        
            
        

        
        
                      
         

        
             
          
    
    
