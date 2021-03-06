package sort.model;

import java.util.ArrayList;

public class SortingMachine
{

	private long startTime;
	private long endTime;
	private long sortTime;
	
	public long getSortTime()
	{
		return sortTime;
	}
	/**
	 * quick sort for int
	 * @param intArray
	 * @param lo
	 * @param hi
	 */
	public void quickSort(int [] intArray, int lo, int hi)
	{
		
		if(lo<hi)
		{
			int pivoting = partition(intArray, lo, hi);
			quickSort(intArray, lo, pivoting - 1);
			quickSort(intArray, pivoting + 1, hi);
		}
		
	}
	private int partition(int[] intArray, int lo, int hi)
	{
		int pivotIndex = choosePivot(intArray, lo, hi);
		int pivotValue = intArray[pivotIndex];
		swap(intArray, pivotIndex, hi);
		int storeIndex = lo;
		for(int i = lo; i < hi; i++)
		{
			if(intArray[i] < pivotValue)
			{
				swap(intArray, i, storeIndex);
				storeIndex = storeIndex+1;
			}
		}
		swap(intArray, storeIndex, hi);
		return storeIndex;
	}
	public int choosePivot(int [] intArray, int lo, int hi)
	{
		int pivotInt = ((hi+lo)/2);
		return pivotInt;
	}
	public int choosePivot(ArrayList<Integer> intArray, int lo, int hi)
	{
		int pivotInt = ((hi+lo)/2);
		return pivotInt;
	}
	public void quickSort(ArrayList<Integer> intArray, int lo, int hi)
	{
		
		if(lo<hi)
		{
			int pivoting = partition(intArray, lo, hi);
			quickSort(intArray, lo, pivoting - 1);
			quickSort(intArray, pivoting + 1, hi);
		}
		
	}
	private int partition(ArrayList<Integer> intArray, int lo, int hi)
	{
		int pivotIndex = choosePivot(intArray, lo, hi);
		int pivotValue = intArray.get(pivotIndex);
		swap(intArray, pivotIndex, hi);
		int storeIndex = lo;
		for(int i = lo; i < hi; i++)
		{
			if(intArray.get(i) < pivotValue)
			{
				swap(intArray, i, storeIndex);
				storeIndex = storeIndex+1;
			}
		}
		swap(intArray, storeIndex, hi);
		return storeIndex;
	}
	
	/**
	 * quick sort for objects
	 * @param intArray
	 * @param lo
	 * @param hi
	 */
	public void quickSort(Weapon [] weaponArray, int lo, int hi)
	{
		
		if(lo<hi)
		{
			int pivoting = partition(weaponArray, lo, hi);
			quickSort(weaponArray, lo, pivoting - 1);
			quickSort(weaponArray, pivoting + 1, hi);
		}
		
	}
	private int partition(Weapon[] weaponArray, int lo, int hi)
	{
		int pivotIndex = choosePivot(weaponArray, lo, hi);
		Weapon pivotValue = weaponArray[pivotIndex];
		swap(weaponArray, pivotIndex, hi);
		int storeIndex = lo;
		for(int i = lo; i < hi; i++)
		{
			if(weaponArray[i].compareTo(pivotValue) > 0)
			{
				swap(weaponArray, i, storeIndex);
				storeIndex = storeIndex+1;
			}
		}
		swap(weaponArray, storeIndex, hi);
		return storeIndex;
	}
	/**
	 * quick sort for weapon
	 * @param weaponArray
	 * @param lo
	 * @param hi
	 * @return
	 */
	public int choosePivot(double [] doubleArray, int lo, int hi)
	{
		int pivotInt = ((hi+lo)/2);
		return pivotInt;
	}
	public void quickSort(double [] doubleArray, int lo, int hi)
	{
		
		if(lo<hi)
		{
			int pivoting = partition(doubleArray, lo, hi);
			quickSort(doubleArray, lo, pivoting - 1);
			quickSort(doubleArray, pivoting + 1, hi);
		}
		
	}
	private int partition(double[] doubleArray, int lo, int hi)
	{
		int pivotIndex = choosePivot(doubleArray, lo, hi);
		double pivotValue = doubleArray[pivotIndex];
		swap(doubleArray, pivotIndex, hi);
		int storeIndex = lo;
		for(int i = lo; i < hi; i++)
		{
			if(doubleArray[i] < pivotValue)
			{
				swap(doubleArray, i, storeIndex);
				storeIndex = storeIndex+1;
			}
		}
		swap(doubleArray, storeIndex, hi);
		return storeIndex;
	}
	public int choosePivot(String [] wordArray, int lo, int hi)
	{
		int pivotInt = ((hi+lo)/2);
		return pivotInt;
	}
	public int choosePivot(Weapon [] weaponArray, int lo, int hi)
	{
		int pivotInt = ((hi+lo)/2);
		return pivotInt;
	}
	public void quickSort(String [] wordArray, int lo, int hi)
	{
		
		if(lo<hi)
		{
			int pivoting = partition(wordArray, lo, hi);
			quickSort(wordArray, lo, pivoting - 1);
			quickSort(wordArray, pivoting + 1, hi);
		}
		
	}
	private int partition(String[] wordArray, int lo, int hi)
	{
		int pivotIndex = choosePivot(wordArray, lo, hi);
		String pivotValue = wordArray[pivotIndex];
		swap(wordArray, pivotIndex, hi);
		int storeIndex = lo;
		for(int i = lo; i < hi; i++)
		{
			if(wordArray[i].compareTo(pivotValue) < 0)
			{
				swap(wordArray, i, storeIndex);
				storeIndex = storeIndex+1;
			}
		}
		swap(wordArray, storeIndex, hi);
		return storeIndex;
	}
	// do selection sort for the strings, the object, and the reals.
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
		System.out.println(sortingTime(sortTime));
		return toBeSorted;
	}

	public ArrayList<Integer> selectionSort(ArrayList<Integer> toBeSorted)
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
		for(int position = 0; position < toBeSorted.size(); position++)
		{
			/**
			 * sets the default
			 */
			minimumPosition = position;
			minimum = toBeSorted.get(position);
			for(int next = position +1; next <toBeSorted.size(); next ++)
			{
				/**
				 * sees if the next one is smaller, and can set it as smaller
				 */
				if(toBeSorted.get(next) < minimum)
				{
					minimum = toBeSorted.get(next);
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
		System.out.println(sortingTime(sortTime));
		return toBeSorted;
	}
	
	public double[] selectionSort(double [] toBeSorted)
	{

		double minimum;
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
		System.out.println(sortingTime(sortTime));
		return toBeSorted;
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
	public void start()
	{
		
	}
	
	public Weapon [] selectionSort(Weapon [] sortTheWeapons)
	{
		int maximumPosition;
		Weapon maximum;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < sortTheWeapons.length; position++)
		{
			maximumPosition = position;
			maximum = sortTheWeapons[position];
			for(int next = position+1; next<sortTheWeapons.length; next++)
			{
				if(sortTheWeapons[next].compareTo(maximum) > 0)
				{
					maximum = sortTheWeapons[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(sortTheWeapons, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		System.out.println(sortingTime(sortTime));
		
		return sortTheWeapons;
	}
	public String[] selectionSort(String [] toBeSorted)
	{

		String minimum;
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
				if(toBeSorted[next].compareTo(minimum) > 0)
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
		System.out.println(sortingTime(sortTime));
		return toBeSorted;
	}
	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	private void swap(ArrayList<Integer> array, int position, int change)
	{
		int temp = array.get(position);
		array.set(position, array.get(change));
		array.set(change, temp);
	}
	private void swap(Weapon [] array, int position, int change)
	{
		Weapon temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	private void swap(double [] array, int position, int change)
	{
		double temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	private void swap(String [] array, int position, int change)
	{
		String temp = array[position];
		array[position] = array[change];
		array[change] = temp;
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
	public String displayTheDoubleArray(double [] arrayToDisplay)
	{
		String displayInt = "Array: ";
		for(int start = 0 ; start < arrayToDisplay.length; start++)
		{
			
			
			displayInt += "" +arrayToDisplay[start]+ ", ";
			
		}
		return displayInt;
		
	}
	public String displayTheWordArray(String [] arrayToDisplay)
	{
		String displayString = "Array: ";
		for(int start = 0 ; start < arrayToDisplay.length; start++)
		{
			
			
			displayString += "" +arrayToDisplay[start]+ ", ";
			
		}
		return displayString;
		
	}
	public String displayTheWeaponArray(Weapon [] arrayToDisplay)
	{
		String displayWeapon = "Array: ";
		for(int start = 0 ; start < arrayToDisplay.length; start++)
		{
			
			
			displayWeapon += "" +arrayToDisplay[start]+ ", ";
			
		}
		return displayWeapon;
		
	}
	
	public String displayTheArray(ArrayList<Integer> arrayToDisplay)
	{
		String displayInt = "Array: ";
		for(int start = 0 ; start < arrayToDisplay.size(); start++)
		{
			
			
			displayInt += "" +arrayToDisplay.get(start)+ ", ";
			
		}
		return displayInt;
		
	}
	
}
