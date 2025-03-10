import java.util.ArrayList;

public class MyLinkedListStack implements isStackandQueues {
    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    // Co 2 thao tac chinh
    Node topNode;

    MyLinkedListStack() {
        topNode = null;
    }

    @Override

    public boolean push(int value) {
        if (!isFull()) {
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }

        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int value = topNode.value;
        topNode = topNode.next;
        return value;
    }

    @Override

    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;// Linked list neve full
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        Node temp = topNode;
        ArrayList<Integer> tempList = new ArrayList<>(); // khoi tao mot ArrayList

        while (temp != null) {
            // System.out.print(temp.value + " ");
            tempList.add(temp.value); // lay tung phan tu trong linked list them vao ArrayList
            temp = temp.next;
        }
        for (int i = tempList.size() - 1; i >= 0; i--) {
            System.out.print(tempList.get(i) + " ");

        }
        System.out.println();
    }
}
