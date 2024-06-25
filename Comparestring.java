import java.util.Scanner;
        class Comparestring{
              public static void main(String args[]){
              String a=new String();
              String b= new String();
              Scanner kb =new Scanner(System.in);
              System.out.println("Enter the first word");
              a=kb.nextLine();

              System.out.println("Enter the second word");
              b=kb.nextLine();
 
              if(a.compareTo(b)==0){
              System.out.println("strings are equal");
            }

             else if(a.compareTo(b)>0){
              System.out.println("string a is greater");
            }
   
            else{
                System.out.println("string b is greater");
             }

          }
       }