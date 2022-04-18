package CSC1009_Lab.Lab_4;

public class Stack {
    // Attributes
    private int[] elements;
    private int size;

    // Operations
    // Default Constructor
    public Stack() {
        this.elements = new int[16];
        this.size = -1;
    }

    public Stack(int cap) {
        this.elements = new int[cap];
        this.size = -1;
    }

    // Returns true if the stack is empty
    // i.e. size < 0
    public boolean empty() {
        // condition ? true : false
        return size < 0 ? true : false;
    }

    // Returns the element at the top
    public int peek() {
        return this.elements[size];
    }

    // Adds an integer to the top of the stack
    public void push(int value) {
        // Increase the size by 1
        size += 1;
        this.elements[size] = value;
    }

    // Returns and removes the element at the top
    public int pop() {
        if (!empty()) {
            int temp = this.elements[size];
            size -= 1;
            return temp;
        }
        else {
            System.out.println("The stack is empty");
            return 0;
        }
    }

    // Returns the number of elements in the stack
    public int getSize() {
        int size = this.size + 1;
        return size;
    }
}
