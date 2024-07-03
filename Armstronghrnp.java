   import java.util.Scanner;
   class Armstronghrnp{
        public static String Add(){
          int n,i,sum,rem;
          Scanner kb =new Scanner(System.in);
          n=kb.nextInt();
           System.out.println("enter any number :" +n);
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
           String result =  Add();
           System.out.println(result);
      
   }

  
 }
       