import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        
        String vowels = "aeiouAEIOU";
        boolean hasVowel = false;
        
        for (char c : S.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                hasVowel = true;
                break;
            }
        }
        
        if (hasVowel)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}