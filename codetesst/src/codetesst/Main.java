package codetesst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		mData[] A = new mData[N];

		for (int i = 0; i < N; i++) {
		    A[i] = new mData(Integer.parseInt(reader.readLine()), i);
		}
		Arrays.sort(A);
		
			
	}
	
	class mData implements Comparable<mData>{
		int value = 0;
		int index = 0;
		
		public mData(int value, int index) {
			this.value = value;
			this.index = index;
		}
		
		
		@Override
		public int compareTo(mData o) {
			return this.value - o.value;
		}
		
	}

}
