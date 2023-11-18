

import java.util.Scanner;

public class Simple {
  
   public static void main(String[] args){
         int num;
         int num1 =1;
         System.out.println("enter a  number");
         Scanner sc = new Scanner(System.in);
         num =sc.nextInt();
         for(int i=1; i<=num;i++){
            num1=num1*i;
         }

         System.out.println(num1);
         sc.close();
   }
    
}
