import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b>a) {
            for (int i=b; i>=a; i--)
            System.out.printf("%d ",i);
        }
        else {
            for (int i=a; i>=b; i--)
            System.out.printf("%d ",i);
        }
    }
}