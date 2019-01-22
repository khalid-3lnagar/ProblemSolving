import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        LinkedList<Character> i = new LinkedList<>();
        s = input.next();

        for (int j = 0; j < s.length(); j++) {
            if (!i.contains(s.charAt(j))
            ) i.add(s.charAt(j));
        }
        if ((i.size() % 2) == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
