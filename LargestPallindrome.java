package projectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LargestPallindrome {
	public static boolean isPallindrome(int mult) {
		String str = mult+"";
		int begin = 0;
		int end = str.length()-1;
		while(begin<=end) {
			if(!(str.charAt(begin)==str.charAt(end))) {
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=100;i<=999;i++) {
			for(int j=100;j<=999;j++) {
				int mult = i*j;
				if(isPallindrome(mult)) {
					 list.add(mult);
				}
			}	
		}
		Collections.sort(list);
		for(int test=0;test<t;test++) {
			int n = s.nextInt();
			int begin = 0;
			int end = list.size()-1;
			int mid = (end-begin)/2;
			int max = Integer.MIN_VALUE;
			while(mid>begin && mid<end) {
				if(list.get(mid)<n) {
					max = Math.max(max, list.get(mid));
					begin = mid;
				} else if(list.get(mid)>n) {
					end = mid;
				} else {
					break;
				}
				mid = (begin + end)/2;
			}
			System.out.println(max);
		}
	}
	

}
