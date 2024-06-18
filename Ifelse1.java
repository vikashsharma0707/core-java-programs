  import java.util.Scanner;

 class Ifelse{
        public static void main(String args[]){
        int n;
    
       Scanner kb = new Scanner(System.in);
       System.out.println("enter any number");

       n =kb.nextInt();

      if(n>0){
       
        System.out.println("Number is positive");
     }

      else{
       
        System.out.println("Number is negative");
     }
       
   }
  }