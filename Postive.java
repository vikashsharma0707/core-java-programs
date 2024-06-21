
  //Java Program to Check Whether a Number is Positive or Negative
   import java.util.Scanner;
     class Postive{
           public static void main(String args[]){
           int n;
           Scanner kb=new Scanner(System.in);
           System.out.println("Enter any number :");
           n=kb.nextInt();

           if(n>0){
           System.out.println("number is positive");
          }

          else if(n<0){
             System.out.println("number is negative");
      }

      else{
       System.out.println("number is not positive or not negative");
   }

   }
 }
           