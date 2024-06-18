
// nested if

 import java.util.Scanner;
       class Nestedif{
        public static void main(String args[]){
        char c;
        Scanner obj= new Scanner(System.in);
     
        System.out.println("enter any number :");

        c= obj.next().charAt(0);

       if(c>='a'){
               if(c<='z'){
               System.out.println("lower case");
     }

   }
 
   else if(c>='A'){
               if(c<='Z'){
               System.out.println("upper case");
     }

   }

  }
 }
  
    


