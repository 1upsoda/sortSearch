package sort.view;

import javax.swing.JFrame;

import sort.controller.SortController;

public class SortFrame extends JFrame
{
	private SortPanel appPanel;
	

	public SortFrame(SortController baseController)
	{
		appPanel = new SortPanel(baseController);
		setupFrame();
		
		
	}
	
	private void setupFrame()

	{

		setContentPane(appPanel);

		setLocation(5, 6);

		setSize(400, 400);

		setResizable(false);

		setVisible(true);

	}
}