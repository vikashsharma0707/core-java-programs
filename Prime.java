   //Java Program to Check Prime Number
  
   import java.util.Scanner;
   class Prime{
         public static void main(String args[]){
         int n,count=0;
         Scanner kb =new Scanner(System.in);
         System.out.println("enter any number");
         n=kb.nextInt();
 
         for(int i=1;i<=n;i++){
            if(n%i==0){
             count++;
           }
         }

        if(count==2){
          System.out.println("number is prime number");
       }
  
        else{
        System.out.println("number is not a prime number");
      }

   }
  }