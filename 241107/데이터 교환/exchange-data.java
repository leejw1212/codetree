public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;
        int temp1, temp2;
        
        temp1 = a;
        temp2 = b;

        a = c;
        b = temp1;
        c = temp2;
        
        System.out.printf("%d\n%d\n%d",a,b,c);
    }
}