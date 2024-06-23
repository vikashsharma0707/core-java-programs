 import java.util.Scanner;
 class Positive{
       public static void main(String args[]){
       int n;
       Scanner kb =new Scanner(System.in);
       System.out.println("enter any number");
       n=kb.nextInt();
   
       if(n>0){
        System.out.println("number is positive" +n);
       }
 
        else if(n<0){
          System.out.println("number is negative" +n);
       }

        else{
         System.out.println("number is nor positive nor negative" +n);
      }


    }
  }