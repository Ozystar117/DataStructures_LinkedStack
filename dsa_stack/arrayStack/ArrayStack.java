/**
 * 
 */
package arrayStack;

import java.util.EmptyStackException;

import stack.Stack;

/**
 * @author Emmanuel Ozioma
 *
 */
public class ArrayStack<E> implements Stack<E>{
	// the top index of the stack array
	private int top;
	// the stack array that stores objects
	private E[] stack;
	
	/**
	 * Constructor
	 * @param initialCapacity
	 */
	public ArrayStack(int initialCapacity) {
		//check if the initial capacity is valid
		if(initialCapacity < 1) {
			throw new IllegalArgumentException("initialCapacity must be >= 1");
		}
			stack = (E[]) new Object[initialCapacity];
			top = -1;
	}
	
	/**
	 * No parameter constructor
	 * Sets the initial capacity to 10 by default
	 */
	public ArrayStack() {
		this(10);
	}

	/**
	 * Return true if the stack is empty else return false
	 */
	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * Return the object at the top index
	 */
	@Override
	public E peek() {
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return stack[top];
	}

	@Override
	public E pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		E theObject = stack[top]; // store the object to be removed
		stack[top] = null; // remove the object at the top of the stack
		top--; // decrease the size of the stack
		return theObject;
	}

	@Override
	public int size() {
		return size();
	}

	/**
	 * Push an object to the top of the stack
	 */
	@Override
	public void push(E theObject) {
		top++; //increase the top index
		stack[top] = theObject;
	}
	
	public String toString() {
		String output = "[]";
		return output;
	}
}
