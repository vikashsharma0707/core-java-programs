  class Polymorphism{
        public void add(){
         int a,b,c;
         a=10;
          b=20;
         c=a+b;
     System.out.println("addition without argument" +c);
  }
   
   public int add(int a,int b){
   int c;
   a=10;
   b=20;
   c=a+b;
  System.out.println("addition with two int arguments " +c);
 return c;
 }

    public void add(float a,float b){
     float c=a+b;
    System.out.println("Add two float :" +c);
  }
   
   public void add(double ,double b){
    double c=a+b;
   System.out.println("add two string :" +c);
  }

  }

    public static void main(String args[]){
      ob1 obj =new Polymorphism();
  obj.add();
  obj.add(5,7);
  obj.add(12.5,2.5);
  obj.add(2.5f,2.5f);
  obj.add("1","1");
  }

  }