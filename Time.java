/*1. Write a Java program to convert a given integer (in seconds) to hours, minutes andseconds.
Test Data :
Input seconds: 25300Expected
Output:
There are:
H:M:S - 7:1:40*/

 // question 1
  class Time{
        public static void main(String args[]){
    
        int seconds;
        seconds=25300;
        System.out.println(" input seconds is:" +seconds);
   
       int hours=seconds/3600;
       System.out.println(" Hours :" +hours);

       int remaining= seconds%3600;
       System.out.println("Remaining seconds :" +remaining);

      int minute =remaining/60;
      System.out.println("Minute :" +minute);

      remaining = remaining%60;
      System.out.println("Second :" +remaining);

     }
   }