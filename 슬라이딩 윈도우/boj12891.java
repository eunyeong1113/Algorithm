package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj12891 {

	static int myarr[];
	static int checkarr[];
	static int check=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int answer=0;
		
		checkarr = new int[4];
		myarr = new int[4];
		
		char[] arr = br.readLine().toCharArray();
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < 4; i++) {
			checkarr[i]  = Integer.parseInt(st.nextToken());
			if(checkarr[i]==0) {
				check++;
			}
		}
		
		for (int i = 0; i < P; i++) {
			Add(arr[i]);
		}
		
		if(check==4) answer++;
		for(int i=P;i<S;i++) {
			int j=i-P;
			Add(arr[i]);
			Remove(arr[j]);
			if(check==4) answer++;
		}
		System.out.println(answer);
		
	}

	private static void Remove(char c) {
		switch(c) {
		case 'A':	
			if(myarr[0]==checkarr[0]) check--;
			myarr[0]--;
			break;
		case 'C':		
			if(myarr[1]==checkarr[1]) check--;
			myarr[1]--;
			break;
		case 'G':		
			if(myarr[2]==checkarr[2]) check--;
			myarr[2]--;
			break;
		case 'T':		
			if(myarr[3]==checkarr[3]) check--;
			myarr[3]--;
			break;
		}
		
	}

	private static void Add(char c) {
		switch(c) {
		case 'A':	
			myarr[0]++;
			if(myarr[0]==checkarr[0]) check++;
			break;
		case 'C':		
			myarr[1]++;
			if(myarr[1]==checkarr[1]) check++;
			break;
		case 'G':		
			myarr[2]++;
			if(myarr[2]==checkarr[2]) check++;
			break;
		case 'T':		
			myarr[3]++;
			if(myarr[3]==checkarr[3]) check++;
			break;
		}
		
	}

}
