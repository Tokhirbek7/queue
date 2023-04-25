import java.util.Arrays;

public class ArrayQueue {
    private  int [] items;
    private int rear;
    private int front;
    private int count;
    public ArrayQueue(int length) {
        this.items = new int[length];
    }

    public void enqueue(int item){
        if (items.length == count)
            throw new IllegalArgumentException();
        items[rear] = item;
        rear = (rear+1) % items.length;
        count++;
    }
    public int dequeue(){
        int item = items[front];
        items[front] = 0;
        front = (front+1) % items.length;
        count--;
        return item;
    }
    @Override
     public String toString() {
        return Arrays.toString(items);
    }
}
