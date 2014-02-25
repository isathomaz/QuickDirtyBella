package quik.view;

import javax.swing.JFrame;


import quik.controller.DirtController;
import quik.view.DirtPanel;


public class DirtFrame extends JFrame
{
	private DirtController baseController;
	private DirtPanel basePanel;
		
	public DirtFrame(DirtController baseController)
	{
		this.baseController = baseController;
		basePanel = new DirtPanel(baseController);
			
		setupFrame();
	}
		
	private void setupFrame()
	 {
		this.setContentPane(basePanel);
		this.setSize(800, 800);
		this.setVisible(true);
	}
}
