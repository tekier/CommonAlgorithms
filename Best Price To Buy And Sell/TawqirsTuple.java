public class TawqirsTuple<X, Y>
{
    private final X first;
    private final Y second;

    public TawqirsTuple(X x, Y y)
    {
        this.first = x;
        this.second = y;
    }

    public X GetFirst()
    {
        return this.first;
    }

    public Y GetSecond()
    {
        return this.second;
    }
}