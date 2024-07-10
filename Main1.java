import java.util.Scanner;

class A {
    int a, b, add;

    public void input() {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        a = kb.nextInt();
        
        System.out.println("Enter the second number:");
        b = kb.nextInt();
    }

    public void sum() {
        add = a + b;
        System.out.println("Sum of first and second number: " + add);
    }
}

class B extends A {
    int c, add1;

    public void input1() {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter the third number:");
        c = kb.nextInt();
    }

    public void sum1() {
        add1 = add + c;
        System.out.println("Sum of all three numbers: " + add1);
    }
}

public class Main1 {
    public static void main(String args[]) {
        B obj = new B();
        obj.input();
        obj.sum();
        obj.input1();
        obj.sum1();
    }
}