  import java.util.Scanner;

 class Ifelse{
        public static void main(String args[]){
        int n;
    
       Scanner kb = new Scanner(System.in);
       System.out.println("enter any number");

       n =kb.nextInt();

      if(n%2==0){
       
        System.out.println("Number is even");
     }

      else{
       
        System.out.println("Number is odd");
     }
       
   }
  }