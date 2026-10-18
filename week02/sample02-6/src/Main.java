import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름은 ? ");
        String name = sc.nextLine();

        System.out.print(name + "님의 나이는 ? ");
        int age = sc.nextInt();

        System.out.print(name + "님의 성별 (남 = M, 여 = F) : ");
        char gender = sc.next().charAt(0);

        System.out.println();
        System.out.println(name + "님의 나이는 " + age + "살 입니다.");

        if (gender == 'M' || gender == 'm') {
            System.out.println(name + "님의 성별은 M(남자) 입니다.");
        } else {
            System.out.println(name + "님의 성별은 F(여자) 입니다.");
        }

        sc.close();
    }
}