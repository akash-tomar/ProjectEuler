package projectEuler;

import java.util.Scanner;

public class MultiplesOf3and5 {
	
	public static long findNforNum(long num,int factor) {
		if(num%factor==0) {
			return (long)(num/factor-1);
		}
		for(int i=0;i<factor;i++) {
			if(num%factor==0) {
				return (long)(num/factor);
			} else {
				num--;
			}
		}
		return -1;
	}
	
	public static long sum(long n,int d) {
		long x= (2*d+(n-1)*d)*n/2;
		return x;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int t=0;t<test;t++) {
			long n = s.nextInt();
			long three = (long)(sum(findNforNum(n, 3), 3));
			long five = (long) sum(findNforNum(n, 5),5);
			long diff = (long) sum(findNforNum(n, 15),15);
			System.out.println(three+five-diff);
		}
	}
}
