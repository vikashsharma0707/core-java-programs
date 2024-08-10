  //wap to accept a 10 digit from a user a string and print all the even digits of that number on the console

  import java.util. Scanner;
 
  class Print{
       public static void main(String args[]){
       String n;
      
   
      Scanner kb =new Scanner(System.in);
      n=kb.nextLine();
     int num = Integer.parseInt(n);

      for(int i=0;i<n.length();i++){  

          char digitChar =nString.charAt(i);
          int digit =Integer.parseInt(digitChar + "");
          if(digit%2==0){
           System.out.println(digit);
     }
      
   }
 }
}

    