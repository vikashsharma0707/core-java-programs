
  import java.util.Scanner;
  class Whileloop2{
        public static void main(String args[]){
        int i,n;

       Scanner kb= new Scanner(System.in);
       System.out.println("enter any number");

       n=kb.nextInt();
       System.out.println("========================");
      
    while(i<=10){
        System.out.println(n*i);
        i++;
    }
 }
 }