package 구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long arr[] = new long[N+1];
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 1; i <=N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr[i] = arr[i-1]+temp;
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a  = Integer.parseInt(st.nextToken());
			int b  = Integer.parseInt(st.nextToken());
			System.out.println(arr[b]-arr[a-1]);
		}
	}

}
