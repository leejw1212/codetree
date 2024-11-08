import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int aTemp = sc.nextInt();

        char b = sc.next().charAt(0);
        int bTemp = sc.nextInt();
        
        char c = sc.next().charAt(0);
        int cTemp = sc.nextInt();
        

        int count = 0;

        if (a == 'Y' && aTemp >= 37)
            count ++;
        
        if (b == 'Y' && bTemp >= 37)
            count ++;
        
        if (c == 'Y' && cTemp >= 37)
            count ++;

        if (count >= 2) System.out.println('E');
        else System.out.println('N');
    }
}