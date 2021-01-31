/**
 * 
 */
package arrayStack;

/**
 * @author Emmanuel Ozioma
 *
 */
public class ArrayStack {
	// the top index of the stack array
	private int top;
	// the stack array that stores objects
	private Object[] stack;
	
	/**
	 * Constructor
	 * @param initialCapacity
	 */
	public ArrayStack(int initialCapacity) {
		//check if the initial capacity is valid
		if(initialCapacity < 1) {
			throw new IllegalArgumentException("initialCapacity must be >= 1");
		}
			stack = new Object[initialCapacity];
			top = -1;
	}
}
