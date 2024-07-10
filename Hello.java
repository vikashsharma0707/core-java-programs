  
 class TestFinal{
       final int x;
           public TestFinal(){
              x=20;
         }

}
 class Hello extends TestFinal{
 
  public void show(){
          System.out.println("this is parent class show :"+x);
     }

  public static void main(String args[]){
         final int b=10;
         Hello t=new Hello();
         System.out.println("Final local variable :"+b);
         t.show();
   }
 }
