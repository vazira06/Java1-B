import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름은 ? ");
        String name = sc.nextLine();

        System.out.print(name + "님의 나이는 ? ");
        int age = sc.nextInt();

        System.out.print(name + "님의 키는 ? ");
        double height = sc.nextDouble();

        System.out.print(name + "님의 몸무게는 ? ");
        double weight = sc.nextDouble();

        System.out.println();
        System.out.println(name + "님의 나이는 " + age + "살 입니다.");
        System.out.println(name + "님의 키는 " + height + " Cm 입니다.");
        System.out.println(name + "님의 몸무게는 " + weight + " Kg 입니다.");

        sc.close();
    }
}