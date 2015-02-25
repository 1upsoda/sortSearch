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
		
		scrambleButton = new JButton();
		sortButton = new JButton();
		searchButton = new JButton();
		
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
		
		
	}
	private void setupLayout()
	{
		
		
		
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
