package com.methods;

public class Methods2 {

	public static String contador(int inicio, int fim) {
		String s = "";
		for (int c = 1; c<=fim; c++) {
			s += c + " ";
		}
		return s;
	}
}