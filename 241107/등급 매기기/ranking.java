import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        char grade ;

        if (a >= 90) grade = 'A';
        else if (a >= 80) grade = 'B';
        else if (a >= 70) grade ='C';
        else if (a >= 60) grade = 'D';
        else grade = 'F';

        System.out.print(grade);
    }
}