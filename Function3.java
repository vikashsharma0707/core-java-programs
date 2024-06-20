 import java.util.Scanner;
  class Function3{
       public static void printTable(int n){
       

      for(int i=1;i<=10;i++){
       System.out.printf("\n%d * %d =%d",n,i,n*i);
     }
   }
  
   public static void main(String args[]){
   Scanner sk=new Scanner(System.in);
   int a=sk.nextInt();
   printTable(a);

  }
 }