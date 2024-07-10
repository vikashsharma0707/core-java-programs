 
  interface A{
       
     void show();

   }

   interface B{
       
     void show1();  

   }

 class C implements A,B {
        public void show(){
         System.out.println("This is A class:");
      }
           public void show1(){
         System.out.println("This is B class:");
      }
       
       public void show2(){
         System.out.println("This is C class:");
      }

   }

  public class Main2{
         public static void main(String args[]){
         C obj =new C();
         obj.show();
         obj.show1();
         obj.show2();
    }
   }