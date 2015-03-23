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
	private SortingMachine theMachine;
	
	
	
	
	
	public SortPanel(SortController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		displayArea = new JTextArea(10,30);
		displayPane = new JScrollPane(displayArea);
		integers = baseController.getIntegers();
		theMachine = new SortingMachine();
		baseController.fillTheArrays(100,100,100,100,100,100);
		integers = baseController.getIntegers();
		scrambleButton = new JButton();
		scrambleButton.setText("Scramble");
		quickSortButton = new JButton();
		quickSortButton.setText("Quick Sort");
		searchButton = new JButton();
		searchButton.setText("Search");
		selectSortButton = new JButton();
		selectSortButton.setText("Select Sort");
		chckbxRpsArray = new JCheckBox("RPS Array");
		chckbxWeaponArray = new JCheckBox("Weapon Array");
		chckbxWordArray = new JCheckBox("Word Array");
		chckbxDoubleArray = new JCheckBox("Double Array");
		chckbxIntArray = new JCheckBox("Int Array");
		btnFillArrays = new JButton("Fill Arrays");
		txtIntArraySize = new JTextField();
		txtIntArraySize.setText("100");
		lblIntArraySize = new JLabel();
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
		
		baseLayout.putConstraint(SpringLayout.NORTH, displayPane, 141, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayPane, 80, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, scrambleButton, 37, SpringLayout.SOUTH, displayPane);
		baseLayout.putConstraint(SpringLayout.NORTH, quickSortButton, 0, SpringLayout.NORTH, scrambleButton);
		baseLayout.putConstraint(SpringLayout.WEST, quickSortButton, 6, SpringLayout.EAST, scrambleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, searchButton, 0, SpringLayout.NORTH, scrambleButton);
		baseLayout.putConstraint(SpringLayout.WEST, searchButton, 6, SpringLayout.EAST, quickSortButton);
		baseLayout.putConstraint(SpringLayout.WEST, scrambleButton, 0, SpringLayout.WEST, displayPane);
		baseLayout.putConstraint(SpringLayout.NORTH, selectSortButton, 6, SpringLayout.SOUTH, quickSortButton);
		baseLayout.putConstraint(SpringLayout.WEST, selectSortButton, 0, SpringLayout.WEST, quickSortButton);
		baseLayout.putConstraint(SpringLayout.NORTH, txtIntArraySize, 0, SpringLayout.NORTH, displayPane);
		baseLayout.putConstraint(SpringLayout.WEST, txtIntArraySize, 134, SpringLayout.EAST, displayPane);
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
		baseLayout.putConstraint(SpringLayout.WEST, chckbxIntArray, 0, SpringLayout.WEST, displayPane);
		baseLayout.putConstraint(SpringLayout.NORTH, chckbxDoubleArray, 6, SpringLayout.SOUTH, chckbxIntArray);
		baseLayout.putConstraint(SpringLayout.WEST, chckbxDoubleArray, 0, SpringLayout.WEST, displayPane);
		baseLayout.putConstraint(SpringLayout.NORTH, chckbxWordArray, 6, SpringLayout.SOUTH, chckbxDoubleArray);
		baseLayout.putConstraint(SpringLayout.WEST, chckbxWordArray, 0, SpringLayout.WEST, displayPane);
		baseLayout.putConstraint(SpringLayout.NORTH, chckbxWeaponArray, 6, SpringLayout.SOUTH, chckbxWordArray);
		baseLayout.putConstraint(SpringLayout.WEST, chckbxWeaponArray, 0, SpringLayout.WEST, displayPane);
		baseLayout.putConstraint(SpringLayout.NORTH, chckbxRpsArray, 6, SpringLayout.SOUTH, chckbxWeaponArray);
		baseLayout.putConstraint(SpringLayout.WEST, chckbxRpsArray, 0, SpringLayout.WEST, displayPane);
		baseLayout.putConstraint(SpringLayout.NORTH, lblIntArraySize, 0, SpringLayout.NORTH, displayPane);
		baseLayout.putConstraint(SpringLayout.WEST, lblIntArraySize, 6, SpringLayout.EAST, txtIntArraySize);
		
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
				integers = baseController.getIntegers();
				theMachine.quickSort(integers, 0, integers.length-1);
				displayTextToUser("done sorting");
				integers = baseController.getIntegers();
				
			}
		});
		btnFillArrays.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				integers = baseController.getIntegers();
				baseController.fillTheArrays(100,100,100,100,100,100);
				displayTextToUser("filled Arrays");
				integers = baseController.getIntegers();
				
			}
		});
		btnDisplayArray.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				integers = baseController.getIntegers();
				displayTextToUser(theMachine.displayTheArray(integers));
				
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
