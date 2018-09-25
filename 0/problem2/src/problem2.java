import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        // L is Limak
        // B is Bob
        // Y is Years

        int L, B, Y;
        Scanner input = new Scanner(System.in);
        L = input.nextInt();
        B = input.nextInt();
        Y = 0;
        do {
            L *= 3;
            B *= 2;
            Y++;
        } while (L <= B);
        System.out.println(Y);


    }
}
