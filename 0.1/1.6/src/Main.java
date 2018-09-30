import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        byte[][] x = new byte[n][2];
        int count = 0;
        //get the data
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                x[i][j] = input.nextByte();
            }
        }
        //check if A team closes color is equal to eny team
        //Try all possibilities (brute force)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x[i][0] == x[j][1]) count++;
            }
        }
        System.out.println(count);
    }

}

