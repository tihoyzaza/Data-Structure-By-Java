package Queue;
import java.util.Arrays;

public class qArray {
    private int size;
    private int front;
    private int rear;
    private int[] queueArray;

    public qArray(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        queueArray = new int[size];
    }

    public void enQueue(int data) {
        System.out.println("Enqueue data...");
        if (rear == size - 1) {
            System.out.println("Queue is full!");
        } else {
            queueArray[++rear] = data;
            if (front == -1) {
                front = 0;
            }
        }
    }

    public int deQueue() {
        System.out.println("Dequeue data...");
        int data = -1;
        if (isEmpty()) {
            System.out.println("The queue is empty!");
        } else {
            data = queueArray[front++];
            if (front > rear) {
                front = rear = -1;
            }
        }
        return data;
    }

    public void showData() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
        } else {
            System.out.println(Arrays.toString(Arrays.copyOfRange(queueArray, front, rear + 1)));
        }
        System.out.println("-".repeat(50));
    }

    public boolean isEmpty() {
        return front == -1;
    }
}
