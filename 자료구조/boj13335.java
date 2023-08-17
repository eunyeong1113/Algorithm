package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj13335 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<Integer>();
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < N; i++) {
			q.offer(Integer.parseInt(st.nextToken()));
		}
		int cnt=0;
		int sum=0;
		Queue<Integer> bridge = new LinkedList<>();
		for (int i = 0; i < W; i++) {
			bridge.offer(0);
		}
		while(!bridge.isEmpty()) {
			cnt++;
			sum-=bridge.poll();
			if(!q.isEmpty()) {
				if(q.peek()+sum<=L) {
					sum+=q.peek();
					bridge.offer(q.poll());
				}else {
					bridge.offer(0);
				}
			}	
		}
		System.out.println(cnt);
		
	}

}
