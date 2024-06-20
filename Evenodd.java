 //Java Program to Check Whether a Given Number is Even or Odd
 import java.util.Scanner;
        class Evenodd{
          public static void main(String args[]){
          Scanner kb =new Scanner(System.in);
          System.out.println("enter any number");
  
           int n;
          n=kb.nextInt();
      
          if(n%2==0){
          System.out.println("even number");
          }
 
          else{
          System.out.println("odd number");
        }
     }
    }