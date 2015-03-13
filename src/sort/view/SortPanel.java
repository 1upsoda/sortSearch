package sort.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import sort.controller.SortController;
import sort.model.Sort;

public class SortPanel extends JPanel
{
	private JScrollPane displayPane;
	private JTextArea displayArea;
	private SpringLayout baseLayout;
	private SortController baseController;
	private JTextField txtName;
	private JButton scrambleButton, sortButton, searchButton;
	
	
	
	public SortPanel(SortController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		displayArea = new JTextArea(10,30);
		
		
		scrambleButton = new JButton();
		sortButton = new JButton();
		searchButton = new JButton();
		
		setupDisplayPane();
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupTable()
	{
		
		
		
		
	}
	private void setupPanel()
	{
		this.setBackground(Color.YELLOW);
		this.setSize(1000,1000);
		this.setLayout(baseLayout);
		this.add(displayArea);
		
		
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
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 141, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayArea, 80, SpringLayout.WEST, this);
	}
	private void setupListeners()
	{
		scrambleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				
				
			}
		});
	}
}
