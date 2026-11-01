import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요 (age): ");
        int age = scanner.nextInt();

        int fee = (age < 7) ? 0 :
                (age <= 18) ? 1000 :
                        (age <= 64) ? 1500 : 0;

        if (fee == 0) {
            System.out.println("요금: 무료");
        } else {
            System.out.println("요금: " + fee + "원");
        }

        scanner.close();
    }
}