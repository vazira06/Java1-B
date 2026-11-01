import java.util.Locale; // Adicione esta linha no topo
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Defina o Locale.US para aceitar o ponto (.) como separador decimal
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("시간 입력 : ");
        double time = sc.nextDouble();

        int days = (int) (time / 24);
        double rest = time - days * 24;

        int hours = (int) rest;
        double minDouble = (rest - hours) * 60;
        int minutes = (int) minDouble;
        int seconds = (int) ((minDouble - minutes) * 60);

        System.out.println(time + "시간은 " + days + "일 " + hours +
                "시간 " + minutes + "분 " + seconds + " 초 입니다");

        sc.close();
    }
}