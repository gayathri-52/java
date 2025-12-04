import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        boolean found = false;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int target = X - num;

            if (set.contains(target)) {
                found = true;
            }
            set.add(num);
        }

        System.out.println(found ? "yes" : "no");
    }
}
