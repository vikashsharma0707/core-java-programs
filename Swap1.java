  
//Java Program to Swap Two Numbers

 import java.util.Scanner;
  class Swap1{
        public static void main(String args[]){
        int a,b,temp;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter first number");
        a=kb.nextInt();

        System.out.println("enter second number");
        b=kb.nextInt();

        temp=a;
        a=b;
        b=temp;
  
         System.out.println("after swapping value");
         System.out.println("first number is" +a);
         System.out.println("second number is" +b);
    }
  }
       
        