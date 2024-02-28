package Problem;

import java.util.ArrayList;
import java.util.List;;

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        System.out.println("fame");
    }
}

class MyStack {
    List<Integer> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        int temp = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return temp;
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
