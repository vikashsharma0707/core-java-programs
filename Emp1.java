import java.util.Scanner;
 
 class Emp1{
       public static void main(String args[]){
       
       Scanner obj =new Scanner(System.in);
       System.out.println("Enter name of the Employee:");
       String name =obj.nextLine();

       System.out.println("enter salary: ");
       float sal =obj.nextFloat();

       obj.nextLine();

       System.out.println("enetr job profile");
       String profile =obj.nextLine();
       
       System.out.println("enter Empno: ");
      int empno =obj.nextInt();

      System.out.println("enter Depno: ");
      int deptno =obj.nextInt();

      System.out.println("enter grade: ");
      char g= obj.next().charAt(0);



     System.out.println("Name: " +name);
     System.out.println("salary: " +sal);
     System.out.println("job profile: " +profile);
     System.out.println("Emp no: " +empno);
     System.out.println("deptno: " +deptno);
     System.out.println("Grade: " +g);

   }
  }
     