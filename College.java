
  abstract class RGPV{
           public static void lab();
           public static void cctv();
       // abstract

     public void examCopyCheck(){
             System.out.println("This is RGPV non abstract method ");
    }

    public RGPV(){
           System.out.println("this is RGPV constructor ");
     }
  }

   public College extends RGPV{
          public void cctv(){
              System.out.println("This is cctv method rule by RGPV");
          }

         public void lab(){
              System.out.println("This is lab method rule by RGPV");
          }

         public void staff(){
              System.out.println("This is college method rule by RGPV");
          }

         public College(){
              System.out.println("This is college constructor");
          }

          public static void main(String args[]){
           RGPV obj =new College();
           
           
           obj.examCopyCheck();
           College c=new College();
           c.cctv();
           c.lab();
           c.examCopyCheck();
           c.staff();
       }
     }
         

          