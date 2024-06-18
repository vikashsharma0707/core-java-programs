import java.util.Scanner;
   class Armstrong{
         public static void main(String args[]){
      
         int sum,rem,i;
         int n;
         

         Scanner kb= new Scanner(System.in);
         System.out.println("enter any number");
         n= kb.nextInt();
         sum=0;
         i=n;

         while(n>0){
          rem=n%10;
          sum=sum+(rem*rem*rem);
          n=n/10;

         }
 
      if(i==sum){
       System.out.println("armstrong number");

      }
  
     else{
     System.out.println("not a armstrong number");
   }
  }

 }