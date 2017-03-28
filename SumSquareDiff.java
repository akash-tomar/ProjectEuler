package projectEuler;

import java.util.Scanner;

public class SumSquareDiff {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int t=0;t<test;t++) {
			int n = s.nextInt();
			long sum1=0;
			long sum2=0;
			for(int i=1;i<=n;i++) {
				sum1+=i;
				sum2+=(i*i);
			}
			sum1=sum1*sum1;
			System.out.println(sum1-sum2);
		}
	}

}