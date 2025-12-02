import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        String reversed = new StringBuilder(S).reverse().toString();
        if (S.equals(reversed))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}