import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (K > N || K < 1) {
            System.out.println(-1);
            return;
        }
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int distinctCount = 0;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] != prev) {
                distinctCount++;
                prev = arr[i];
            }
            if (distinctCount == K) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}


