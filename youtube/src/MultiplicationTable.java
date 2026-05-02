import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Multiplication Table\n");
        System.out.println("enter the your number");
        int num = input.nextInt();
        printMultiplictionTable(num);
    }
    public static void printMultiplictionTable(int num){
        int i = 1;
        while(i<=10){
            System.out.println(num + "x" + i + " = " + (num*i));
            i++;
        }
    }
}
