package Lab_4;

public class StackOfIntegers {
    //Attributes
    private int[] elements;
    private int size;

    //Operations
    //Default constructor
    public StackOfIntegers() {
        this.size = 0;
        this.elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.size = 0;
        this.elements = new int[capacity];
    }

    public boolean empty() {
        return (this.size > 0 ? false : true);
    }

    public int peek() {
        return (empty() ? 0 : this.elements[this.size]);
    }

    public void push(int value) {
        this.elements[this.size] = value;
        this.size += 1;
    }

    public int pop() {
        //Subtract -1 since this.size is ahead by 1 after each push
        int temp = this.elements[this.size - 1];
        //0 - 1 = -1 (out of range)
        //Therefore, it has to stop at 0
        this.elements[this.size - 1] = 0;
        this.size -= 1;
        return temp;
    }

    //Get
    public int getSize() {
        return this.size;
    }
}
