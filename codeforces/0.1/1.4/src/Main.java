import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] n = new int[4];

        for (int i = 0; i < 4; i++) {
            n[i] = input.nextInt();
        }

        char[] s = input.next().toCharArray();

        int count = 0;

        for (char c :
                s) {
            count += n[Integer.parseInt(String.valueOf(c)) - 1];

        }
        System.out.println(count);

    }
}
