 
 import java.util.Scanner;
        class Addition1{
              public static void main(String args[]){
              int a,b;
              Scanner kb=new Scanner(System.in);
              System.out.println("enter first number:");
              a=kb.nextInt();

              System.out.println("enter second number:");
              b=kb.nextInt();
  
              int add=a+b;
              System.out.println("sum of two numbers is :" +add);

              int sub=a-b;
              System.out.println("sum of two numbers is :" +sub);
            
              int mul=a*b;
              System.out.println("sum of two numbers is :" +mul);

              int div=a/b;
              System.out.println("sum of two numbers is :" +div);

      }
    }