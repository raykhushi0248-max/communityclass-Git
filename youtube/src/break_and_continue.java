public class break_and_continue {
    public static void main(String[] args) {
        System.out.print("start looping:\n ");
        for(int i=1; i<=50; i++) {
            System.out.println(i);
            if (i == 44) {
                System.out.println("ending the loop");
                break;
            }
        }
}   }
// for continue- it ignore only given value then continue next value.by above it not run 44 value after next
// code will by condition given.