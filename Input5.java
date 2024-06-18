/*Q5. Write a Java program that takes two numbers as input and displays the product of two
numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

 import java.util.Scanner;
        class Input5{
              public static void main(String args[]){
              int n1,n2,n3;

          Scanner kb= new Scanner(System.in);
      
          System.out.println("enter the first number");
          n1= kb.nextInt();
 
          System.out.println("enter the second number");
          n2= kb.nextInt();

          n3 = n1*n2;
          System.out.println(+n3);

     }
   }
          