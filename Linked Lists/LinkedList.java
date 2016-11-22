public class LinkedList
{
    public static void main(String[] args)
    {
        Node node1 = new Node("first", null);
        Node node2 = new Node("second", node1);
        Node node3 = new Node("third", node2);
        Node node4 = new Node("fourth", node3);
        Iterate(node4);
    }

    public static void Iterate(Node head) 
    {
        while(head != null)
        {
            System.out.println(head.GetPayload());
            Iterate(head.GetNext());
        }
    }
}