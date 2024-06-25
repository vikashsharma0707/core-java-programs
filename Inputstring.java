  // How to take input in string in java.

   import java.util.Scanner;
         class Inputstring{
               public static void main(String args[]){
               String str= new String();
               String subject= new String();
               Scanner kb =new Scanner(System.in);
               System.out.println("Enter your name: ");
              
               str=kb.next();
               System.out.println("name :" +str);

                System.out.println("Enter your subject: ");

               subject=kb.next();
               System.out.println("subject :" +subject);

           }
         }