import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        long product = 1;

        if (N == 0) {
            System.out.println(0);
            return;
        }

        while (N > 0) {
            product *= (N % 10);
            N = N / 10;
        }

        System.out.println(product);
    }
}