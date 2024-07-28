package Linkedlist;

public class MiddleNode {

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.add_node_end(12);
        ll.add_node_end(9);
        ll.add_node_end(1);
        ll.add_node_end(99);
        ll.add_node_end(120);
        Node node = ll.MiddleNode();
        System.out.println(node.data);
    }
}

     class Linkedlist{
        Node head;
        public void add_node_end(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }
            else{
                Node curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=newNode;
            }
        }

        public Node MiddleNode() {
            if (head == null) {
                return null;
            }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

            }

            return slow;
        }

    }


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

}