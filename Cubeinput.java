 import java.util.Scanner;

 class Cubeinput{
       public static void main(String args[]){
        int n;
        int cube;

   Scanner kb =new Scanner(System.in);
   
   System.out.println("Enter number :");
   n=kb.nextInt();
 
   cube =n*n*n;
 
  System.out.println("cube of the number is :" +cube);

 }
 
 }