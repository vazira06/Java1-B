import java.util.Scanner;
void main() {
        String result;
        int score;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("점수 입력 : ");
        score = keyboard.nextInt();



    if (score >= 0 && score <= 100) {
        if (score >= 90) {
            result = "A학점 취득 성공";
        } else {
            result = "A학점 취득 실패";
        }
        result += "\n감사합니다";
    } else
        result = "ERROR : 점수는 0 ~ 100 사이";

    System.out.println(result);
}