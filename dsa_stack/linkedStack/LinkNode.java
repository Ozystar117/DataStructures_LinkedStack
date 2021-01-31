/**
 * 
 */
package linkedStack;

/**
 * @author Emmanuel Ozioma
 *
 */
public class LinkNode<Object> {
	// field that stores the object in the node
	public Object theObject;
	// a reference to the next node in the stack
	public LinkNode next;
	
	/**
	 * @param theObject
	 * @param next
	 */
	public LinkNode(Object theObject, LinkNode next) {
		this.theObject = theObject;
		this.next = next;
	}
	
}
