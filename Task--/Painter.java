class Painter
{
	String[] paints;
	PainterInfo[] painterInfo;
	
	Painter(String[] paints,PainterInfo[] painterInfo)
	{
		this.paints=paints;
		this.painterInfo=painterInfo;
	}
	
	void displayPainter()
	{
		System.out.println("executing displayPainter in Painter");
		
		for(String p:paints)
		{
			System.out.println("paint: "+p);
		}
		
		for(PainterInfo pi:painterInfo)
		{
			pi.displayPainterInfo();
		}
	}
}