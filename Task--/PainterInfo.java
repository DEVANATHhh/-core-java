class PainterInfo
{
	String paintType;
	
	PainterInfo(String paintType)
	{
		this.paintType=paintType;
	}
	
	void displayPainterInfo()
	{
		System.out.println("paint type: "+this.paintType);
	}
}