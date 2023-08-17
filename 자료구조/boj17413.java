package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj17413 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char ch[] = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		boolean is = false;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='<') {
				is=true;
				int size = stack.size();
				for (int j = 0; j < size; j++) {
					System.out.print(stack.pop());
				}
				System.out.print("<");
				continue;
			}
			if(ch[i]=='>')
			{
				System.out.print(ch[i]);
				is=false;
				continue;
			}
			
			if(ch[i]==' '||ch[i]=='<') {
				int size = stack.size();
				for (int j = 0; j < size; j++) {
					System.out.print(stack.pop());
				}
				System.out.print(" ");
				continue;
			}
			
			if(!is) {
				stack.push(ch[i]);
			}else {
				System.out.print(ch[i]);
			}
			
		}
		if(!stack.isEmpty()) {
			int size = stack.size();
			for (int j = 0; j < size; j++) {
				System.out.print(stack.pop());
			}
		}
		
	}

}
