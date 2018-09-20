import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {


        int num, D, A;
        char x;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        D = 0;
        A = 0;
        String s = input.next();

        for (int i = 0; i < num; i++) {

            x = s.charAt(i);

            if (x == 'A')
                A++;
            if (x == 'D')
                D++;


        }
        if (D == A)
            System.out.println("Friendship");
        else if (A > D)
            System.out.println("Anton");
        else
            System.out.println("Danik");
    }
}


