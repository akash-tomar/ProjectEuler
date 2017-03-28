package projectEuler;

import java.util.Scanner;

public class SmallestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int t=0;t<test;t++) {
			int n = s.nextInt();
			int num = n;
			while(true) {
				boolean flag = false;
				for(int i=1;i<=n;i++) {
					if(num%i!=0) {
						flag = true;
					}
				}
				if(!flag) {
					System.out.println(num);
					break;
				}
				num++;
			}
		}
	}

}
