  import java.util.Scanner;
  class Function5{
        public static void add(){
        return a+b;
   }

    public static void main(String args[]){
    Scanner kb= new Scanner(System.in);
    System.out.println("enter first number:");
    int a= kb.nextInt();

    System.out.println("enter second number:");
    int b= kb.nextInt();

    int result =add(a,b);
    System.out.println("addition: " +result);
  
  }
 }
