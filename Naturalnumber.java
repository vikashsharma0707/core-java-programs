 import java.util.Scanner;
    class Naturalnumber{
          public static void main(String args[]){
          int n,sum=0;
          Scanner kb =new Scanner(System.in);
          System.out.println("enter the range of natural number :");
          n=kb.nextInt();
 
          for(int i=0;i<=n;i++){
             System.out.println("Natural number are :" +i);
             sum=sum+i;
           }
 
         System.out.println("addition of natural numbers are :" +sum);
      }
   }
          