 class Parameterconstructor{
       String name;
       int age;
       float salary;
   
     public  Parameterconstructor(String n,int a,float f){
             name=n;
             age=a;
             salary=f;
       }

     public void show(){
           System.out.println("Name :" +name);
           System.out.println("Age :" +age);
           System.out.println("Salary :" +salary);
    }
 
    public static void main(String args[]){
           Parameterconstructor obj =new Parameterconstructor("jay",24,10000);
           obj.show();
     }
    }
            