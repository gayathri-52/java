import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int length = 0;
        for (char c : S.toCharArray()) length++;
        System.out.println(length);
    }
}



