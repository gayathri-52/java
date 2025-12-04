import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = sc.nextInt();

        int maxLen = 1, curr = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] == a[i - 1]) curr++;
            else {
                maxLen = Math.max(maxLen, curr);
                curr = 1;
            }
        }
        maxLen = Math.max(maxLen, curr);

        if (maxLen == 1) System.out.println("-1");
        else System.out.println(maxLen);
    }
}



