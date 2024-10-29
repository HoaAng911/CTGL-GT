
public class MyArrayQueues implements isStackandQueues {
    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    MyArrayQueues(int size) {
        SIZE = size;
        array = new int[SIZE];
        headIndex = tailIndex = -1;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex == -1) && (tailIndex == -1);
    }

    @Override
    public boolean push(int val) {
        if (!isEmpty()) {
            if (!isFull()) {
                headIndex++;
            }
            tailIndex++;
            array[tailIndex] = val;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int val = -1;
        if (!isFull()) {
            val = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex) {
                headIndex = tailIndex = -1;
            }
        }
        return val;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= tailIndex; i++) {
                System.out.print(array[i] + " ");

            }
            System.out.println();
        }
    }
}
