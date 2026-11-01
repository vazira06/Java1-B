import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    final int HEART = 65;

    System.out.print("당신은 몇 년 동안 살았나요? ");
    int age = keyboard.nextInt();

    long count = (long) age * 365 * 24 * 60 * HEART;

    System.out.printf("사람은 평균 분당 %d회 심장이 박동한다.\n", HEART);
    System.out.printf("심장은 %d년 동안 %d회 박동한다.\n", age, count);
}