   //Java Program to Find Sum of Digits of a Number

    import java.util.Scanner;
     class Digitsum{
           public static void main(String args[]){
           int n,rem,sum,i;
           Scanner kb=new Scanner(System.in);
           System.out.println("enter any number");
           n=kb.nextInt();
 
           sum=0;
           i=n;
 
           while(n>0){
          
           rem=n%10;
           sum=sum+rem;
           n=n/10;
          
          }

           System.out.println("sum of digit is " +sum);
      }
  }
   