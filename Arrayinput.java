  //  how to take input and display number in array

     import java.util.Scanner;
       class Arrayinput{
             public static void main(String args[]){
             int arr[]= new int[10];

          Scanner kb =new Scanner(System.in);
    
          for(int i=0;i<10;i++){
            System.out.println("Enter array number :");
            arr[i] = kb.nextInt();
         }

           for(int i=0;i<10;i++){
            System.out.println("array number are :" +arr[i]);
            
         }
    }
  }

         
         