import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가로(a)를 입력 : ");
        double a = sc.nextDouble();

        System.out.print("세로(b)를 입력 : ");
        double b = sc.nextDouble();

        System.out.print("높이(c)를 입력 : ");
        double c = sc.nextDouble();

        double volume = a * b * c;

        System.out.println();
        System.out.println("직육면체의 부피 = " + volume);

        sc.close();
    }
}