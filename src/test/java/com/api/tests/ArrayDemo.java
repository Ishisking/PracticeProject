package com.api.tests;

public class ArrayDemo {

	public static void main(String[] args) {
		// int e[][]=new int [2][2];
		int e[][] = { { 10, 20 }, { 30, 40 } };
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				System.out.println(i + "  " + j + "  :" + e[i][j]);
			}
		}
	}

}
