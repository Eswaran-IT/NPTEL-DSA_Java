package FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        System.out.println("Queue Operations");

        // Create a queue of integers using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        System.out.println("Adding elements to the queue:");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        displayQueue(queue);

        // Check if the queue contains a specific element
        System.out.println("Checking if the queue contains 20:");
        boolean containsElement = queue.contains(20);
        System.out.println("Queue contains 20? " + containsElement);

        // Remove an element from the queue
        System.out.println("Removing an element from the queue:");
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        displayQueue(queue);

        // Peek at the front element without removing it
        System.out.println("Peeking at the front element:");
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Check if the queue is empty
        System.out.println("Checking if the queue is empty:");
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Get the size of the queue
        System.out.println("Getting the size of the queue:");
        int queueSize = queue.size();
        System.out.println("Queue size: " + queueSize);
    }

    // Helper function to display the elements in the queue
    public static void displayQueue(Queue<Integer> queue) {
        System.out.println("Queue contents: " + queue);
    }
}

