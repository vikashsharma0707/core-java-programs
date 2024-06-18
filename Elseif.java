  
 import java.util.Scanner;

 class Elseif{
       public static void main(String args[]){
       char ch;
   
      Scanner kb =new Scanner(System.in);
      System.out.println("Enter any number :");

      ch =kb.next().charAt(0);

      if(ch>='a'  &&  ch<='z'){
      System.out.println("this is lowercase charcter :");
   }

       else if(ch>='A'  &&  ch<='Z'){
      System.out.println("this is uppercase charcter :");
   }

     else if(ch>='0'  &&  ch<='9'){
      System.out.println("this is low charcter :");
   }

    else{
       System.out.println("this is else  :");
     }
  }
 }
