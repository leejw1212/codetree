import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cal = weight(a,b);

        System.out.println(cal);
        if (cal >= 25)
            System.out.println("Obesity");

    }

    public static int weight(int h, int w){
        return (10000*w)/(h*h) ;
    }
}