
  import java.util.Scanner;
  class Vowel{
        public static void main(String args[]){

        char ch;

        Scanner kb =new Scanner(System.in);

         System.out.println("enter any charter");
         
          ch =kb.next().charAt(0);

         if(ch=='a' || ch== 'e' ||ch== 'i' ||ch== 'o' ||ch== 'u'){
         System.out.println("vowel");
       }
     
       else{
       System.out.println("consonent");
    }
  }
}