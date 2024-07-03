   import java.util.Scanner;
   class Armstronghpnr{
        public static void Add(int n){
          int i,sum,rem;
        
          i=n;
          sum=0;

         while(n>0){
          rem=n%10;
          sum=sum+(rem*rem*rem);
          n=n/10;
        }
  
        if(i==sum){
          System.out.println("Number is armstrong :");
        }
  
        else{
          System.out.println("Number is not a armstrong :");
       }
   }
 
      public static void main(String args[]){
             int n;
          Scanner kb =new Scanner(System.in);
          n=kb.nextInt();
        System.out.println("Enter any number :" +n);
        Add(n);
   }

  
 }
       