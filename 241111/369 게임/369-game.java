import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =1; i<=n; i++){
            if (i % 3 == 0) {
                System.out.printf("%d ",0);
            } else {
                if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
                    System.out.printf("%d ",0);
                else {
                    int a = 0;

                    if(i >= 10)
                        a = i / 10;
                    else   
                        a = i;

                    if(a % 10 == 3 || a % 10 == 6 || a % 10 == 9)
                        System.out.printf("%d ",0);
                    else 
                        System.out.printf("%d ",i);
                }
            }
        }
    }
}