import java.util.Arrays;
import java.util.Stack;

public class QueueReverser {
    private int[] items;
    private int count;

    public QueueReverser(int length) {
        this.items = new int[length];
    }

    public void insert(int item) {
        if (count == items.length) throw new IllegalStateException();
        items[count++] = item;
    }

    public void reverse(int k) {
        if (k < 0 || k > items.length) throw new IllegalArgumentException();
        Stack<Integer> reversedItems = new Stack<>();
        for (int i = 0; i < k; i++) {
            reversedItems.push(items[i]);
        }
        for (int i = 0; i < k; i++) {
            Integer item = reversedItems.pop();
            items[i] = item;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
