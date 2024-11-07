import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        String res = "";

        if (a == 'S') res = "Superior";
        else if (a == 'A') res = "Excellent";
        else if (a == 'B') res = "Good";
        else if (a == 'C') res = "Usually";
        else if (a == 'D') res = "Effort";
        else res = "Failure";

        System.out.print(res);
    }
}