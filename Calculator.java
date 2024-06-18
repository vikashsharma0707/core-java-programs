 import java.util.Scanner;
 class Calculator{
       public static void main(String args[]){
        char operator;
        int n1,n2,n3;

       Scanner obj = new Scanner(System.in);
        
       System.out.println("enter chartcter");
       operator=obj.next().charAt(0);

       System.out.println("enter first number");
       n1=obj.nextInt();
 
       System.out.println("enter the second number");
       n2=obj.nextInt();


       switch(operator){

      case '+':
      n3=n1+n2;
      System.out.println(+n3);
      break;


     case '-':
      n3=n1-n2;
      System.out.println(+n3);
      break;

      case '*':
      n3=n1*n2;
      System.out.println(+n3);
      break;

      case '/':
      n3=n1+n2;
      System.out.println(+n3);
      break;
     }

      }
     }
       
    
       

