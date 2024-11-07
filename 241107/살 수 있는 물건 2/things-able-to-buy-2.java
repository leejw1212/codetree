import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String buy = "";

        if (a >= 3000) buy = "book";
        else if (a >= 1000) buy = "mask";
        else if (a >= 500) buy = "pen";
        else buy = "no";

        System.out.print(buy);
    }
}