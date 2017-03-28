package projectEuler;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestPrimeFactor {
	public static boolean isPrime(int num){
		if ( num > 2 && num%2 == 0 ) {
	        return false;
	    }
	    int top = (int)Math.sqrt(num) + 1;
	    for(int i = 3; i < top; i+=2){
	        if(num % i == 0){
	            return false;
	        }
	    }
	    return true; 
	}
	
	public static ArrayList<Integer> getFactors(int n,int i) {
		if(n==1) {
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(1);
			return temp;
		}
		ArrayList<Integer> list = new ArrayList<>(); 
		if(n%i==0) {
			 list.add(i);
			 list.addAll(getFactors(n/i, i));
		} else {
			list.addAll(getFactors(n, ++i));
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int t = s.nextInt();
		for(int test=0;test<t;test++) {
			int n = s.nextInt();
			while(true) {
				if(n%2==0) {
					n=n/2;
				} else {
					break;
				}
			}
			if(n==1) {
				System.out.println("2");
				continue;
			}
			while(true) {
				if(isPrime(n)) {
					System.out.println(n);
					break;
				}
				n=n-2;
			}
		}
	}
}
