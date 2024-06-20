import java.util.Scanner;
 class Array2d{
       public static void main(String args[]){
       int A[]= new int[3][3];
       Scanner kb= new Scanner(System.in);
       int r,c;

    for(r=0;r<3;r++){
       for(c=0;c<3;c++){
    System.out.println("enter element index" +r+c);
    A[r][c]=kb.nextInt();
  }
 }

 System.out.println("array element are:");
 for(r=0;r<3;r++){
   for(c=0;c<3;c++){
   System.out.println("\t"+A[r][c]);
 }
 
 System.out.println("");
 }

 }
 }
       
