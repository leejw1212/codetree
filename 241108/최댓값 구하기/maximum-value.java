import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a+b+c)/3.0;

        if (avg > a){
            if (b>=c)
                System.out.println(b);
            else 
                System.out.println(c);
        }
        else if (avg > b){
            if (a>=c)
                System.out.println(a);
            else 
                System.out.println(c);
        }
        else {
            if (a>=b)
                System.out.println(a);
            else 
                System.out.println(b);
        }
    }
}