public class Program
{
    public static void main(String args[]) 
    {
        BubbleSort sorter = new BubbleSort();
        int[] array = {0,4,5,2};
        System.out.println("length of array is : "+array.length);
        System.out.println("Original:");
        for(int x : array) 
        {
            System.out.print(x + ", ");
        }
        sorter.Sort(array);
        System.out.println("\nSorted:");
        for(int x : array) 
        {
            System.out.print(x + ", ");
        }
        System.out.println();
    }
}
