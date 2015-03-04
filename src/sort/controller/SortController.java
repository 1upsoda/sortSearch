package sort.controller;

import javax.swing.JOptionPane;

import sort.model.Sort;
import sort.model.SortingMachine;
import sort.view.SortFrame;

public class SortController
{

	private int [] integers;
	private double [] reals;
	private String [] words;
	private SortFrame appFrame;
	private long startTime;
	private long endTime;
	private long sortTime;
	private SortingMachine baseController;
	
	
	public SortController()
	{
		baseController = new SortingMachine();
	}
	
	public void start()
	{
		
		/**
		 * fills the different array that we want to sort (size of int array, randomization of int array)
		 */
		fillTheArrays(11000, 50000);
		
		/**
		 * prints the numbers inside the number array
		 */
		System.out.println(baseController.displayTheArray(integers));
		/**
		 * sorts the integer array
		 */
		baseController.selectionSort(integers);
		/**
		 * prints the newly sorted array
		 */
		System.out.println(baseController.displayTheArray(integers));
		/**
		 * tells the time it took to sort the array
		 */
		System.out.println(baseController.sortingTime(sortTime));
		

		
	}

	/**
	 * fills all of the arrays
	 */
	private void fillTheArrays(int sizeOfIntArray, int randomizationOfIntArray)
	{
		fillTheIntArray(sizeOfIntArray, randomizationOfIntArray);
		filltheDoubleArray();
		fillTheStringArray();
		
	}
	
	private void fillTheStringArray()
	{
		
		
	}

	private void filltheDoubleArray()
	{
		
		
	}
/**
 * fills the int array specifically with (size) amount of random ints any where from 0-(randomization value)
 */
	private void fillTheIntArray(int size, int randomization)
	{
		startTime = System.currentTimeMillis();
//		String displayInt = "";
		integers = new int [size];
		for(int start = 0 ; start < integers.length; start++)
		{
			integers[start] = (int) (Math.random() * randomization);
			
//			displayInt += "" +integers[start]+ ", ";
			
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
//		System.out.println(displayInt);
	}
	
	
	
	
	
	
	
}