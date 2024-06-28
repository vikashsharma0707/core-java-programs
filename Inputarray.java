  import java.util.Scanner;
         class Inputarray{
         public static void main(String args[]){
         int n;
         Scanner kb =new Scanner(System.in);
         System.out.println("enter the number ");
        
         n=kb.nextInt();
         int t;

         for(int i=0;i<=10;i++){
            t=n*i;
          System.out.println(+t);
      }
   }
  }