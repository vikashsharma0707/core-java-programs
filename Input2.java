/*Q2. Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110*/

 import java.util.Scanner;
  class Input2{
        public static void main(String args[]){
        
        int n1,n2,n3;
        Scanner kb = new Scanner(System.in);
        System.out.println("enter first number");
         n1=kb.nextInt();

        System.out.println("enter second number");
        n2= kb.nextInt();
  
       n3=n1+n2;
       System.out.println("sum of two number is :" +n3);

     }
  }
        

       




         