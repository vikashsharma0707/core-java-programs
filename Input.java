import java.util.Scanner;

 class Input{
       public static void main(String args[]){ 
       int a,b,c;
       Scanner kb =new Scanner(System.in);

       System.out.println("enter first number");
       a=kb.nextInt();

       System.out.println("enter second number");
       b=kb.nextInt();

      c=a+b;

      System.out.println(+c);
  }
 }