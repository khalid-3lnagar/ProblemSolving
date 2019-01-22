import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //('a..z' = 26)
        ///2 = 13
        Scanner input = new Scanner(System.in);
        char[] chars = input.next().toCharArray();
        char cursor = 'a';
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            int moves = 0;
            while (chars[i] != cursor) {
                cursor++;
                moves++;

                if (cursor == 'z'+1 ) cursor = 'a';
            }
            if (moves > 13) counter = counter + (26 - moves);
            else counter += moves;

        }
        System.out.println(counter);
        {

        }
    }
}
