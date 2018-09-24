import java.util.Scanner;

public class Main {
    static int row = 1, column = 1;
    static int sum = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        getNum1();
        if (column != 3) {
            moveColumn();
        }
        if (row != 3)
            moveRow();
        System.out.println(sum);
    }

    private static void moveRow() {
        if (row == 3) return;

        if (row < 3)
            row++;
        else
            row--;
        sum++;
        moveRow();
    }

    private static void moveColumn() {
        if (column == 3) return;

        if (column < 3)
            column++;
        else
            column--;
        sum++;
        moveColumn();

    }

    private static void getNum1() {

        for (int i = 1; i <= 5; i++, row++) {
            column = 1;
            for (int x = 1; x <= 5; x++, column++) {
                byte b = input.nextByte();
                if (b == 1) return;
            }
        }
    }
}
