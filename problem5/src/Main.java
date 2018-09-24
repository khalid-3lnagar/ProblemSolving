import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        int i = input.nextInt();
        int[] x = new int[i];
        for (int j = 0; j < i; j++) {
            x[j] = input.nextInt();
        }
        Arrays.sort(x);
        for (int j :
               x ) {
            System.out.print(j  +" ");
        }
    }


}

