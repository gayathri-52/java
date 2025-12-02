import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (x < min) min = x;
        }
        System.out.println(min);
    }
}
