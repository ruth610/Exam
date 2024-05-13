package exam;

public class LabExam3 {
	static int front;
	static int rear;
	static int size;
	static int[] list= new int[5];
	
	
	public static void enQueue(int value) {
			if(!isFull()) {
			   list[rear] = value;
			   rear = (rear +1)%5;
			   size++;
			}
	}
	public static void show() {
		for(int q=0;q<size;q++) {
			System.out.println(list[(q+front)%5]);
			
			
		}
	}
	public static void deQueue() {
		if(!isEmpty()) {
		   int value =list[front];
		   front = (front +1)%5;
		   size--;
		   
		
		}
		
	}
	
	public static int getSize() {
		return size;
	}
	public static Boolean isEmpty() {
		return getSize()==0;
	}
	public static Boolean isFull() {
		return getSize()==5;
	}
	
	

	public static void main(String[] args) {
		Queue.enQueue(4);
		Queue.enQueue(6);
		Queue.enQueue(3);
		Queue.enQueue(7);
		Queue.enQueue(1);
		Queue.deQueue();
		Queue.deQueue();
		Queue.enQueue(9);
		Queue.enQueue(2);
		Queue.enQueue(23);
		System.out.println(Queue.isFull());
		System.out.println(Queue.isEmpty());
		
		Queue.show();
		

	}

}
