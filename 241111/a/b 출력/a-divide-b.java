import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double var = a/b;
        for (int i = 0; i<20; i++)
            var *= 10;

        int temps = (int)var;

        double res = (double)var;
        for (int i=0; i<20; i++)
            res /= 10;

        System.out.printf("%.20f",res);
    }
}