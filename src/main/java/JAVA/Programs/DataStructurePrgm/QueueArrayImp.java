package JAVA.Programs.DataStructurePrgm;

public class QueueArrayImp {

	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;

	public QueueArrayImp(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		this.front = 0;
		this.rear = -1;
		queueArr = new int[this.capacity];

	}

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;

		}
		return false;
	}

	public boolean isEmpty() {
		if (currentSize == 0) {
			return true;

		}
		return false;
	}
	/*
	 * this method is used to add the element from rear of the queue
	 */

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Hey, Queue is already full");
		} else {
			rear++;
			if (rear == capacity - 1) {

				rear = 0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + " Added to queue");

		}
	}

	/*
	 * this method is used to remove the element from front of the queue
	 */
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Hey, Queue is empty can not delete element");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(queueArr[front - 1] + " removed from the queue");
				front = 0;
			} else {
				System.out.println(queueArr[front - 1] + " removed from the queue");
			}
		}

	}
	public static void main(String[] args) {
		QueueArrayImp obj = new QueueArrayImp(20);
		obj.dequeue();
		
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		
		obj.dequeue();
		
		
	}

}
