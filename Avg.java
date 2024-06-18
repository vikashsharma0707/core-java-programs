
 
 // question 3
 import java.util.Scanner;
  
  class Avg{
        public static void main(String args[]){
        float firstnumber,secondnumber,thirdnumber,fourthnumber,fifthnumber;
        
         Scanner obj = new Scanner(System.in);
         
         System.out.println("Enter the first number: ");
         firstnumber = obj.nextFloat();

         System.out.println("Enter the second  number: ");
         secondnumber = obj.nextFloat();

          System.out.println("Enter the third number: ");
         thirdnumber = obj.nextFloat();


          System.out.println("Enter the fourth number: ");
         fourthnumber = obj.nextFloat();

          System.out.println("Enter the fifth number: ");
         fifthnumber = obj.nextFloat();
   
         float average =(firstnumber+secondnumber+thirdnumber+fourthnumber+fifthnumber)/5;
         System.out.println("average is :" +average);
         
    
      }
    }