 //Java Program to Check Armstrong Number

  import java.util.Scanner;
  class Armstrong1{
       public static void main(String args[]){
       int n,i,rem,sum=0;
       Scanner kb = new Scanner(System.in);
       System.out.println("enetr any number");
       n=kb.nextInt();

       sum=0;
       i=n;
 
       while(n>0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
 
          }
       if(i==sum){
          System.out.println("number is armstrong number");
       }

       else{
         System.out.println("not is armstrong number");
      }

    }

   }
           
       
       
       