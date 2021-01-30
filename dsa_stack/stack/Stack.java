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
	public void push(Object theObject);
	public Object pop();
	public int size();
}
