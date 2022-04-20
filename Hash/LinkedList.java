package Hash;

class Node{
    String data;
    Node next=null;
    public Node(String data){
        this.data=data;
    }
    public Node(){}
    public void display() {  
        System.out.print(this.data);
   }  
}

public class LinkedList {
    Node head = new Node();
    int k = 0;

    public void add (String val) {
        Node newnode = new Node(val);
        if (head.next != null) {
            newnode.next = head.next;
        }
        if (k != 0) {
            head.next = newnode;
        } else {
            head = newnode;
        }
        k++;
    }

    public int size(){
        int size=0;
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
            size++;
        }
        return size++;
    }

    public boolean remove(int ind){
        int count = 0;
        Node ptr = head;
        while (count != ind) {
            ptr = ptr.next;
            count++;
        }
        if (ptr == null) {
            return false;
        }
        ptr = ptr.next;
        head = ptr;
        k--;
        return true;
    }

    public String get(int ind) {
        int count = 0;
        Node ptr = head;
        while (count != ind) {
            ptr = ptr.next;
            count++;
        }
        return ptr.data;
    }
}

