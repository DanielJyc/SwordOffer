package jyc.offer._5_PrintListReversingly;

import java.util.Stack;

/**
 * 方法一：递归：采用递归调用的方式依次打印下一个。
 * 伪代码： 笔记
 * @author Administrator
 *
 */
public class PrintListReversingly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		n1.key = 1;
		n1.next = n2;
		n2.key = 2;
		n2.next = n3;		
		n3.key = 3;
		n3.next = null;
		
		Node head = n1;
		printListRecursively(head);
		printListIteratively(head);
	}
	/**
	 * 递归的方式
	 * @param n
	 */
	public static void printListRecursively(Node n){
		if(null != n){
			printListRecursively(n.next);
			System.out.println(n.key);
		}
	}
	
	/**
	 * 入栈、弹栈的方式
	 * @param n
	 */
	public static void printListIteratively(Node n){
		Stack<Node> s_node = new Stack<Node>();
		//入栈
		while (n != null) {
			s_node.push(n);
			n = n.next;
		}
		//弹栈、打印
		while (!s_node.empty()) {
			System.out.println(s_node.pop().key);
		}
	}
}

class Node
{
	int key;
	Node next;
}
