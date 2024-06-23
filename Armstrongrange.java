 //Java Program to Print Armstrong Number range.

   import java.util.Scanner;
   class Armstrongrange{
       public static void main(String args[]){
       int n,i,l,u,rem,sum=0;
       Scanner kb = new Scanner(System.in);
       //System.out.println("enetr any number");
       //n=kb.nextInt();

       System.out.println("enetr lower limit");
       l=kb.nextInt();

       
       System.out.println("enetr upper limit");
       u=kb.nextInt();

       for(i=l;i<=u;i++){
           sum=0;
           n=i;

       while(n>0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
 
          }

         if(i==sum){
          System.out.println("number is armstrong number" +i);
       }

      
    }

       

    }

   }
           
       
       
       