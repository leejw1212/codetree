import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b == 0){
            System.out.print(1);
            return;
        }

        int j = a;
        for (int i =1; i<b; i++){
            a *= j;
        }
        System.out.print(a);
    }
}