package by.htp.boroznovskaya.controller;

import by.htp.boroznovskaya.utilities.Worker;
import by.htp.boroznovskaya.action.MinMaxElements;
import by.htp.boroznovskaya.action.Sorting;
import by.htp.boroznovskaya.action.Calculation;
import by.htp.boroznovskaya.utilities.ConvertingToArray;
import by.htp.boroznovskaya.utilities.View;

public class Main {

	public static void main(String[] args) {

		//get string of double-numbers from file
		String fileName = "one.txt";
		String stringNumbers = Worker.read(fileName);
		View.print(stringNumbers);
		
		//convert double numbers array
		double[] arrayNumbers = ConvertingToArray.converting(stringNumbers);
		
		//get max/min elements
		double min = MinMaxElements.findMin(arrayNumbers);
		View.print("Min element in the array is " + min);
		double max = MinMaxElements.findMax(arrayNumbers);
		View.print("Max element in the array is " + max);
		
		//get sum and average of elements of the array
		double sum = Calculation.sum(arrayNumbers);
		View.print("The sum of elements is " + sum);
		double average = Calculation.average(arrayNumbers);
		View.print("The sum of elements is " + average);
		
		//sorted array by ASC
		String sortedArrayASC = Sorting.sortASC(arrayNumbers);
		View.print("Sorted array: " + sortedArrayASC);
	}

}
