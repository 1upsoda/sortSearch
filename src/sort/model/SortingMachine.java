package sort.model;

public class SortingMachine
{

	private long startTime;
	private long endTime;
	private long sortTime;
	
	public long getSortTime()
	{
		return sortTime;
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
	
	private void swap(Weapon [] array, int position, int change)
	{
		Weapon temp = array[position];
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
	
	
}
