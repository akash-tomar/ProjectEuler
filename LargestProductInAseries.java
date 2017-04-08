package projectEuler;

import java.util.Scanner;

public class LargestProductInAseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int test = s.nextInt();
		for(int t=0;t<test;t++) {
			int n = s.nextInt();
			int k = s.nextInt();
			String str = s.nextLine();
			long prod = Integer.MIN_VALUE;
			for(int i=0;i<str.length();i++) {
				long ans = 1;
				if(i+5<str.length()) {
					
					for(int j=i;j<=i+5;j++) {
						ans*=str.charAt(j);
					}
				}
				prod = Math.max(prod, ans);
			}
			System.out.println(prod);	
		}
		
	}

}
