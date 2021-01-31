/**
 * 
 */
package stack;

/**
 * @author Emmanuel Ozioma
 *
 */
public interface Stack<E> {
	public boolean isEmpty();
	public Object peek();
	public Object pop();
	public int size();
	void push(E theObject);
}
