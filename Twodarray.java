  // 2d array taking input and display the given array
 import java.util.Scanner;
 class Twodarray{
       public static void main(String args[]){
       int arr[][]=new int[3][3];
     Scanner kb=new Scanner(System.in);
     System.out.println("enter the number of arrays");
 
     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
         arr[i][j]=kb.nextInt();
     }
   }

     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
         System.out.println(arr[i][j] + "  " );
         
     }
   System.out.println();
   }

    }
  }

   