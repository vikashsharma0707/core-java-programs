  class fibonaccirecursion{
        public static int Fact(int n){
         if(n==1){
          return 1;
         }
 

       else{
         return n*fact(n-1);
      }
   
      public static void main(String args[]){
      System.out.println("factorial: " +Fact(5));
    }
  }
        