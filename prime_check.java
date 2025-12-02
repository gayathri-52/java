import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N <= 1) {
            System.out.println("no");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
