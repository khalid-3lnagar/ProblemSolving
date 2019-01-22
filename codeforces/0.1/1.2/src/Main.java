import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] stones = in.next().toCharArray();

        int count = 0;

        for (int i = 0, x = 1; i < n; i++, x++) {
            if (x == n) break;
            if (stones[i] == stones[x]) {
                count++;
            }
        }
        in.close();
        System.out.println(count);

    }
}
