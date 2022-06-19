package CollectionsFramework;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {
	public static void main(String[] args) {
//		if(args.length != 1) {
//			System.out.println("Usage: java ExpValidCheck \"EXPRESSION\"");
//			System.out.println("Example: java ExpValidCheck \"((2+3) * ! + 3\"");
//			System.exit(0);
//		}
		
		Stack st = new Stack();
		String expression = "((3+5)*8-2)"; // args[0];
		
		System.out.println("expression: " + expression);
		
		try {
			for(int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch + "");
				} else if(ch == ')') {
					st.pop();
				}
			}
				
			if(st.isEmpty()) {
				System.out.println("°ýÈ£ ÀÏÄ¡");
			} else {
				System.out.println("°ýÈ£ ºÒÀÏÄ¡");
			}
		} catch(EmptyStackException e) {
			System.out.println("°ýÈ£ ºÒÀÏÄ¡");
		}
	}
}
