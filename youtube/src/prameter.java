import java.util.Scanner;

public class prameter {
    public  static void main(String args[]) {
        System.out.print(sumTwoNumber(4,9));
        System.out.print(sumTwoNumber(8,4));
        System.out.println(sumTwoNumber(9,0));
    }
    public static int sumTwoNumber(int first, int second) {
        System.out.println("first number received:"  +first);
        System.out.println("second number received:"  +second);
        int sum = first + second;


        return sum;


    }


    }



