package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2018 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int start=1;
		int end=1;
		int sum=1;

		int cnt=0;
		while(start<=end) {	
			if(sum==N) {
				cnt++;
			}
			if(sum>=N) {
				sum-=start;
				start++;
			}
			else if(sum<N) {
				end++;
				sum+=end;
			}
			
			
			
		}
		System.out.println(cnt);
		
	}
}
