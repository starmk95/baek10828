import java.util.ArrayList;
import java.util.Scanner;

class MyStack {
    ArrayList<Integer> stackArray;
    int size;

    public MyStack() {
        stackArray = new ArrayList<Integer>();
        size = 0;
    }

    public void push(int num) {
        stackArray.add(num);
        size++;
    }

    public int pop() {
        if (size > 0) {
            int top = stackArray.get(size - 1);
            stackArray.remove(size - 1);
            size--;
            return top;
        } else {
            return -1;
        }
    }

    public int size() {
        return size;
    }

    public int empty(){
        if (size < 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int top(){
        if (size > 0) {
            return stackArray.get(size - 1);
        } else {
            return -1;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        int cnt;
        MyStack stack = new MyStack();
        Scanner sc = new Scanner(System.in);
        cnt = sc.nextInt();
        for(int i=0;i<cnt;i++) {
            String temp = sc.next();
            switch (temp) {
                case "push":
                    int newTop = sc.nextInt();
                    stack.push(newTop);
                    break;
                case "pop" :
                    System.out.println(stack.pop());
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    System.out.println(stack.empty());
                    break;
                case "top" :
                    System.out.println(stack.top());
                    break;

            }
        }
    }
}
