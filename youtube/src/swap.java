import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to swapping station\n\n");
        System.out.println("enter the first number a:");
        int a = sc.nextInt();
        System.out.println("enter the second number b:");
        int b = sc.nextInt();
        int c=a;
         a=b;
         b=c;
         System.out.println("SWAPPING DONE ");
         System.out.println("value of A is " + a);
         System.out.println("Value of B is " + b);

    }
}
