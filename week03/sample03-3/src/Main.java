public class Main {
    public static void main(String[] args) {
        final String COUNTRY = "대한민국";
        final String CAPITAL = "서울";
        final int AREA = 99538;
        final int POPULATION = 10373234;
        final int YEAR = 2010;

        System.out.printf("우리나라는 %s 입니다.%n", COUNTRY);
        System.out.printf("%s 수도 : %s%n", COUNTRY, CAPITAL);
        System.out.printf("%s 면적 : %,d ㎢ (남한)%n", COUNTRY, AREA);
        System.out.printf("%s의 인구 : %,d 명 (%d년 기준)%n", CAPITAL, POPULATION, YEAR);
    }
}