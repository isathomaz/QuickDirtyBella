package quik.controller;

import quik.view.DirtFrame;


public class DirtController
{
	
	private DirtFrame appFrame;

	public DirtController()
	{

	}
	
	public void start()
	{
		appFrame = new DirtFrame(this);
	}

}
