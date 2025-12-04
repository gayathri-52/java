import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == K) result.add(key);
        }
        if (result.size() == 0) {
            System.out.println("-1");
            return;
        }
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) System.out.print(" ");
        }
    }
}


