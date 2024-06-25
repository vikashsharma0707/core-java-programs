   // program for count vowel and consonent in string

   import java.util.Scanner;
         class Vowelstring{
               public static void main(String args[]){
               int vowel=0,consonent=0;
               String str= new String();
               Scanner kb =new Scanner(System.in);
               System.out.println("enter any world");

               str=kb.nextLine();
               for(int i=0;i<str.length();i++){
                      char ch = str.charAt(i);
                       if(ch!=' '){

                    if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                       vowel++;
                    }
 
                   else{
                    consonent++;
                 }
             }
       
              
          }
             System.out.println("number of vowel is: " +vowel);
             System.out.println("number of consonent is: " +consonent);

        }
      }