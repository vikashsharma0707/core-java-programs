 import java.util.Scanner;
        class Function4{
        public static void add(){
        Scanner kb= new Scanner(System.in);
        System.out.println("enter first number:");
        int a=kb.nextInt();

        System.out.println("enter second number:");
        int b=kb.nextInt();

        int c=a+b;
        return c;
   }
    
  public static void main(String args[]){
  int result =add();
  System.out.println("Addition: " +result);
  
   }
  }
 

   