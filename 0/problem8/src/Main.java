import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        int upper = 0, lower = 0;
        s = input.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) > 96 && s.codePointAt(i) < 123) lower++;
            else if (s.codePointAt(i) > 64 && s.codePointAt(i) < 91)
                upper++;
        }
        if (lower > upper || lower == upper) {
            System.out.println(s.toLowerCase());
        } else {
            System.out.println(s.toUpperCase());
        }
    }
}
