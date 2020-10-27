package com.tom;

public class array {

	public static void main(String[] args) {
		//int n[] = new int[4];
		//n[0] = 4;
		//n[1] = 6;
		//n[2] = 2;
		//n[3] = 2;
		int n[] = {4,6,2,2};
		for (int m = 0; m < 7; m++) {
			int count = 0;
			for (int i = 0; i < 4; i++) {
				if(n[i] == m) {
					count++;
				}	
			}
			if(count > 0) {
			System.out.println("有 " + count + " 個 " + m + "*");
			}
			else {
				System.out.println("有 " + count + " 個 " + m);
			}
		}
	}
}
