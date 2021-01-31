/**
 * 
 */
package arrayStack;

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
		System.out.println("*********************************************");
		System.out.println("\tTesting Array Stack");
		System.out.println("*********************************************");
		
		
		Stack<String> arrayStack = new ArrayStack<String>();
		arrayStack.push("a");
		arrayStack.push("b");
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack);
		for(int i = 1 ; i < 10; i++) {
			arrayStack.push("test " + i);
		}
		System.out.println(arrayStack);
	}

}
