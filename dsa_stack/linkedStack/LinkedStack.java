/**
 * 
 */
package linkedStack;

import java.util.EmptyStackException;

import stack.Stack;

/**
 * @author Emmanuel Ozioma
 *
 */
public class LinkedStack<E> implements Stack<E>{
//	reference the node at the top of the stack
	private LinkNode<E> top;
//	the size of the stack
	private int size;
	/**
	 * Constructor
	 * @param top
	 * @param size
	 */
	public LinkedStack() {
//		initialize fields
		this.top = null;
		this.size = 0;
	}
	
	/**
	 * Return true if the stack is empty else return false
	 */
	@Override
	public boolean isEmpty() {
		return top == null;
	}
	
//	return the object stored in the node at the top of the stack
	@Override
	public E peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.theObject;
	}
	
	/**
	 * Push an object to the stack
	 */
	@Override
	public void push(E theObject) {
		top = new LinkNode<E>(theObject, top); // the R.H.S is evaluated before being assigned to the L.H.S
		size++;
	}
	
	/**
	 * Remove the object at the top of the stack
	 */
	@Override
	public E pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		E theObject = top.theObject; // store the object to be removed
		top = top.next;
		size--; //decrease the size;
		return theObject;
	}
	
	/**
	 * Return the size of the stack
	 */
	@Override
	public int size() {
		return size;
	}
	
	/**
	 * Return all the objects in the stack in an  enclosed square bracket i.e []
	 */
	public String toString() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		String output = "[";
		LinkNode currentLinkNode = top;
		while(currentLinkNode != null) {
			output += currentLinkNode.theObject + ", ";
			currentLinkNode = currentLinkNode.next;
		}
		if(!isEmpty()) {
			output = output.substring(0, output.length() - 2);
		}
		output += "]";
		return output;
	}
}
