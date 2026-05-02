import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to perimeter calculotor:");
        System.out.println("please write all four sides:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int perimeter = a+b+c+d;
        System.out.println("perimeter of rectangle:"+perimeter);
    }
}
