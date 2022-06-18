package ThirtyDaysOfCode;


import org.w3c.dom.Node;

public class DayFifteen {
    // missing a few java utils like Scanner input
    public static Node insert(Node head, int data) {
        //Complete this method
        if (head == null)
            return new Node(data);
        else if (head.next == null) {
            head.next = new Node(data);
        } else {
            insert(head.next, data);
        }
        return head;
    }
}
