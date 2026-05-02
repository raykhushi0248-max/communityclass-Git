import java.util.Scanner;

public class oddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to sum of odd no.\n");
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = printoddSum(num);
        System.out.println("Odd sum till " + num + " is " + sum);
    }
    public static int printoddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + 1;
            i = i + 2;
        }

        return sum;
    }
}

