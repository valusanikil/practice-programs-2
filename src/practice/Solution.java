package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static int getMax(int N, List<Integer> A, int M, List<Integer> B) {
		int[] arr=new int[M];
		for(int i=0;i<B.size();i++) {
			arr[i]=B.get(i);
		}
		
		int arraySize=M;
		
		int[] s1=new int[(arraySize+1)/2];
		int[] s2=new int[arraySize-s1.length];
		
		for(int i=0;i<arraySize;i++) {
			if(i<s1.length) {
				s1[i]=arr[i];
			}
			else {
				s2[i-s1.length]=arr[i];
			}
		}
		return s1.length;	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine().trim());

		List<Integer> A = new ArrayList<>(N);
		for (int j = 0; j < N; j++) {
			A.add(Integer.parseInt(scan.nextLine().trim()));
		}
		
		int M = Integer.parseInt(scan.nextLine().trim());

		List<Integer> B = new ArrayList<>(M);
		for (int j = 0; j < M; j++) {
			B.add(Integer.parseInt(scan.nextLine().trim()));
		}
		
		int result=getMax(N,A,M,B);
		
		System.out.println(result);
	}
}
