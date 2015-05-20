package sort.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import sort.controller.SortController;
import sort.model.Sort;
import sort.model.SortingMachine;
import sort.model.Weapon;

public class SortPanel extends JPanel
{
	private JScrollPane displayPane;
	private JTextArea displayArea;
	private SpringLayout baseLayout;
	private SortController baseController;
	private JTextField txtName;
	private JButton scrambleButton, selectSortButton, quickSortButton, searchButton, fillArrayWith, btnFillArrays, btnDisplayArray;
	private JTextField txtIntArraySize;
	private JTextField txtIntArrayRandom;
	private JTextField txtDoubleArraySize;
	private JTextField txtWordArraySize;
	private JTextField txtWeaponArraySize;
	private JTextField txtRpsArraySize;
	private JCheckBox chckbxWordArray,chckbxIntArray,chckbxWeaponArray,chckbxRpsArray,chckbxDoubleArray;
	private JLabel lblIntArraySize;
	private JLabel lblIntArrayRandomization;
	private JLabel lblDoubleArraySize;
	private JLabel lblWordArraySize;
	private JLabel lblWeaponArraySize;
	private JLabel lblRpsArraySize;
	private int [] integers;
	private Weapon [] myWeapon;
	private double [] reals;
	private String [] words;
	private SortingMachine theMachine;
	private long startTime;
	private long endTime;
	private long sortTime;
	
	
	
	
	
	public SortPanel(SortController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		displayArea = new JTextArea(10,30);
		displayPane = new JScrollPane(displayArea);
		
		baseLayout.putConstraint(SpringLayout.NORTH, displayPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayPane, 10, SpringLayout.WEST, this);
		integers = baseController.getIntegers();
		theMachine = new SortingMachine();
		baseController.fillTheArrays(100,100,100,100,100,100);
		integers = baseController.getIntegers();
		scrambleButton = new JButton();
		baseLayout.putConstraint(SpringLayout.NORTH, scrambleButton, 364, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, scrambleButton, 80, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayPane, -6, SpringLayout.NORTH, scrambleButton);
		scrambleButton.setText("Scramble");
		quickSortButton = new JButton();
		quickSortButton.setText("Quick Sort");
		searchButton = new JButton();
		searchButton.setText("Search");
		selectSortButton = new JButton();
		selectSortButton.setText("Select Sort");
		chckbxRpsArray = new JCheckBox("RPS Array");
		baseLayout.putConstraint(SpringLayout.WEST, chckbxRpsArray, 80, SpringLayout.WEST, this);
		chckbxWeaponArray = new JCheckBox("Weapon Array");
		baseLayout.putConstraint(SpringLayout.WEST, chckbxWeaponArray, 80, SpringLayout.WEST, this);
		chckbxWordArray = new JCheckBox("Word Array");
		baseLayout.putConstraint(SpringLayout.WEST, chckbxWordArray, 80, SpringLayout.WEST, this);
		chckbxDoubleArray = new JCheckBox("Double Array");
		baseLayout.putConstraint(SpringLayout.WEST, chckbxDoubleArray, 80, SpringLayout.WEST, this);
		chckbxIntArray = new JCheckBox("Int Array");
		baseLayout.putConstraint(SpringLayout.WEST, chckbxIntArray, 80, SpringLayout.WEST, this);
		btnFillArrays = new JButton("Fill Arrays");
		txtIntArraySize = new JTextField();
		baseLayout.putConstraint(SpringLayout.NORTH, txtIntArraySize, 141, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, txtIntArraySize, 460, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, displayPane, -6, SpringLayout.WEST, txtIntArraySize);
		txtIntArraySize.setText("100");
		lblIntArraySize = new JLabel();
		baseLayout.putConstraint(SpringLayout.NORTH, lblIntArraySize, 141, SpringLayout.NORTH, this);
		lblIntArraySize.setText("Int Array Size");
		txtIntArrayRandom = new JTextField();
		txtIntArrayRandom.setText("100");
		txtDoubleArraySize = new JTextField();
		txtDoubleArraySize.setText("100");
		txtWordArraySize = new JTextField();
		txtWordArraySize.setText("100");
		txtWeaponArraySize = new JTextField();
		txtWeaponArraySize.setText("100");
		txtRpsArraySize = new JTextField();
		txtRpsArraySize.setText("100");
		btnDisplayArray = new JButton("Display Array");
		
		
		
		setupDisplayPane();
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupTable()
	{
		
		
		
		
	}
	public void displayTextToUser(String input)
	{
		displayArea.append("\n" + input);
	}
	private void setupPanel()
	{
		this.setBackground(Color.YELLOW);
		this.setSize(1000,1000);
		this.setLayout(baseLayout);
		this.add(displayPane);
		this.add(scrambleButton);
		this.add(quickSortButton);
		this.add(searchButton);
		this.add(selectSortButton);
		this.add(chckbxWeaponArray);
		this.add(chckbxRpsArray);
		this.add(txtIntArraySize);
		this.add(txtIntArrayRandom);
		this.add(txtDoubleArraySize);
		this.add(txtWordArraySize);
		this.add(txtWeaponArraySize);
		this.add(txtRpsArraySize);
		this.add(btnFillArrays);
		this.add(chckbxIntArray);
		this.add(chckbxDoubleArray);
		this.add(chckbxWordArray);
		this.add(lblIntArraySize);
		
		lblIntArrayRandomization = new JLabel("Int Array Randomization");
		baseLayout.putConstraint(SpringLayout.NORTH, lblIntArrayRandomization, 0, SpringLayout.NORTH, txtIntArrayRandom);
		baseLayout.putConstraint(SpringLayout.WEST, lblIntArrayRandomization, 6, SpringLayout.EAST, txtIntArrayRandom);
		add(lblIntArrayRandomization);
		
		lblDoubleArraySize = new JLabel("Double Array Size");
		baseLayout.putConstraint(SpringLayout.NORTH, lblDoubleArraySize, 0, SpringLayout.NORTH, txtDoubleArraySize);
		baseLayout.putConstraint(SpringLayout.WEST, lblDoubleArraySize, 6, SpringLayout.EAST, txtDoubleArraySize);
		add(lblDoubleArraySize);
		
		lblWordArraySize = new JLabel("Word Array Size");
		baseLayout.putConstraint(SpringLayout.NORTH, lblWordArraySize, 0, SpringLayout.NORTH, txtWordArraySize);
		baseLayout.putConstraint(SpringLayout.WEST, lblWordArraySize, 6, SpringLayout.EAST, txtWordArraySize);
		add(lblWordArraySize);
		
		lblWeaponArraySize = new JLabel("Weapon Array Size");
		baseLayout.putConstraint(SpringLayout.NORTH, lblWeaponArraySize, 0, SpringLayout.NORTH, txtWeaponArraySize);
		baseLayout.putConstraint(SpringLayout.WEST, lblWeaponArraySize, 6, SpringLayout.EAST, txtWeaponArraySize);
		add(lblWeaponArraySize);
		
		lblRpsArraySize = new JLabel("Rps Array Size");
		baseLayout.putConstraint(SpringLayout.NORTH, lblRpsArraySize, 0, SpringLayout.NORTH, txtRpsArraySize);
		baseLayout.putConstraint(SpringLayout.WEST, lblRpsArraySize, 6, SpringLayout.EAST, txtRpsArraySize);
		add(lblRpsArraySize);
		
		
		baseLayout.putConstraint(SpringLayout.NORTH, btnDisplayArray, 6, SpringLayout.SOUTH, searchButton);
		baseLayout.putConstraint(SpringLayout.WEST, btnDisplayArray, 0, SpringLayout.WEST, searchButton);
		add(btnDisplayArray);
		
	}
	private void setupDisplayPane()
	{
		displayArea.setWrapStyleWord(true);
		displayArea.setLineWrap(true);
		displayArea.setEditable(false);
		displayArea.setBackground(Color.PINK);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, quickSortButton, 0, SpringLayout.NORTH, scrambleButton);
		baseLayout.putConstraint(SpringLayout.WEST, quickSortButton, 6, SpringLayout.EAST, scrambleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, searchButton, 0, SpringLayout.NORTH, scrambleButton);
		baseLayout.putConstraint(SpringLayout.WEST, searchButton, 6, SpringLayout.EAST, quickSortButton);
		baseLayout.putConstraint(SpringLayout.NORTH, selectSortButton, 6, SpringLayout.SOUTH, quickSortButton);
		baseLayout.putConstraint(SpringLayout.WEST, selectSortButton, 0, SpringLayout.WEST, quickSortButton);
		txtIntArraySize.setColumns(10);
		baseLayout.putConstraint(SpringLayout.NORTH, txtIntArrayRandom, 6, SpringLayout.SOUTH, txtIntArraySize);
		baseLayout.putConstraint(SpringLayout.WEST, txtIntArrayRandom, 0, SpringLayout.WEST, txtIntArraySize);
		txtIntArrayRandom.setColumns(10);
		baseLayout.putConstraint(SpringLayout.NORTH, txtDoubleArraySize, 6, SpringLayout.SOUTH, txtIntArrayRandom);
		baseLayout.putConstraint(SpringLayout.WEST, txtDoubleArraySize, 0, SpringLayout.WEST, txtIntArraySize);
		txtDoubleArraySize.setColumns(10);
		baseLayout.putConstraint(SpringLayout.NORTH, txtWordArraySize, 6, SpringLayout.SOUTH, txtDoubleArraySize);
		baseLayout.putConstraint(SpringLayout.WEST, txtWordArraySize, 0, SpringLayout.WEST, txtIntArraySize);
		txtWordArraySize.setColumns(10);
		baseLayout.putConstraint(SpringLayout.NORTH, txtWeaponArraySize, 6, SpringLayout.SOUTH, txtWordArraySize);
		baseLayout.putConstraint(SpringLayout.WEST, txtWeaponArraySize, 0, SpringLayout.WEST, txtIntArraySize);
		txtWeaponArraySize.setColumns(10);
		baseLayout.putConstraint(SpringLayout.NORTH, txtRpsArraySize, 6, SpringLayout.SOUTH, txtWeaponArraySize);
		baseLayout.putConstraint(SpringLayout.WEST, txtRpsArraySize, 0, SpringLayout.WEST, txtIntArraySize);
		txtRpsArraySize.setColumns(10);
		baseLayout.putConstraint(SpringLayout.NORTH, btnFillArrays, 6, SpringLayout.SOUTH, txtRpsArraySize);
		baseLayout.putConstraint(SpringLayout.WEST, btnFillArrays, 0, SpringLayout.WEST, txtIntArraySize);
		baseLayout.putConstraint(SpringLayout.NORTH, chckbxIntArray, 50, SpringLayout.SOUTH, selectSortButton);
		baseLayout.putConstraint(SpringLayout.NORTH, chckbxDoubleArray, 6, SpringLayout.SOUTH, chckbxIntArray);
		baseLayout.putConstraint(SpringLayout.NORTH, chckbxWordArray, 6, SpringLayout.SOUTH, chckbxDoubleArray);
		baseLayout.putConstraint(SpringLayout.NORTH, chckbxWeaponArray, 6, SpringLayout.SOUTH, chckbxWordArray);
		baseLayout.putConstraint(SpringLayout.NORTH, chckbxRpsArray, 6, SpringLayout.SOUTH, chckbxWeaponArray);
		baseLayout.putConstraint(SpringLayout.WEST, lblIntArraySize, 6, SpringLayout.EAST, txtIntArraySize);
		
	}
	
	private boolean makeSureHasNumbers(String userText)
	{
		boolean hasNumbers = false;
		
		if(userText.contains("0") || userText.contains("1") || userText.contains("2") || userText.contains("3") || userText.contains("4") || userText.contains("5") || userText.contains("6") || userText.contains("7") || userText.contains("8") || userText.contains("9"))
		{
			hasNumbers = true;
		}
		
		
		return hasNumbers;
	}
	
	private void setupListeners()
	{
		scrambleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
//				displayTextToUser(baseController.fillTheArrays(100,100,100,100,100,100));
				
			}
		});
		quickSortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if(chckbxIntArray.isSelected())
				{
					startTime = System.currentTimeMillis();
					integers = baseController.getIntegers();
					theMachine.quickSort(integers, 0, integers.length-1);
					displayTextToUser("done sorting");
					endTime = System.currentTimeMillis();
					sortTime = endTime-startTime;
					displayTextToUser(theMachine.sortingTime(sortTime));
					integers = baseController.getIntegers();
				}
				if(chckbxWeaponArray.isSelected())
				{
					startTime = System.currentTimeMillis();
					myWeapon = baseController.getMyWeapon();
					theMachine.quickSort(myWeapon, 0, myWeapon.length-1);
					displayTextToUser("done sorting");
					endTime = System.currentTimeMillis();
					sortTime = endTime-startTime;
					displayTextToUser(theMachine.sortingTime(sortTime));
					myWeapon = baseController.getMyWeapon();
				}
				if(chckbxDoubleArray.isSelected())
				{
					startTime = System.currentTimeMillis();
					reals = baseController.getReals();
					theMachine.quickSort(reals, 0, reals.length-1);
					displayTextToUser("done sorting");
					endTime = System.currentTimeMillis();
					sortTime = endTime-startTime;
					displayTextToUser(theMachine.sortingTime(sortTime));
					reals = baseController.getReals();
				}
				if(chckbxWordArray.isSelected())
				{
					startTime = System.currentTimeMillis();
					words = baseController.getWords();
					theMachine.quickSort(words, 0, words.length-1);
					displayTextToUser("done sorting");
					endTime = System.currentTimeMillis();
					sortTime = endTime-startTime;
					displayTextToUser(theMachine.sortingTime(sortTime));
					words = baseController.getWords();
				}
//				if(chckbxRpsArray.isSelected())
//				{
//					startTime = System.currentTimeMillis();
//					myWeapon = baseController.getMyWeapon();
//					theMachine.quickSort(myWeapon, 0, myWeapon.length-1);
//					displayTextToUser("done sorting");
//					endTime = System.currentTimeMillis();
//					sortTime = endTime-startTime;
//					displayTextToUser(theMachine.sortingTime(sortTime));
//					myWeapon = baseController.getMyWeapon();
//				}
				
			}
		});
		btnFillArrays.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				int intSize = 10;
				int intRandom = 10;
				int doubleSize = 10;
				int wordSize = 10;
				int weaponSize = 10;
				int RPSSize = 10;
				boolean hasNumbers = true;
				String noNumberFields = "";
				if(makeSureHasNumbers(txtIntArraySize.getText()))
				{
					intSize = Integer.parseInt(txtIntArraySize.getText().replaceAll("[\\D]", ""));
				}
				else
				{
					hasNumbers = false;
					noNumberFields += "Int, ";
				}
				if(makeSureHasNumbers(txtIntArrayRandom.getText()))
				{
					intRandom = Integer.parseInt(txtIntArrayRandom.getText().replaceAll("[\\D]", ""));
				}
				else
				{
					hasNumbers = false;
					noNumberFields += "Int randomness, ";
				}
				if(makeSureHasNumbers(txtDoubleArraySize.getText()))
				{
					doubleSize = Integer.parseInt(txtDoubleArraySize.getText().replaceAll("[\\D]", ""));
				}
				else
				{
					hasNumbers = false;
					noNumberFields += "Double, ";
				}
				if(makeSureHasNumbers(txtWordArraySize.getText()))
				{
					wordSize = Integer.parseInt(txtWordArraySize.getText().replaceAll("[\\D]", ""));
				}
				else
				{
					hasNumbers = false;
					noNumberFields += "Word, ";
				}
				if(makeSureHasNumbers(txtWeaponArraySize.getText()))
				{
					weaponSize = Integer.parseInt(txtWeaponArraySize.getText().replaceAll("[\\D]", ""));
				}
				else
				{
					hasNumbers = false;
					noNumberFields += "Weapon, ";
				}
				if(makeSureHasNumbers(txtRpsArraySize.getText()))
				{
					RPSSize = Integer.parseInt(txtRpsArraySize.getText().replaceAll("[\\D]", ""));
				}
				else
				{
					hasNumbers = false;
					noNumberFields += "RPS";
				}
				if(hasNumbers)
				{
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No Numbers! " +noNumberFields+ " Array(s) now filled to 10");
				}
				integers = baseController.getIntegers();
				baseController.fillTheArrays(intSize,intRandom,doubleSize,wordSize,weaponSize,RPSSize);
				displayTextToUser("filled Arrays");
				integers = baseController.getIntegers();
				
			}
		});
		btnDisplayArray.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				if(chckbxIntArray.isSelected())
				{
					integers = baseController.getIntegers();
					displayTextToUser(theMachine.displayTheArray(integers));
				}
				if(chckbxWeaponArray.isSelected())
				{
					myWeapon = baseController.getMyWeapon();
					displayTextToUser(theMachine.displayTheWeaponArray(myWeapon));
				}
				if(chckbxDoubleArray.isSelected())
				{
					reals = baseController.getReals();
					displayTextToUser(theMachine.displayTheDoubleArray(reals));
				}
				if(chckbxWordArray.isSelected())
				{
					words = baseController.getWords();
					displayTextToUser(theMachine.displayTheWordArray(words));
				}
			}
		});
		
		txtIntArraySize.addMouseListener(new MouseAdapter() 
		{
			  @Override
			  public void mouseClicked(MouseEvent e) 
			  {
			    txtIntArraySize.setText("");
			  }
		});
		txtDoubleArraySize.addMouseListener(new MouseAdapter() 
		{
			  @Override
			  public void mouseClicked(MouseEvent e) 
			  {
			    txtDoubleArraySize.setText("");
			  }
		});
		txtIntArrayRandom.addMouseListener(new MouseAdapter() 
		{
			  @Override
			  public void mouseClicked(MouseEvent e) 
			  {
			    txtIntArrayRandom.setText("");
			  }
		});
		txtWordArraySize.addMouseListener(new MouseAdapter() 
		{
			  @Override
			  public void mouseClicked(MouseEvent e) 
			  {
			    txtWordArraySize.setText("");
			  }
		});
		txtWeaponArraySize.addMouseListener(new MouseAdapter() 
		{
			  @Override
			  public void mouseClicked(MouseEvent e) 
			  {
			    txtWeaponArraySize.setText("");
			  }
		});
		txtRpsArraySize.addMouseListener(new MouseAdapter() 
		{
			  @Override
			  public void mouseClicked(MouseEvent e) 
			  {
			    txtRpsArraySize.setText("");
			  }
		});
		
	}
}
