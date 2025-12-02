import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char K = sc.next().charAt(0);
        int position = -1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == K) {
                position = i + 1;
                break;
            }
        }
        System.out.println(position);
    }
}

