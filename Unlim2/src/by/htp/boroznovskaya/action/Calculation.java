package by.htp.boroznovskaya.action;

public class Calculation {
	
	public static double sum(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static double average(double[] array) {
		double sum = 0;
		int counter = 0;
		double avg;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			counter++;
		}
		avg = sum / counter;
		return avg;
	}
}
