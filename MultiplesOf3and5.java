package projectEuler;

import java.util.HashMap;
import java.util.Scanner;

public class MultiplesOf3and5 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int t=0;t<test;t++) {
			long n = s.nextInt();
			int index = 1;
			long x=3;
			long y=5;
			boolean three = false;
			boolean five = false;
			long sum = 0;
			HashMap<Long, Boolean> map = new HashMap<>();
			while(true) {
				if(x>=n) {
					three = true;
				} else {
					if(!map.containsKey(x)) {
						map.put(x, true);
						sum+=x;
					}
				}
				if(y>=n) {
					five = true;
				} else {
					if(!map.containsKey(y)) {
						map.put(y, true);
						sum+=y;
					}
				}
				if(three && five) {
					break;
				}
				
				x+=3;
				y+=5;
			}
			System.out.println(sum);
		}
	}
}
