
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        add(1500, 10);

    }
    public static void add(int a, int b) {
        int tax = a / b;
        int num = a + tax;
        System.out.println(a + "円の商品の税込価格は" + num + "円（消費税は" + tax +"円）です。");
    }

}
