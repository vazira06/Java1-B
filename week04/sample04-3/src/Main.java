import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 키는 얼마입니까 ?(Cm) : ");
        double height = sc.nextDouble();

        System.out.print("당신의 몸무게는 얼마입니까 ?(Kg) : ");
        double weight = sc.nextDouble();

        double feet = height / 30.48;
        double pound = weight / 0.45359237;

        System.out.println();
        System.out.println(String.format(Locale.US, "당신의 키는 %.3f 피트(feet) 입니다.", feet));
        System.out.println(String.format(Locale.US, "당신의 몸무게는 %.3f 파운드(pound)입니다.", pound));

        sc.close();
    }
}