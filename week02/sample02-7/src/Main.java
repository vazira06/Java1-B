import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("상품명 입력 :");
        String productName = keyboard.nextLine();

        System.out.println("가격 입력 : ");
        int price = keyboard.nextInt();
        keyboard.nextLine();   // <-- shu qator Enter belgisini tozalaydi

        System.out.println("제조사 입력 :");
        String manufacturer = keyboard.nextLine();

        System.out.print("상품명 : " + productName + '\n');
        System.out.println("가격 : " + String.format("%,d원", price));
        System.out.printf("제조사 : %s\n", manufacturer);
    }
}