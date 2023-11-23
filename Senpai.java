public class Senpai {
    public static void main(String[] args) {
        // arrays();
        // stackArray();
        // linkedList();
        linkedStack();
    }

    static void arrays() {
        char[] letters = { 'a', 'b', 'c', 'd', 'e' };

        System.out.println(letters[4]);
        System.out.println(letters[0]);

        letters[4] = 'f';
        System.out.println(letters[4]);
    }

    static void stackArray() {
        char[] stack = new char[5];
        int pointer = -1;

        // push
        pointer = pointer + 1;
        stack[pointer] = 'c';

        System.out.println(stack[pointer]);

        pointer = pointer + 1;
        stack[pointer] = 'f';

        // peek
        System.out.println(stack[pointer]);

        // pop
        System.out.println(stack[pointer]);
        pointer = pointer - 1;

        pointer = pointer + 1;
        stack[pointer] = 'a';
        System.out.println(stack[pointer]);
    }

    static void linkedList() {
        Node head = new Node();
        head.value = 'a';
        head.next = new Node();
        head.next.value = 'b';
        head.next.next = new Node();
        head.next.next.value = 'c';

        System.out.println(head.value);
        System.out.println(head.next.value);
        System.out.println(head.next.next.value);

        head.next = head.next.next;
        System.out.println(head.next.value);
    }

    static void linkedStack() {
        Stack stack = new Stack();
        stack.push('a');
        stack.push('b');
        stack.peek();
        stack.peek();
        stack.pop();
        stack.pop();
    }
}

class Stack {
    Node top;

    void push(char value) {
        Node newNode = new Node();
        newNode.value = value;

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    void peek() {
        System.out.println(top.value);
    }

    void pop() {
        System.out.println(top.value);
        top = top.next;
    }
}

// recursion
class Node {
    char value;
    Node next;
}
