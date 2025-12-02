import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) % 2 == 1) {   // odd position (1-based)
                odd.append(s.charAt(i));
            } else {                 // even position
                even.append(s.charAt(i));
            }
        }

        System.out.println(odd + " " + even);
    }
}