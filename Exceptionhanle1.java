 class Exceptionhanle1{
       public static void main(String args[]){
       int num=0;

      try{
    
         num=Integer.parseInt(args[0]);
       }


      catch(ArrayIndexOutOfBoundsException ae){ 
           System.out.println("please enter at least one arument ");
     }

      catch(NumberFormatException ne){ 
           System.out.println("please enter numeric value only");
     }

      System.out.println("Result :" +(int)(Math.pow(num,2)));
    }
  }

    