package LIFO;

import java.util.Stack;

public class Stacks{
    public static void main(String[] args) {
        System.out.println("Stack Operations");

        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        System.out.println("Pushing elements onto the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        displayStack(stack);

        // Pop an element from the stack
        System.out.println("Popping an element from the stack:");
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        displayStack(stack);

        // Peek at the top element without removing it
        System.out.println("Peeking at the top element:");
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        System.out.println("Checking if the stack is empty:");
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Get the size of the stack
        System.out.println("Getting the size of the stack:");
        int stackSize = stack.size();
        System.out.println("Stack size: " + stackSize);
    }

    // Helper function to display the elements in the stack
    public static void displayStack(Stack<Integer> stack) {
        System.out.println("Stack contents: " + stack);
    }
}

