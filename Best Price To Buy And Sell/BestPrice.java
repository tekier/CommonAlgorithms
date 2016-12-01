
public class BestPrice
{
    public TawqirsTuple<Integer, Integer> GetBuyAndSellDate(int[] prices)
    {
        // 0  1  2  3  4  5  6  7
        //[4, 5, 3, 7, 8, 1, 5, 6]
        //correct answer here is 6-1 = 5
        //(1,7)
        int length = prices.length;
        int bestPrice = 0;
        int buyOn = prices[0];
        int sellOn = prices[1];
        int baseIndex = 0;
        int currentIndex = 1;

        for(int i = 0; i < length; i++)
        {
            for(int j = i; j < length; j++)
            {
                int newPrice = Profit(prices[i], prices[j]);
                if(newPrice > bestPrice)
                {
                    buyOn = i;
                    sellOn = j;
                    bestPrice = newPrice;
                }
            }
        }


        return (new TawqirsTuple<Integer, Integer>(prices[buyOn], prices[sellOn]));
    }

    public int Profit(int buyingPrice, int sellingPrice)
    {
        return sellingPrice - buyingPrice;
    }
}

/*
* SELECT COUNT(THING) FROM
* */