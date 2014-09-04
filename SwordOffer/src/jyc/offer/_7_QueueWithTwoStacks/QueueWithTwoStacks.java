package jyc.offer._7_QueueWithTwoStacks;

import java.util.Stack;

/**
 * 思路：入栈：通过栈s1。出栈：如果s2不为空，出栈；否则从s1出栈，进入s2，再从s2出栈。
 * 伪代码：笔记。
 * @author Administrator
 *
 */
public class QueueWithTwoStacks {
	private static Stack s1 = new Stack<>();
	private static Stack s2 = new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pop();
		push(1);
		push(23);
		pop();
	}

	private static void push(int value) {
		s1.push(value);
	}
	
	private static void pop(){
		if(!s2.empty()){
			System.out.println(s2.pop());
		}
		else {
			if(s1.empty()){
				System.out.println("No element.");
			}
			else {
				while (!s1.empty()) {s2.push(s1.pop());}
				System.out.println(s2.pop());
			}
		}
	}



}
