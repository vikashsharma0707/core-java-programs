  //Java Program to Swap without using third variable

  
  import java.util.Scanner;
  class Swap2{
        public static void main(String args[]){
        int a,b;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter the first number");
        a=kb.nextInt();

        System.out.println("enter the first number");
        b=kb.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

       System.out.println("after swapping value is");
       System.out.println("first number is" +a);
       System.out.println("first number is" +b);

    }
  }

      
     
        