// step 1:
import java.util.Scanner;
  class Circle2{
        public static void main(String args[]){
        double r,ar,cr;
       
// step 2:
        Scanner obj= new Scanner(System.in);
// step3:
        System.out.println("Enter Radius :");
        r=obj.nextDouble();
        ar=3.14f*r*r;
        cr=2*3.14f*r;
  
        System.out.println("Area of circle is: " +ar);
        System.out.println("circumference of circle is: " +cr);


     } 
   }
