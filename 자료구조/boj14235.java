package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj14235 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> que = new PriorityQueue<>((o1,o2)->{ 
			return o2-o1;
		});
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int num = Integer.parseInt(st.nextToken());
			if(num==0) {
				if(que.isEmpty())
					System.out.println(-1);
				else {
					System.out.println(que.poll());
				}
			}else {
				for (int j = 0; j <num; j++) {
					que.offer(Integer.parseInt(st.nextToken()));
				}
			}
		}
		
	}

}
