import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int n = S.length();
        StringBuilder result = new StringBuilder(S);

        if (n % 2 == 1) {  
            
            int mid = n / 2;
            result.setCharAt(mid, '*');
        } 
        else 
        {  
            
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            result.setCharAt(mid1, '*');
            result.setCharAt(mid2, '*');
        }

        System.out.println(result.toString());
    }
}
