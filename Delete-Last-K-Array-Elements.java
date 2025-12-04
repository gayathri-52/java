import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
        int limit = N - K;
        for(int i=0;i<limit;i++) System.out.print(arr[i] + (i < limit-1 ? " " : ""));
    }
}
