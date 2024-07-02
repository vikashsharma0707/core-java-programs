 
 class Defaultconstructor{
       String name;
       int age;
       float salary;

    
          public Defaultconstructor(){
             name="jay";
             age=24;
             salary=10000;
     }

       public void show(){
            System.out.println("Name :" +name);
            System.out.println("Age :" +age);
            System.out.println("Salary :" +salary);
     }

  

   public static void main(String args[]){
      Defaultconstructor  obj= new  Defaultconstructor();
      obj.show();
  }
 }
       
         
       