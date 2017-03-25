package projectEuler;

import java.util.Scanner;

public class EvenFibonacciNumbers {
	static long[] fib;
	
	public static long fib(int index) {
		if(index==1) {
			fib[index]=2;
			return 2;
		} else if(index==2) {
			fib[index]=8;
			return 8;
		}
		if(fib[index]!=0) {
			return fib[index];
		}
		fib[index]=4*fib(index-1)+fib(index-2);
		return fib[index];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int test=0;test<t;test++) {
			long n = s.nextLong();
			fib = new long[10000000];
			int index=1;
			long sum = 0;
			while(true) {
				long fibnum = fib(index);
				if(fibnum>n) {
					break;
				} 
				sum+=fibnum;	
				index++;
			}
			System.out.println(sum);
		}
	}
}
