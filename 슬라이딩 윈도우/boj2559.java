package boj;
//슬라이딩 윈도우
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2559 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N= Integer.parseInt(st.nextToken());
		int K= Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max=0;
		int sum=0;
		for(int i=0; i<K;i++) {
			sum += arr[i]; 
		}
		max=sum;
		for(int i=K;i<N;i++) {
			int j = i-K;
			sum = sum+arr[i]-arr[j];
			
			max = Math.max(sum, max);
		}
		System.out.println(max);

	}

}
