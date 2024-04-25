import java.util.Stack;  
import java.util.Queue;
import java.util.LinkedList;

public class StackQueue {
    Stack<Character> myStack = new Stack<>();
    Queue<Character> myQueue = new LinkedList<Character>();
    public StackQueue () {
    }

    public void pushCharacter (char c) {
        myStack.push(c);
    }
   
    public void enqueueCharacter (char c) {
        myQueue.add(c);
    }
   
    public char popCharacter() {
        return myStack.pop();
    }
   
    public char dequeueCharacter() {
        return myQueue.remove();
    }
}
