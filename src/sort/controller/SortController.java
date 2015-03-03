package sort.controller;

import javax.swing.JOptionPane;

import sort.model.Sort;
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
	
	public SortController()
	{
		
	}
	
	public void start()
	{
		fillTheArrays();
		
		System.out.println(displayTheArray(integers));
		
		selectionSort(integers);
		
		System.out.println(displayTheArray(integers));
		
		System.out.println(sortingTime(sortTime));
		
//		System.out.println();
		
	}

	private void fillTheArrays()
	{
		fillTheIntArray();
		filltheDoubleArray();
		fillTheStringArray();
		
	}
	
	private void fillTheStringArray()
	{
		
		
	}

	private void filltheDoubleArray()
	{
		
		
	}

	private void fillTheIntArray()
	{
		startTime = System.currentTimeMillis();
//		String displayInt = "";
		integers = new int [5000];
		for(int start = 0 ; start < integers.length; start++)
		{
			integers[start] = (int) (Math.random() * 50000);
			
//			displayInt += "" +integers[start]+ ", ";
			
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
//		System.out.println(displayInt);
	}
	
	
	public long getSortTime()
	{
		return sortTime;
	}
	
	public int[] selectionSort(int [] toBeSorted)
	{

		int minimum;
		int minimumPosition;
//		int newNumber = 0;
//		String displayIntSort = "";
		/**
		 * the time it starts
		 */
		startTime = System.currentTimeMillis();
		/**
		 * goes through the entire sorting array
		 */
		for(int position = 0; position < toBeSorted.length; position++)
		{
			/**
			 * sets the default
			 */
			minimumPosition = position;
			minimum = toBeSorted[position];
			for(int next = position +1; next <toBeSorted.length; next ++)
			{
				/**
				 * sees if the next one is smaller, and can set it as smaller
				 */
				if(toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			/**
			 * swaps the new stuff
			 */
			if(minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
			
//			displayIntSort += "" +toBeSorted[newNumber]+ ", ";
//			newNumber++;
			
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
//		System.out.println(displayIntSort);
		
		return toBeSorted;
	}

	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		
		timeToSort += "Days: " + sortTime/(1000*60*60*24) + "\n";
		timeToSort += "Hours: " + sortTime/(1000*60*60) % 24+ "\n";
		timeToSort += "Minutes: " + sortTime/(1000*60) % 60 + "\n";
		timeToSort += "Seconds: " + sortTime/(1000) % 60 + "\n";
		timeToSort += "Milliseconds: " + sortTime % 1000 + "\n";
		
		return timeToSort;
		
	}
	public String displayTheArray(int [] arrayToDisplay)
	{
		String displayInt = "Array: ";
		for(int start = 0 ; start < arrayToDisplay.length; start++)
		{
			
			
			displayInt += "" +arrayToDisplay[start]+ ", ";
			
		}
		return displayInt;
		
	}
	
}