public class Program
{
    public static void main(String[] args)
    {
        int[] priceList = {4, 5, 3, 7, 8, 1, 5, 6};
        BestPrice pricer = new BestPrice();
        TawqirsTuple<Integer, Integer> tuple = pricer.GetBuyAndSellDate(priceList);
        System.out.println(tuple.GetFirst());
        System.out.println(tuple.GetSecond());
    }
}