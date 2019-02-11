package by.htp.boroznovskaya.action;

public class MinMaxElements {
	public static double findMax(double[] array) {
		double maxElem = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxElem) {
				maxElem = array[i];
			}
		}
		return maxElem;
	}

	public static double findMin(double[] array) {
		double minElem = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < minElem) {
				minElem = array[i];
			}
		}
		return minElem;
	}
}
