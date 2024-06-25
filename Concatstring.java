  // Concatination function in string

    import java.util.Scanner;
          class Concatstring{
                public static void main(String args[]){
                String a= new String();
                String b= new String();
                Scanner kb =new Scanner(System.in);
                System.out.println("enter first string");
                a=kb.nextLine();
              
                System.out.println("enter second string");
                b=kb.nextLine();

                String c= new String();
                c=a.concat(b);

                System.out.println("concatinatio string is:" +c);
            }
          }