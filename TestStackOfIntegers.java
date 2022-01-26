package Lab_4;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers aStack = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            aStack.push(i);
        }

        while(!aStack.empty()) {
            System.out.print(aStack.pop() + " ");
        }
    }
}
