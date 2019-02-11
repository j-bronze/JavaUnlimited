package by.htp.boroznovskaya.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Worker {
	public static String read(String fileName) {

		StringBuilder sb = new StringBuilder();
		ArrayList<String> listStrings = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { // считать из файла в ArrayList
			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				String[] s = tmp.split("\\n");
				for (String res : s) {
					System.out.println(res);
					listStrings.add(res);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		String[] arrayDigits = new String[listStrings.size()];
		listStrings.toArray(arrayDigits);

		for (int i = 0; i < arrayDigits.length; i++) {
			String[] s = arrayDigits[i].split(" ");
			double[] d = new double[s.length];
			for (int j = 0; j < s.length; j++) {
				try {
					d[j] = Double.parseDouble(s[j]); // проверить элементы нарезанной строки на тип Double
				} catch (NumberFormatException e) {
					break;
				}
				sb.append(d[j]);
				sb.append(" ");
			}

		}
		return sb.toString();
	}
}
