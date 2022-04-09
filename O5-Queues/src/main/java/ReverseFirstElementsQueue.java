import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseFirstElementsQueue {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>();
        queue.push(1); // will behave as a stack
        queue.push(2);
        System.out.println("the popped element is: " + queue.pop());
        // if we use add command
        queue.add(1); // with add command will behave as a Queue
        queue.add(2);
        System.out.println(queue.peek());

        Deque<Integer> queue2 = new ArrayDeque<>();





    }
    public void ReverseFirstK(){}

}
