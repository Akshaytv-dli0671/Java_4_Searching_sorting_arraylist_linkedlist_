package Linkedlist;

public class Reverse_LL {

    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add_node_end(12);
        ll.add_node_end(9);
        ll.add_node_end(1);
        ll.add_node_end(22);
        ll.add_node_end(99);
        ll.add_node_end(120);
        ll.display();
        ll.reverse();
        ll.display();

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

        public void reverse(){
            Node prev=null;
            Node curr=head;
            Node next=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;

        }

        public void display(){
            Node curr=head;
            System.out.println("\ndisplaying...");
            while(curr!=null){
                System.out.print(curr.data+"->");
                curr=curr.next;
            }
            System.out.println("null");
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
