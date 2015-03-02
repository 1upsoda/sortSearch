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
	
	public int[] selectionSort(int [] toBeSorted)
	{

		int minimum;
		int minimumPosition;
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
			
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
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
	
	
	
}