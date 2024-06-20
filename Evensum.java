 //Java Program to Find the Sum of Even and Odd Numbers

 import java.util.Scanner;
  class Evensum{
        public static void main(String args[]){
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter any number");
        int sum=0;
        int n;
        n=kb.nextInt();
   
        for(int i=0;i<=n;i++){
           if(i%2==0){
           sum=sum+i;
           System.out.println("even number is :" +i);
          }

         else{
        System.out.println("odd number is :" +i);
        sum=sum+i;
         }

       }
        System.out.println("sum of even number is" +sum);
        System.out.println("sum of odd number is " +sum);

    }
 }