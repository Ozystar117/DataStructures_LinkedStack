/**
 * 
 */
package stack;

/**
 * @author Emmanuel Ozioma
 *
 */
public interface Stack<Object> {
	public boolean isEmpty();
	public Object peek();
	public Object pop();
	public int size();
	void push(Object theObject);
}
