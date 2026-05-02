public class factorialExample {
    public static void main(String[] args) {
        int n=5;
        long result = findfactorial(n);
        System.out.println("Factorial of "+n+" is "+result);
    }
    public static long findfactorial(int num){
        long fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
