import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int length) {
        this.items = new int[length];
    }

    public void insert(int item) {
        int i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    public int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (isFull())
                throw new IllegalStateException();
            if (items[i] > item)
                items[i + 1] = items[i];
            else break;
        }
        return i + 1;

    }
    public boolean isFull(){
        return items.length == count;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();
        int item = items[--count];
        items[count] = 0;
        return item;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
