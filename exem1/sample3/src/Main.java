public class Main {
    public static void main(String[] args) {
        int cost = 1015000;
        double profitRate = 0.3;
        double taxRate = 0.1;

        double price = cost * (1 + profitRate);
        System.out.println("정가 : " + price);

        double saleTax = price * taxRate;
        System.out.println("매출 세액 : " + saleTax);

        double buyTax = cost * taxRate;
        System.out.println("매입 세액 : " + buyTax);

        double payTax = saleTax - buyTax;
        System.out.println("납부세액 : " + payTax);
    }
}