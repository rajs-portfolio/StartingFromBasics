import java.util.Scanner;

class Stack {
    private int[] stack;
    private int top;
    private int size;

    // Constructor
    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Push element into stack
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " pushed into stack.");
    }

    // Remove element from stack
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }

        System.out.println(stack[top] + " popped from stack.");
        top--;
    }

    // Display top element
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Top element: " + stack[top]);
    }

    // Display all elements
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

public class stack_io {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();

        Stack stack = new Stack(size);

        int choice;

        do {
            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        scanner.close();
    }
}