
  import java.util.Scanner;
  class Pelindrome{
        public static void main(String args[]){
        int n,i,sum,rem;
        Scanner kb = new Scanner(System.in);
         n=kb.nextInt();
         i=n;
         sum=0;

        while(n>0){
           rem=n%10;
           sum=sum*10+rem;
           n=n/10;
         }

       if(i==sum){
         System.out.println("number is pelindrome :");
       }

       else{
          System.out.println("number is not pelindrome :");
       }

      }

   }