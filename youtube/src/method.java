public class method {
    public static void main(String[] args) {
        printfirstpattern();
    }
    public static void printfirstpattern(){
        int row = 0;
        while(row<20){
            System.out.print("*");
            int i= 0;
            while(i<row) {
                System.out.print(" *");
                i = i+1 ;
            }
            System.out.println();
            row++;

        }
    }
}
