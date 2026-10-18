import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("달러에 대한 원화 환율을 입력 : ");
        double rate = sc.nextDouble();

        System.out.print("원화 금액을 입력 : ");
        int won = sc.nextInt();

        double dollar = won / rate;

        System.out.println();
        System.out.println("원화(₩) " + String.format(java.util.Locale.US, "%,d", won) + "원은 "
                + String.format(java.util.Locale.US, "%,.2f", dollar) + " 달러($) 입니다.");

        sc.close();
    }
}