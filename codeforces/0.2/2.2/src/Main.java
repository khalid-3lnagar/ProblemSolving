import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int emptyTimes = 0,
                orangesCount = in.nextInt(),
                maxSize = in.nextInt(),
                maxTotal = in.nextInt(),
                orange;
        double juicer = 0;
        for (int i = 0; i < orangesCount; i++) {
            orange = in.nextInt();
            if (!(orange > maxSize)) juicer += orange;
            if (juicer > maxTotal) {
                juicer = 0;
                emptyTimes++;
            }

        }
        System.out.println(emptyTimes);
    }
}
