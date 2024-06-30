 class Emp1{
       String name;
       float sal;
       int deptno;
 
       public Emp1(){
       System.out.println("Default contructor is called");
       name="guest";
       sal=1000;
       deptno=10;
    }
   
    public Emp1(String n,float f,int i ){
         name=n;
         sal=f;
         deptno=i;
    }
         
     

     public void showData(){
     System.out.println("Name :" +name);
     System.out.println("Salary" +sal);
     System.out.println("Deptno:" +deptno);
   }
     public static void main(String args[]){
      Emp1 e =new Emp1("Rahul",1000,10000);
      e.showData();
      
   }

 }
      
     
   
     
     
       
       