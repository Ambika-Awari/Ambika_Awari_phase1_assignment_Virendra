package datastructure;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack stack1 = new Stack(); 
		
		 Stack<String> stack2 = new Stack<String>(); 

	     // pushing the elements 
	     stack1.push("apple"); 
	     stack1.push("orange"); 
	     stack1.push("banana"); 
	      stack1.push("Papaya");
	      stack1.push("ranebennur");
	      stack1.push("hubbli");
	      stack1.push("delhi");
	    stack1.push("dvg");
	    
	    
	      int d=10;
	      int e=90;
	      int f=20;
	      
	      char a = 'a';
	      char b ='b';
	      char c='c';
	      
	      
	      stack1.push((int) d);
	      stack1.push((int) e);
	      stack1.push((int) f);
	      stack1.push((Character) a);
	      stack1.push((Character) b);
	      stack1.push((Character) c);
	      
	      System.out.println(stack1);
	      System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
	      System.out.println("index of elemtn Apple inside the stack  "+ stack1.indexOf("apple"));
	      System.out.println("index of elemtn delhi inside the stack  "+ stack1.indexOf("delhi"));
	      System.out.println("Popped element from stack 1: " + stack1.pop());
	      System.out.println("Popped element from stack 1: " + stack1.pop()); 
	      System.out.println("Popped element from stack 1: " + stack1.pop());
	      System.out.println("Popped element from stack 1: " + stack1.pop()); 
	      System.out.println("Popped element from stack 1: " + stack1.pop());     
	}

}
