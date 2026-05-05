import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("enter your age: ");
         age = input.nextInt();
        switch (age) {
            case 18:
                System.out.print("you are going to become an Adult");
                break;
            case 23:
                System.out.print("you are going to join job");
                break;
            case 60:
                System.out.print("you are going to get retired!");
                break;
                default:
                    System.out.println("enjoy your life");
        }
    }
}
