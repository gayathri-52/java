import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        sc.close();

        int count = 0;
        int idx = -1;

        
        for (int i = 1; i < N; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
                idx = i;
            }
        }

        if (count == 0) {
            
            System.out.println("-1");
        } else if (count == 1) {
            
            System.out.println(idx - 1);
        } else {
           
            System.out.println("-1");
        }
    }
}
   