/**
 * 
 */
package linkedStack;

import stack.Stack;

/**
 * @author Emmanuel Ozioma
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************************************");
		System.out.println("\tTesting Linked Stack");
		System.out.println("********************************************");
		
		Stack<String> linkedStack = new LinkedStack<String>();
		if(linkedStack.isEmpty()) {
			System.out.println("The stack is empty");
		}else {
			System.out.println("The stack is NOT empty");
		}
		
		linkedStack.push("a");
		System.out.println(linkedStack.peek());
		System.out.println(linkedStack);
		linkedStack.push("b");
		System.out.println(linkedStack);
		linkedStack.push("c");
		System.out.println(linkedStack);
		System.out.println("removing " + linkedStack.pop());
		System.out.println(linkedStack);
		System.out.println(linkedStack.peek());
		linkedStack.pop();
		System.out.println(linkedStack);
//		linkedStack.pop();
//		System.out.println(linkedStack);
//		linkedStack.pop();
	}

}
