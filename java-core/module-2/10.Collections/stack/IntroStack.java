/*
Stack :
    It is a subclass of vector
    It is an implementation of the List interface
    It is present inside java.util package
    It is present since jdk 1.0v
    hench it is also known as legacy class
    It follows Fist In Last Out / Last In First Out insertion order
    It is used to perform stack operation.

To perform stack operation we have multiple methods in Stack class.

push(Object obj) :
    It is used to push object inside the stack.
    The return type is Object

peek() :
    It is used to return top object of the stack.
    return type is Object.
    When stack empty and if we try to use peek method then it will throw EmptyStackException

pop() :
    It is used to return and remove the top element of the stack.
    return type is Object.
    When stack is empty and if try to use pop method then it will throw EmptyStackException

empty() :
    It is used to check whether the stack is empty or not.
    returntype is boolean.

*/

import java.util.Stack;

public class IntroStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		System.out.println(st.empty());
//		System.out.println(st.peek()); EmptyStackException
//		System.out.println(st.pop()); EmptyStackException
		
		System.out.println(st.push(10));
		st.push(14);
		st.push(16);
		st.push(12);
		st.push(13);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.empty());
	}
}