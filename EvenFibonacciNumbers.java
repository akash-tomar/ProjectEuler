package projectEuler;

import java.util.Scanner;

public class EvenFibonacciNumbers {
	static int[] fib;
	
	public static int fib(int index) {
		if(index==1) {
			fib[index]=1;
			return 1;
		} else if(index==2) {
			fib[index]=2;
			return 2;
		}
		if(fib[index]!=0) {
			return fib[index];
		}
		return fib(index-1)+fib(index-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int test=0;test<t;test++) {
			int n = s.nextInt();
			fib = new int[100000000];
			int index=1;
			long sum = 0;
			while(true) {
				int fibnum = fib(index);
				if(fibnum>n) {
					break;
				} else if(fibnum%2==0){
					sum+=fibnum;
				}
				index++;
			}
			System.out.println(sum);
		}
	}
}
