import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
		int minprice=Integer.MAX_VALUE;
		int maxprofit=0;
		for(int i=0;i<prices.size();i++){
			if(prices.get(i)<minprice)
				minprice=prices.get(i);
			if(prices.get(i)-minprice>maxprofit)
				maxprofit=prices.get(i)-minprice;
		}
		return maxprofit;
    }
}
