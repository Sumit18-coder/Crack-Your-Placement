import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

class StackUsingDeque<T>{
    private Deque<T> deque = new ArrayDeque<>();

    //stack implementation using deque
    public void push(T element){
        deque.addFirst(element);//add to front
    }
    public T pop(){
        if(deque.isEmpty()){
            System.out.println("Stack is empty.");
            return null;
        }
        return deque.removeFirst();
    }
    public T peek(){
        if(deque.isEmpty()){
            System.out.println("Stack is empty.");
            return null;
        }
        return deque.peekFirst();
    }
    public boolean isEmpty(){
        return deque.isEmpty();
    }
}

public class Deque1{
    public static void main(String[] args) {
        StackUsingDeque<Integer> stack = new StackUsingDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop " + stack.pop());
        System.out.println("Stack pop: " + stack.pop());
    }
}