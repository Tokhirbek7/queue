import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        QueueReverser reverser = new QueueReverser(5);
        reverser.insert(10);
        reverser.insert(20);
        reverser.insert(30);
        reverser.insert(40);
        reverser.insert(50);
        reverser.reverse(5);
        System.out.println(reverser);

    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            Integer removedItem = queue.remove();
            stack.add(removedItem);
        }

        while (!stack.isEmpty()) {
            Integer popedItem = stack.pop();
            queue.add(popedItem);

        }
    }
}