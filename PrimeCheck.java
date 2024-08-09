
public class PrimeCheck {

    public static void main(String[] args){
        int number=3;

        int countDiv=0;
        for(int i=0;i<=number;i++){
            if(number%i==0){
                countDiv++;
            }

        }


        if(countDiv==2) {
            System.out.println("prime number");
        }
        
        else{
            System.out.println("not a prime number");
        }
    }

}
