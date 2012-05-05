package six.queues;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueIntro {
	
	public static void main(String[] priority) {
		int[] nums = {5, 2, 3, 4, 10, 1};
		Queue<Integer> pQueue = new PriorityQueue<Integer>(1);
		
		// offer() does the same thing as add() but will not throw an IllegalStateException
		// add() will throw an IllegalStateException if there is no space available
		for(int oneNum : nums)
			pQueue.offer(oneNum);
		
		System.out.printf("The Priority Queue is: %s\n", pQueue);
		System.out.printf("The head of the queue is: %d\n", pQueue.peek()); // peek() looks at the head but does not remove
		
		System.out.println("Polling: ");
		while(!pQueue.isEmpty())
			System.out.print(pQueue.poll() + " "); // Will select the number with the highest priority (lowest number)
												   // Will find the head and remove it
		Comparator<Integer> reverseOrder = Collections.reverseOrder();
		
		pQueue = new PriorityQueue<Integer>(1, reverseOrder) ;
		for(int oneNum : nums)
			pQueue.offer(oneNum);
		
		System.out.printf("\n\nThe Reverse Priority Queue is: %s\n", pQueue);
		System.out.printf("The head of the queue is: %d\n", pQueue.peek());
		
		System.out.println("Polling: ");
		while(!pQueue.isEmpty())
			System.out.print(pQueue.poll() + " "); // Will select the number with the highest priority (highest number)
	}

}
