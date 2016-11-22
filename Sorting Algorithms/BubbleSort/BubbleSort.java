public class BubbleSort 
{
    public void Sort(int[] input)
    {
        boolean sorted = false;
        int length = input.length;

        while(!sorted)
        {
            sorted = true;
            for(int i = 0; i < length-1; i++)
            {
                if(input[i] > input[i+1])
                {
                    int temp = input[i+1];
                    input[i+1] = input[i];
                    input[i] = temp;
                    sorted = false;
                }
            }
        }
    }   
}