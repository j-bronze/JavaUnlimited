package by.htp.boroznovskaya.utilities;

public class ConvertingToArray {
	public static double[] converting(String s) {
		
		String[] arrayNum = s.split(" ");

		double[] arrayNumbersDouble = new double[arrayNum.length];

		for (int i = 0; i < arrayNum.length; i++) {
			arrayNumbersDouble[i] = Double.parseDouble(arrayNum[i]);
		}
		return arrayNumbersDouble;
	}
}
