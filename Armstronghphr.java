   import java.util.Scanner;
   class Armstronghphr{
        public static String Add(int n){
          int i,sum,rem;
          i=n;
          sum=0;

         while(n>0){
          rem=n%10;
          sum=sum+(rem*rem*rem);
          n=n/10;
        }
  
        if(i==sum){
          return "yes";
        }
  
        else{
          return "no";
       }
   }
 
      public static void main(String args[]){
           int n;
          Scanner kb =new Scanner(System.in);
          n=kb.nextInt();
          System.out.println("enetr any number :" +n);
          
          String result =Add(n);
          System.out.println(result); 
      
   } 
 }
       