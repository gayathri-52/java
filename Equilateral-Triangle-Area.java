import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double Area=(Math.sqrt(3)/4)*a*a;
        System.out.printf("%.2f",Area);
    }
}