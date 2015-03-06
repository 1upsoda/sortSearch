package sort.controller;

import javax.swing.JOptionPane;

import sort.model.Sort;
import sort.model.SortingMachine;
import sort.model.Weapon;
import sort.view.SortFrame;

public class SortController
{

	private int [] integers;
	private double [] reals;
	private String [] words;
	private Weapon[] myWeapon;
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
		fillTheArrays(1000, 5000);
		
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
		
		
		System.out.println(baseController.displayTheWeaponArray(myWeapon));
		baseController.selectionSort(myWeapon);
		System.out.println(baseController.displayTheWeaponArray(myWeapon));
		System.out.println(baseController.displayTheWordArray(words));
		

		
	}

	/**
	 * fills all of the arrays
	 */
	private void fillTheArrays(int sizeOfIntArray, int randomizationOfIntArray)
	{
		fillTheIntArray(sizeOfIntArray, randomizationOfIntArray);
		fillTheDoubleArray();
		fillTheStringArray();
		fillTheWeaponArray();
		
	}
	
	private void fillTheStringArray()
	{
		words = new String [100];
		int randomStartSyllable;
		int randomVowel;
		int randomEndSyllable;
		StringBuilder addedWord = new StringBuilder("");
		for(int row = 0; row<words.length; row++)
		{
			addedWord = new StringBuilder("");
			randomStartSyllable = (int) (Math.random() * 13);
			if(randomStartSyllable == 0)
			{
				addedWord.append("ch") ;
			}
			else if(randomStartSyllable == 1)
			{
				addedWord.append("c") ;
			}
			else if(randomStartSyllable == 2)
			{
				addedWord.append("fr") ;
			}
			else if(randomStartSyllable == 3)
			{
				addedWord.append("fl");
			}
			else if(randomStartSyllable == 4)
			{
				addedWord.append("sh") ;
			}
			else if(randomStartSyllable == 5)
			{
				addedWord.append("th") ;
			}
			else if(randomStartSyllable == 6)
			{
				addedWord.append("tr") ;
			}
			else if(randomStartSyllable == 7)
			{
				addedWord.append("k") ;
			}
			else if(randomStartSyllable == 8)
			{
				addedWord.append("l") ;
			}
			else if(randomStartSyllable == 9)
			{
				addedWord.append("r") ;
			}
			else if(randomStartSyllable == 10)
			{
				addedWord.append("m") ;
			}
			else if(randomStartSyllable == 11)
			{
				addedWord.append("n") ;
			}
			else if(randomStartSyllable == 12)
			{
				addedWord.append("f") ;
			}
			randomVowel = (int) (Math.random() * 7);
			if(randomVowel == 0)
			{
				addedWord.append("u") ;
			}
			else if(randomVowel == 1)
			{
				addedWord.append("oo") ;
			}
			else if(randomVowel == 2)
			{
				addedWord.append("ee") ;
			}
			else if(randomVowel == 3)
			{
				addedWord.append("i") ;
			}
			else if(randomVowel == 4)
			{
				addedWord.append("oi") ;
			}
			else if(randomVowel == 5)
			{
				addedWord.append("a") ;
			}
			else if(randomVowel == 6)
			{
				addedWord.append("ey") ;
			}
			randomEndSyllable = (int) (Math.random() * 9);
			if(randomEndSyllable == 0)
			{
				addedWord.append("ck") ;
			}
			else if(randomEndSyllable == 1)
			{
				addedWord.append("el") ;
			}
			else if(randomEndSyllable == 2)
			{
				addedWord.append("t") ;
			}
			else if(randomEndSyllable == 3)
			{
				addedWord.append("ty") ;
			}
			else if(randomEndSyllable == 4)
			{
				addedWord.append("lly") ;
			}
			else if(randomEndSyllable == 5)
			{
				addedWord.append("th") ;
			}
			else if(randomEndSyllable == 6)
			{
				addedWord.append("f") ;
			}
			else if(randomEndSyllable == 7)
			{
				addedWord.append("ch") ;
			}
			else if(randomEndSyllable == 8)
			{
				addedWord.append("tion");
			}
			words[row] = "" +addedWord+ "";
		}
		
	
	}

	private void fillTheDoubleArray()
	{
		
		
	}
	private void fillTheWeaponArray()
	{
		myWeapon = new Weapon [100];
		for(int row = 0; row<myWeapon.length; row++)
		{
			
				String name = "" + row +  " Weapon";
				int damage = (int) (((Math.random() * 20)+55));
				boolean canTakeHeads = (damage % 2 ==0);
				if(canTakeHeads == false)
				{
					damage = 0;
					int criticalBonus = (int) (Math.random() * 100);
					if(criticalBonus <= 15)
					{
					damage += (int) (((Math.random() * 20)+55)*3);
					}
					else
					{
						damage += (int) (((Math.random() * 20)+55));
					}
					criticalBonus = (int) (Math.random() * 100);
					if(criticalBonus <= 15)
					{
					damage += (int) (((Math.random() * 20)+55)*3);
					}
					else
					{
						damage += (int) (((Math.random() * 20)+55));
					}
					criticalBonus = (int) (Math.random() * 100);
					if(criticalBonus <= 15)
					{
					damage += (int) (((Math.random() * 20)+55)*3);
					}
					else
					{
						damage += (int) (((Math.random() * 20)+55));
					}
					criticalBonus = (int) (Math.random() * 100);
					if(criticalBonus <= 15)
					{
					damage += (int) (((Math.random() * 20)+55)*3);
					}
					else
					{
						damage += (int) (((Math.random() * 20)+55));
					}
					criticalBonus = (int) (Math.random() * 100);
					if(criticalBonus <= 15)
					{
					damage += (int) (((Math.random() * 20)+55)*3);
					}
					else
					{
						damage += (int) (((Math.random() * 20)+55));
					}
				}
				else
				{
					damage = 0;
					damage += (int) ((Math.random() * 20)+55);
					damage += (int) ((Math.random() * 20)+55);
					damage += (int) ((Math.random() * 20)+55);
					damage += (int) ((Math.random() * 20)+55);
					damage += (int) ((Math.random() * 20)+55);
					
				}
				
				myWeapon[row] = new Weapon(name, damage, canTakeHeads);
			}
		
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