import java.util.ArrayDeque;
import java.util.Deque;


class QueueUsingDeque<T>{
    private Deque<T> deque = new ArrayDeque<>();

    //Queue implementation in deque
    public void offer(T element){
        deque.addLast(element); //add to the last
    }

    public T poll(){
        if(deque.isEmpty()){
            System.out.println("Queue is empty.");
            return null;
        }
        return deque.removeFirst();
    }
    public T peek(){
        if(deque.isEmpty()){
            System.out.println("Queue is empty.");
            return null;
        }
        return deque.peek();
    }
    public boolean isEmpty(){
        return deque.isEmpty();
    }
}
public class Deque2 {
    public static void main(String[] args) {
        QueueUsingDeque<Integer> queue = new QueueUsingDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue peek " + queue.peek());
        System.out.println("Queue poll " + queue.poll());
        System.out.println("Queue poll " + queue.poll());
    }
}
