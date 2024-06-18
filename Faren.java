 
 // question 5

import java.util.Scanner;
 class Faren{
       public static void main(String args[]){

       Scanner kb= new Scanner(System.in);
       double celcius;
       float farenhite;
       

       System.out.println("enter the farenhite");
        farenhite = kb.nextFloat();
   
       celcius = (farenhite-32)*5/9;
     
       System.out.println("farenhite is" +celcius);
   }
  }