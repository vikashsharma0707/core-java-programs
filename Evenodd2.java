   //Java Program to Check Whether a Given Number is Even or Odd

    import java.util.Scanner;
    class Evenodd2{
          public static void main(String args[]){
          int n,sum=0, evensum, oddsum;
          Scanner kb= new Scanner(System.in);
          System.out.println("enter any number");
          n=kb.nextInt();
         
          for(int i=0;i<=n;i++){
          if(i%2==0){
              evensum=sum+i;
             System.out.println("number is even" +i);
            
          }

           else{
              System.out.println("number is odd" +i);
                oddsum=sum+i;
             
          }
    
        }
          System.out.println("even sum is " +evensum);
          System.out.println("odd sum is " +oddsum);
 
         }
      }
 
     
 