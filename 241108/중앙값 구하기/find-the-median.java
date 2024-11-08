import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        int min = a;

        if (b > max && c < max) {
            if (a >= c)
                System.out.println(a);
            else
                System.out.println(c);
        }
        else if (c > max && b < max) {
            if (a >= b)
                System.out.println(a);
            else
                System.out.println(b);
        }
        else {
            if (c >= b)
                System.out.println(c);
            else
                System.out.println(b);
        }


    }
}