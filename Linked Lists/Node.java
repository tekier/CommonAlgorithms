public class Node
{
    private String payload;
    private Node next;
    
    public Node(String payload, Node next)
    {
        this.payload = payload;
        this.next = next;
    }

    public Node GetNext() 
    {
        return this.next;
    }

    public void SetNext(Node next)
    {
        this.next = next;
    }

    public void SetPayload(String payload)
    {
        this.payload = payload;
    }

    public String GetPayload()
    {
        return this.payload;
    }
}