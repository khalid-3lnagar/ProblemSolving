import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int oskolsNum = in.nextInt();
        int[] oskols = new int[oskolsNum];
        for (int i = 0; i < oskolsNum; i++) {
            oskols[i] = in.nextInt();
        }
        int n, l, r, x;
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            l = in.nextInt();
            int z = oskols[x - 1];
            r = z - l;
            l--;
            if (r < 1) r = 0;

            oskols[x - 1] = 0;

            if (x > 1) oskols[x - 2] += l;
            if (x < oskolsNum) oskols[x] += r;

           /* for (int oskol : oskols
            ) {
                System.out.print(oskol + " ");

            }*/

        }
        for (int oskol : oskols
        ) {
            System.out.println(oskol);

        }
    }
}
