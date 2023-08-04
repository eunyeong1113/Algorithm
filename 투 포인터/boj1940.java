package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1940 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int start=0;
		int end=N-1;
		int sum=0;
		int cnt=0;
		while(start<end) {
			sum=arr[start]+arr[end];
			if(sum==M) {
				cnt++;
				start++;
				end--;
			}
			else if(sum>M) {
				end--;
			}
			else if(sum<M) {
				start++;
			}
		}
		System.out.println(cnt);
		
		

	}

}
