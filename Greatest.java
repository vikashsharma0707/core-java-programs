  
 //Java Program to Find the Largest Number Among Three Numbers
 import java.util.Scanner;
   class Greatest{
         public static void main(String args[]){
         int n1,n2,n3;
         Scanner kb =new Scanner(System.in);
         System.out.println("enter the fist number");
         n1=kb.nextInt();
    
         System.out.println("enter the second number");
         n2=kb.nextInt();
  
         System.out.println("enter the third number");
         n3=kb.nextInt();

        if(n1>n2 && n1>n3){
        System.out.println("n1 is greatest" +n1);
        }
 
        else if(n2>n1 && n2>n3){
        System.out.println("n2 is greatest" +n2);
      }


      else{
       System.out.println("n3 is greatest" +n3);
    }


    }

  }
         
   
   
   
   