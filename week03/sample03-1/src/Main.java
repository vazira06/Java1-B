public class Main {
    public static void main(String[] args) {
        // Qizil rangdagi ma'lumotlar - o'zgarmas (final)
        final String NAME = "vazira";
        final int AGE = 21;
        final double WEIGHT = 55.7;
        final String GENDER = "여자";
        final char BLOOD_TYPE = 'A';

        System.out.printf("NAME : %s%n", NAME);
        System.out.printf("나이 : %d%n", AGE);
        System.out.printf("몸무게 : %.1f Kg%n", WEIGHT);
        System.out.printf("성별 : %s%n", GENDER);
        System.out.printf("혈액형 : %c%n", BLOOD_TYPE);
    }
}