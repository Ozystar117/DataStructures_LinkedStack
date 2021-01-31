/**
 * 
 */
package stack;

/**
 * @author Emmanuel Ozioma
 *
 */
public interface Stack<E> {
//	returns true if the stack is empty else returns false
	public boolean isEmpty();
	
//	returns the object at the top of the stack
	public Object peek();
	
//	removes the object at the top of the stack
	public Object pop();
	
//	returns the size of the stack
	public int size();
	
//	pushes an object to the top of the stack
	public void push(E theObject);
}
