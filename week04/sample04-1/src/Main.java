import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수를 입력 (분자) : ");
        int a = sc.nextInt();

        System.out.print("두 번째 수를 입력 (분모) : ");
        int b = sc.nextInt();

        System.out.println();
        System.out.println(a + "를 " + b + "로 나누면 몫 = " + (a / b) + ", 나머지 = " + (a % b) + " 이다.");
        System.out.printf("%d를 %d로 나누면 = %.1f 이다.\n", a, b, (double) a / b);

        sc.close();
    }
}