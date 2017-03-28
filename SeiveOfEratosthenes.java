package projectEuler;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SeiveOfEratosthenes {
	public static void findPrimes(int limit, int n) {

	    ArrayList<Integer> list = new ArrayList<>();

	    boolean [] isComposite = new boolean [limit + 1]; // limit + 1 because we won't use '0'th index of the array
	    isComposite[1] = true;

	    // Mark all composite numbers
	    for (int i = 2; i <= limit; i++) {
	        if (!isComposite[i]) {
	            // 'i' is a prime number
	            list.add(i);
	            if(list.size()==n) {
	            	System.out.println(list.get(list.size()-1));
	            	return;
	            }
	            int multiple = 2;
	            while (i * multiple <= limit) {
	                isComposite [i * multiple] = true;
	                multiple++;
	            }
	        }
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int test = s.nextInt();
		for(int t=0;t<test;t++) {
			int n = s.nextInt();
			findPrimes(10000000, n);
		}
	}

}
