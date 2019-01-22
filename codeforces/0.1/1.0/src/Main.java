import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] x = new int[input.nextInt()];

        int count = 0;
        for (int i = 0; i < x.length; i++) {
            x[i]=input.nextByte();
        }


        for (int i = 0, r=1; i < x.length; i++,r++)
            try {
                if (x[i] != x[r]) {
                    count++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                count++;
                break;
            }
        System.out.println(count);

    }
}
