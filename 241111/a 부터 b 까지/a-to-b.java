import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a<=b)
        {
            System.out.printf("%d ",a);

            if(a % 2 != 0)
                a *= 2;
            else 
                a += 3;

        }
    }
}