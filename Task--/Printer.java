class Printer
{
	String[] colors;
	PrinterInfo[] printerInfo;
	
	Printer(String[] colors,PrinterInfo[] printerInfo)
	{
		this.colors=colors;
		this.printerInfo=printerInfo;
	}
	
	void displayPrinter()
	{
		
		
		if(this.colors!=null)
		{
		
			for(String c:colors)
			{
				System.out.println("color: "+c);
			}
		}
		
	
		
		if(this.printerInfo!=null)
		{
			for(PrinterInfo p:printerInfo)
			{
				p.displayPrinterInfo();
			}
		}
	}
}