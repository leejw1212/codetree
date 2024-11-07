import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String name = "";
        if (a == 1) name = "John";
        else if (a == 2) name = "Tom";
        else if (a == 3) name = "Paul";
        else name = "Vacancy";

        System.out.printf("%s",name);
    }
}