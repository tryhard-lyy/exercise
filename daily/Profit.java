public class Profit {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(profit(prices));
    }
    //7,1,5,3,6,4
    public static int profit(int[] prices){
        int buy = 0;//买入
        int sell;//卖出
        int maxprofit = 0;//最大利润
        for(sell=0;sell<prices.length;sell++){
            if(prices[buy]>prices[sell]){
                buy = sell;//存在大于买入价的价格直接置换
            }
            int temp = prices[sell] - prices[buy];
            maxprofit = maxprofit>temp?maxprofit:temp;
        }

        return maxprofit;
    }
}
