import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //n is number of problems
        int n = input.nextInt();
        //the number of problems the number of problems
        int sum = 0;
        byte[] i = new byte[3];

        for (int x = 0; x < n; x++) {
            for (int r = 0; r < 3; r++) {
                i[r] = input.nextByte();
            }
            if (
                    i[0] == 1 && i[1] == 1 ||
                            i[1] == 1 && i[2] == 1 ||
                            i[0] == 1 && i[2] == 1) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
