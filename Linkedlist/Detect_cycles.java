package Linkedlist;

public class Detect_cycles {

        public static void main(String[] args) {
            Linkedlist ll=new Linkedlist();
            ll.add_node_end(12);
            ll.add_node_end(9);
            ll.add_node_end(1);
            ll.add_node_end(22);
            ll.add_node_end(99);
            ll.add_node_end(120);
            ll.head.next.next.next.next = ll.head.next;
            boolean bool=ll.hasCycle();
            System.out.println(bool);

        }

        public static class Linkedlist{
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

            public boolean hasCycle() {
                if (head == null) {
                    return false;
                }

                Node slow = head;
                Node fast = head;

                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;

                    if (slow == fast) {
                        return true;
                    }
                }

                return false;                  
            }

        }

        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }

        }


}