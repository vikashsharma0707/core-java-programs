// step 1:
import java.util.Scanner;
  class Circle1{
        public static void main(String args[]){
        float r,ar,cr;
       
// step 2:
        Scanner obj= new Scanner(System.in);
// step3:
        System.out.println("Enter Radius :");
        r=obj.nextFloat();
        ar=3.14f*r*r;
        cr=2*3.14f*r;
  
        System.out.println("Area of circle is: " +ar);
        System.out.println("circumference of circle is: " +cr);


     } 
   }
