package LinkedList;

public class Node {
    
    private String data;
    private Node next; // Pointer 
    // addFirst
    public Node(String data){
        this.data = data;
    }
    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }
    public String getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    // addLast should implement in below method
    public void setData(String data) {
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    
}

