
 class A{
       public void show(){
            System.out.println("this is A class :");
      }

    }

 
 class B extends A {
       public void show1(){
            System.out.println("this is B class :");
      }

    }

 public class Main{
        public static void main(String args[]){
        B obj = new B();
        obj.show();
        obj.show1();
   }
 }

 