package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10025 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[10000001];
		int max = 0;
		for (int i = 0; i < N; i++) {
			st= new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[b] = a;
			max = Math.max(b, max);
		}
		
		int d = 1+(2*K);
		int sum=0;
		int answer=0;
		for(int i=0; i<d;i++) {
			sum+=arr[i];
			answer=sum;
		}
		for(int i=d; i<=max;i++) {
			int j = i-d;
			sum = sum+arr[i]-arr[j];
			answer = Math.max(sum, answer);
		}
		System.out.println(answer);
		

	}

}
