import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("우리의 별은 ? ");
        String myStar = sc.next();

        System.out.print("지구에서의 거리를 알고자 하는 별은 ? ");
        String targetStar = sc.next();

        System.out.print("지구에서 " + targetStar + "까지의 거리는 ? ");
        int distance = sc.nextInt();

        System.out.print(targetStar + "의 평균 온도는 ? ");
        double temperature = sc.nextDouble();

        System.out.print(targetStar + "의 적도 지름 : ");
        int diameter = sc.nextInt();

        System.out.println();
        System.out.printf("지구에서 %s까지의 거리는 %d Km 입니다.%n", targetStar, distance);
        System.out.printf("%s의 적도 지름은 %d Km 입니다.%n", targetStar, diameter);
        System.out.printf("%s의 평균 온도는 %.1f C 입니다.%n", targetStar, temperature);

        sc.close();
    }
}