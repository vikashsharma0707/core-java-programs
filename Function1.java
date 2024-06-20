  import java.util.Scanner;
  class Function1{
        public static void add(){
        Scanner kb =new Scanner(System.in);
        System.out.println("enter first number");
        int n1 =kb.nextInt();

        System.out.println("enter second number");
        int n2 =kb.nextInt();

        int n3=n1+n2;
        System.out.println("Addition :" +n3);

       }
    
     public static void main(String args[]){
        add();
    }
  }