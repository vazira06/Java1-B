void main() {
    final int radius = 6378;
    final float PI = 3.141592f;
    final int KOREA = 100505;
    double surface = 4 * PI * radius * radius;

    double ratio = KOREA / surface * 100;

    System.out.printf("지구의 표면적은 %,.0f km²\n", surface);
    System.out.printf("대한민국 영토 %,d km²는 지구의 %.4f%% 입니다.\n", KOREA, ratio);
}
