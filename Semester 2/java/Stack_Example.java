import java.util.Stack;

public class Stack_Example{
	
	public static void main(String[] args){
	
		boolean res;
	
		Stack<Integer> stk =new Stack<>();
		
		res=stk.empty();
		
		System.out.println("Is stack is empty= "+res);
		
		stk.push(45);
		
		stk.push(56);
		
		System.out.println("Elements of stack: "+stk);
		
		res=stk.empty();
		
		System.out.println("Is stack is empty= "+res);
		
		//Integer x=(Integer)stk.pop();
		
		System.out.println("The value poped from the stack is: "+stk.pop()
		);
		
		stk.push(90);
		
		System.out.println("Elements of stack: "+stk);
		
		System.out.println("The value poped from the stack is: "+stk.pop());
		
		res=stk.empty();
		
		System.out.println("Is stack is empty= "+res);
	
	}
	
}
		
