import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int cntClass = 0;
        int cntBokdo = 0;
        int cntToilet = 0;

        for (int i = 1; i<=a; i++){
            if(i % 12 == 0)
                cntToilet ++;
            else if (i % 3 == 0)
                cntBokdo ++;
            else if (i % 2 == 0)
                cntClass ++;
            else   
                continue;
        }

        System.out.printf("%d %d %d",cntClass, cntBokdo, cntToilet);
    }
}