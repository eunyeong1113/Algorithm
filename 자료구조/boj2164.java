package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class boj2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <=N; i++) {
			q.offer(i);
		}
		while(q.size()!=1) {
			q.poll();
			int n = q.poll();
			q.offer(n);
		}
		System.out.println(q.poll());
	}

}
