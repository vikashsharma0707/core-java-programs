  //Java Program to Find Prime Numbers in a Given Range

   import java.util.Scanner;
  class Primerange{
        public static void main(String args[]){
        int i,l,u,count=0;
        Scanner kb=new Scanner(System.in);
    

        System.out.println("Enter the lower range");
        l=kb.nextInt();

        System.out.println("Enter the upper range");
        u=kb.nextInt();
        
        for( i=l;i<=u;i++){
            count=0;

          for(int j=1;j<=i;j++){

             if(i%j==0){
                count++;
             
            }
          }
           if(count==2){
        System.out.println("number is prime number" +i);
      }
 
      else{
       System.out.println("Number is not a prime number");
      }
       }
 
      

     }
    }