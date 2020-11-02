package home;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				
				Stack<Integer> s = new Stack<>();
				
				s.push(10);
				s.push(20);
				s.push(30);
				s.push(40);
				s.push(50);
				
				System.out.println(s);
				
				Integer ele =s.pop();
				System.out.println(ele);
				
				System.out.println(s);
				
				
				Integer ele1 =s.peek();
				System.out.println(ele1);
				
				
				System.out.println(s);
				
				
				int pos =s.search(30);
				System.out.println("30 is in the position of  "+ pos);
				
				System.out.println(s.isEmpty());
				
				System.out.println(s.size());
				
			}

	}


