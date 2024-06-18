// take input from user

//step1:
  
  import java.util.Scanner;
   
  class Add2{
        public static void main(String args[]){
     
        Scanner kb=new Scanner(System.in);
        

        System.out.println("Enter first number :");
        int n1=kb.nextInt();
       

        System.out.println("Enter second number :");
        int n2=kb.nextInt();

      int n3=n1+n2;
      System.out.println("Addition :"+n3);

     }

  }