
public class Review01 {

        public static void main(String[] args) {
            int 商品価格 = 1500;
            double 消費税率 = 0.10;

            // 消費税額を計算
            int 消費税額 = (int) tax(商品価格, 消費税率);

            // 税込価格を計算
            int 税込価格 = 商品価格 + 消費税額;

            // 結果を表示
            System.out.println("1500円の商品の税込価格は" + 税込価格 + "円（消費税は" + 消費税額 + "円）です。");
        }

        // 消費税額を計算するtax
        public static double tax(int 商品価格, double 消費税率) {
            return 商品価格 * 消費税率;
        }
    }