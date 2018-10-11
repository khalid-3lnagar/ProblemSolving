import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int position = 0;
        char[] data;
        Queue<Character> instru = new LinkedList<>();

        Scanner in = new Scanner(System.in);
        data = in.next().toCharArray();
        String t = in.next();
        for (int i = 0; i < t.length(); i++) {
            instru.add(t.charAt(i));
        }
        while (!instru.isEmpty()) {

            if (instru.poll() == data[position]) {
                if (position == data.length - 1) break;
                    position++;
            }

        }

        System.out.println(position + 1);

    }


}
