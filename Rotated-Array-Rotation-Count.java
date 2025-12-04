import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] arr = new int[M];
        for(int i=0;i<M;i++) arr[i] = sc.nextInt();
        int idx = 0;
        for(int i=1;i<M;i++) if(arr[i] < arr[idx]) idx = i;
        System.out.print(idx == 0 ? -1 : idx);
    }
}
