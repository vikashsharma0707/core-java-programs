  import java.util.Scanner;

   class Classobject{
         int a,b,c;
       
         public void input(){
         Scanner kb =new Scanner(System.in);
         System.out.println("Enter the first number :" +a);
         a=kb.nextInt();
         System.out.println("Enter the first number :" +b);
         b=kb.nextInt();
       }

       public void sum(){
       c=a+b;
       System.out.println("Addition of two number is :" +c);
    }

   

   public static void main(String args[]){
    Classobject obj= new Classobject();
    obj.input();
    obj.sum();
  }

  }
         
     
         
   