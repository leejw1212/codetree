import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = a; i<=100; i++)
        {
            if (i >=90)
                System.out.printf("A ");
            else if (i >= 80)
                System.out.printf("B ");
            else if (i >= 70)
                System.out.printf("C ");   
            else if (i >= 60)
                System.out.printf("D ");  
            else
                System.out.printf("F ");
        }
    }
}