 import java.util.Scanner;
   class function2{
         public static void evenodd(){
         Scanner kb= new Scanner(System.in);
       
        System.out.println("enter any number");
        int n= kb.nextInt();
     
        if(n%2==0){
        System.out.println("this is even number");
    }
   
      else{
       System.out.println("this is odd number");
    }
   }

  public static void main(String args[]){
    evenodd();
    }
  }
