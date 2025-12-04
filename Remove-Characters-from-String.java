import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        Set<Character> set = new HashSet<>();
        for(char c : S2.toCharArray()) set.add(c);
        StringBuilder sb = new StringBuilder();
        for(char c : S1.toCharArray()) if(!set.contains(c)) sb.append(c);
        System.out.print(sb.length() == 0 ? "-1" : sb.toString());
    }
}
