
public class Review01 {
   static double tax_value = 0.1;

	public static void main(String[] args) {
		int price = 1500;
		double tax = price * tax_value;
		double cost = price+tax(1500);
		System.out.println(price + "円の商品の税込価格は" + Math.round(cost) + "円（消費税は" + Math.round(tax) + "円）です。");

	}
   public static double tax(int num1) {
	   double result = tax_value * num1;
	   return result;
   }

}
