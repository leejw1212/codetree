import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b)
        {
            if (c > a)
                System.out.println(a);
            else if (c > b)
                System.out.println(c);
            else 
                System.out.println(b);
        }
        else if (b > a)
        {
            if (c > b)
                System.out.println(b);
            else if (c > a)
                System.out.println(c);
            else 
                System.out.println(a);
        }

    }
}