import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month == 2)
            System.out.println(28);
        else if (month < 8 && month % 2 == 1)
            System.out.println(31);
        else if (month >= 8 && month % 2 == 0)
            System.out.println(31);
        else 
            System.out.println(30);
    }
}