
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int num1 = 1500;
        int num2 = 10;
        double result = tax(num1, num2);
        int sum = num1 + (int)result;

        System.out.println(num1 + "の商品の税込価格は" + sum + "円（消費税は" + (int)result + "円）です。");

    }
    public static double tax(int num1, int num2) {
         double tax = num1 * num2 / 100;
        return tax;
    }

}
