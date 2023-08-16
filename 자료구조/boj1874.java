package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		int j=1;
		int p=-1;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			while(true) {
				if(j>num) {
					p=s.pop();
					sb.append("-\n");
					if(p!=num) {
						System.out.println("NO");
						return;
					}
					break;
				}
				else if(j<=num) {
					s.push(j);
					sb.append("+\n");
					j++;
//					System.out.println("+");
				}
			}
		}
		if(s.size()==0) {
			System.out.println(sb.toString());
		}else {
			System.out.println("NO");
		}
		
		
	}

}
