 class Emp{
       String name;
       float sal;
       int deptno;
 
       public Emp(){
       System.out.println("Default contructor is called");
       name="guest";
       sal=1000;
       deptno=10;
    }

     public void showData(){
     System.out.println("Name :" +name);
     System.out.println("Salary" :+sal);
     System.out.println("Deptno: deptno);
   }
     public static void main(String args[]){
      Emp e =new Emp();
      e.showData();
      e1.showData();
      e2.showData();
   }

 }
      
     
   
     
     
       
       