/*Q6. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/


   import java.util.Scanner;
   class Input6{
         public static void main(String args[]){
         int n1,n2,add,sub,mul,div,rem;

      Scanner kb = new Scanner(System.in);
     
      System.out.println("enter the first number");
      n1=kb.nextInt();

      System.out.println("enter the second number");
      n2=kb.nextInt();

      add = n1+n2;
      System.out.println(add);
   
      sub=n1-n2;
      System.out.println(sub);

      mul=n1*n2;
      System.out.println(mul);

      div=n1/n2;
      System.out.println(div);
    
      rem= n1%n2;
      System.out.println(rem);

    }
  }


   



