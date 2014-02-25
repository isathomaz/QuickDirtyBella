package quik.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import quik.controller.DirtController;


public class DirtPanel extends JPanel
{
	private DirtController baseController;
	private JButton addSQLButton;
	private SpringLayout baseLayout;
	
	public DirtPanel(DirtController baseController)
	{
		addSQLButton = new JButton("boom shaka laka laka boom");
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, addSQLButton, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, addSQLButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addSQLButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, addSQLButton, -10, SpringLayout.EAST, this);
		this.baseController = baseController;
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(addSQLButton);
		
		this.setBackground(Color.WHITE);
		
			
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		addSQLButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				JOptionPane.showMessageDialog(null, "DON'T TOUCH MY LEOPARD!");
				Math.abs(WIDTH);
			}
		});
		
	}
}
