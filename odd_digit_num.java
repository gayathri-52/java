import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int len=0;
        int rev=0;
        while(num>0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
            len++;
        }
        int number=rev;
        int odd=0;
        int count=0;
        while(number>0)
        {
            int digi=number%10;
            if(digi%2!=0)
            {
                odd++;
            }
            number=number/10;
        }
        if(odd==0)
        {
            System.out.print("-1");
        }
        while(rev>0)
        {
            int dig=rev%10;
            
            if(dig%2!=0 && count<odd)
            {
                count++;
                if(count<odd)
                {
                    System.out.print(dig+" ");
                }
                else
                {
                    System.out.print(dig);
                }
            }
           
            rev=rev/10;
        }
        
    }
}
