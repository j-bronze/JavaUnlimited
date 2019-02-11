package by.htp.boroznovskaya.action;

import java.util.Arrays;

public class Sorting {
	public static String sortASC(double[] array) {
		for (int j = 2; j < array.length; j++) {
			double tmp = array[j];
			int i = j - 1;
			while (i >= 0 && array[i] > tmp) {
				array[i + 1] = array[i];
				i = i - 1;
			}
			array[i + 1] = tmp;
		}
		return Arrays.toString(array);
	}
}
