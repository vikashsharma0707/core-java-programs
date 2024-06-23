  
  //Java Program to Print Multiplication Table

  import java.util.Scanner;
  class Table{
        public static void main(String args[]){
        int n;
        Scanner kb=new Scanner(System.in);
        
        System.out.println("enter any number");
        n=kb.nextInt();


        for(int i=0;i<=10;i++){
            int a=n*i;
        System.out.println( +a);

    }
  }
 }