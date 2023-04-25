import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

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