import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int police = 0, crime = 0, count = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int r = input.nextInt();

            if (r > 0) {
                police += r;
            } else {
                if (police == 0) {
                    count++;
                    crime++;
                } else {
                        police--;
                }
            }

        }
        System.out.println(count);
    }

}
