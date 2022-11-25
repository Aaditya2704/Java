public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 1, 7 };
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is " + maxPro);
    }

    public static int maxProfit(int[] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }
}
