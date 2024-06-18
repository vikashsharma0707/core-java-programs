 // question 4
 import java.util.Scanner;
  
  class Rem{
        public static void main(String args[]){
        Scanner obj= new Scanner(System.in);
        int quotient,reminder;
        System.out.println("Enter  number :");
        int num = obj.nextInt();
 
        System.out.println("Enter the denominator number :");
        int demo = obj.nextInt();

        quotient =num/demo;
        System.out.println("quotient is: " +quotient);

        reminder = num%demo;
        System.out.println("Reminder is: " +reminder);
  
      }
    }

        

  
       
        
       