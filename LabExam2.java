package exam;
import java.util.Arrays;
//lab exam 2
public class LabExam2 {
	int top = 0;
	int stack[] = new int[5];
	
	public void stackfull() {
		if(top >5) {
			System.out.println("the stack is full");
		}
		
	}
	
	
	public void push(int value) {
		stack[top] = value;
		top++;
		
	}
	public int pop() {
		int value=stack[top-1];
		top--;
		//stack[top] = 0;
		return value;
		
	}
	public void show() {
		for(int n:stack) {
			System.out.print(n + " ");
		}
	}
	public int peek() {
		int value = stack[top-1];
		return value;
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
			return top<=0;
		}
	
	

	public static void main(String[] args) {
		Stack numStack = new Stack();
		numStack.push(11);
		numStack.push(22);
		numStack.push(33);
		numStack.push(44);
		numStack.push(55);
		//numStack.push(66);
		System.out.println(numStack.pop());
		//numStack.push(55);
		System.out.println(numStack.size());
		System.out.println(numStack.peek());
		System.out.println(numStack.isEmpty());
		numStack.stackfull();
		numStack.show();
		}
	    		
	
		
		
		
		
		
		
		

}
