
 
 import java.util.Scanner;
   
        class Convert{
              public static void main(String args[]){
    
          int inputno;
          int rm,years,month,days;
          Scanner kb = new Scanner(System.in);
          System.out.println("enter the input number: ");
          inputno = kb.nextInt();

          System.out.println("enter the years number: ");
           years = kb.nextInt();

          years =inputno/years;
          System.out.println("years is: " +years);

          rm=inputno-years*365;
          System.out.println("Remaning days : " +rm);

          System.out.println("enter the month number: ");
           month = kb.nextInt();
           
          month=rm/month;  

          System.out.println("month is: " +rm);

          rm=rm-month*30;
         System.out.println("Days is: " +rm);   
        
     }
  }
           

          
  