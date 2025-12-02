import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int product = n * m;

        int root = (int)Math.sqrt(product);

        if (root * root == product) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
