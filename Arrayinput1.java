  // Taking input and display output and sum of the given array 

   import java.util.Scanner;
    class Arrayinput1{
          public static void main(String args[]){
          int sum=0;
          int arr[]=  new int[5];
           Scanner kb =new Scanner(System.in);
           System.out.println("enter number of array:");

           for(int i=0;i<5;i++){
              arr[i]= kb.nextInt();
          };

           for(int i=0;i<5;i++){
             System.out.println("array numbers area:"+arr[i]);
             sum=sum+arr[i];

          }
           System.out.println("sum of numbers is:" +sum);

       }
     }

          