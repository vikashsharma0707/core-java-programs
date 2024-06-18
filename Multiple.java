 import java.util.Scanner;


  class Multiple{

      public static void main(String args[]);
      Scanner kb= new Scanner(System.in);
      System.out.println("Enter name:");
      String name= kb.nextLine();


      System.out.println("Enter salary: ");
      float sal=kb.nextFloat();
       
      kb.nextLine();

      System.out.println("Enter job profile:");
      String job= kb.nextLine();

      System.out.println("Enter Empno:");
      int em= kb.nextInt();

      System.out.println("Enter DeptNo:");
      int de= kb.nextInt();

       System.out.println("Enter grade:");
       char g= kb.next().charAt(0);


       System.out.println("Name:" +name);
       System.out.println("salary:" +sal);
       System.out.println("Enter job profile:" +job);
       System.out.println("Enter Empno:" +em);
       System.out.println("Enter DeptNo:" +de);
       System.out.println("Enter grade:" +g);

   }
 }
     
       
      

      
      
