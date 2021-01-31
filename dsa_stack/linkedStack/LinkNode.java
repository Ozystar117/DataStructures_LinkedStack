/**
 * 
 */
package linkedStack;

/**
 * @author Emmanuel Ozioma
 *
 */
public class LinkNode<E> {
	// field that stores the object in the node
	public E theObject;
	// a reference to the next node in the stack
	public LinkNode next;
	
	/**
	 * @param theObject
	 * @param next
	 */
	public LinkNode(E theObject, LinkNode next) {
		this.theObject = theObject;
		this.next = next;
	}
	
}
