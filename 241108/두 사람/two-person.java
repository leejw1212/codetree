import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String aG = sc.next();
        int b = sc.nextInt();
        String bG = sc.next();

        if ((a >= 19 && aG.charAt(0) == 'M') || (b >= 19 && bG.charAt(0) == 'M')) System.out.println(1);
        else System.out.println(0);

    }
}