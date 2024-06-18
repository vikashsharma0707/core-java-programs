 import java.util.Scanner;
  class Binarynumber{
   public static void main(String args[]){
   int n;
   Scanner sk= new Scanner(System.in);
   System.out.println("enter any number");
   n=sk.nextInt();
  
   int arr[] =new int[32];
   int i=0;
   while(n>0){
   int r= n%2;
   arr[i]=r;
   i++;
   n=n/2;
 }
 
  System.out.println("Binary number :");
  for(i=0;i>=0;i++){
  System.out.println("\t" +arr[i]);

   }
  }
}
    