/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        Node front = head;
        
        while(curr != null)
        {
            front = curr.next;
            Node copy = new Node(curr.val);
            curr.next = copy;
            copy.next = front;
            
            curr = front;
        }
        
        curr = head;
        while(curr != null)
        {
            if(curr.random != null)
            {
                curr.next.random = curr.random.next;
            }
            curr= curr.next.next;
        }
        
        curr = head;
        Node pseudoHead = new Node(0);
        Node copy = pseudoHead;
        
        while(curr != null)
        {
            front = curr.next.next;
            
            copy.next = curr.next;
            copy = copy.next;
            
            curr.next = front;
            curr = front;
        }
        return pseudoHead.next;
        
    }
}