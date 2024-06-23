  import java.util.Scanner;
         class Vowelconsonent{
         public static void main(String args[]){
         char ch;
         int n;
    
          Scanner kb=new Scanner(System.in);
          System.out.println("enter any character");
          ch=kb.charAt(0);

          System.out.println("enter any number");
          n=kb.nextInt();
 
          for(ch='A';ch='z';ch++){
            if(ch=='A' && ch=='E' && ch=='I' && ch=='O'  && ch=='U'){
             System.out.println(+ch);
            }
 
             else if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'){
             System.out.println(+ch);
            }

            else{
            System.out.println("number is");
          }

       }

  }
}
              


         