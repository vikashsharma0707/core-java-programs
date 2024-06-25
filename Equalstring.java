 // equals function

   import java.util.Scanner;
   class Equalstring{
         public static void main(String args[]){
         String a = new String();
         String b = new String();

         Scanner kb =new Scanner(System.in);
         System.out.println("enter first word");
         a=kb.nextLine();

         System.out.println("enter second word");
         b=kb.nextLine();
 
         if(a.equals(b)){
             System.out.println("string are equal" );
          }

        else{
           System.out.println("string are not equal" );
        }

       }
     }


