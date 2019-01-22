import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int die = 6;
        int dot = 7 - Math.max(in.nextInt(), in.nextInt());

        if (dot == 0) {
            System.out.println("0/1");
            return;
        }


        while (die % 2 == 0 && dot % 2 == 0) {
            dot /= 2;
            die /= 2;

        }
        if (die % dot == 0) {
            die /= dot;
            dot /= dot;

        }

        if (dot == die)
            System.out.println("1/1");
        else
            System.out.println(dot + "/" + die);


    }
}
