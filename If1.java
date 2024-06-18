import java.util.Scanner;
       class If1{
             public static void main(String args[]){
             char n;
             int n1,n2,n3;
             Scanner obj=new Scanner(System.in);
  
             System.out.println("Enter charcter");
             n=obj.next().charAt(0);
             
             System.out.println("Enter first number");
             n1=obj.nextInt();

             System.out.println("Enter second number");
             n2=obj.nextInt();

             if(n=='+'){
             n3=n1+n2;
             System.out.println(+n3);
            }

            else if(n=='-'){
             n3=n1-n2;
             System.out.println(+n3);
            }

           else if(n=='*'){
             n3=n1*n2;
             System.out.println(+n3);
            }


           else if(n=='/'){
             n3=n1/n2;
             System.out.println(+n3);
            }


       
     }
    }

 

           