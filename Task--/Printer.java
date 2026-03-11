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
		System.out.println("executing displayPrinter in Printer");
		
		if(this.colors!=null)
		{
			System.out.println("length of colors: "+this.colors.length);
			for(String c:colors)
			{
				System.out.println("color: "+c);
			}
		}
		
		System.out.println("---------------------");
		
		if(this.printerInfo!=null)
		{
			for(PrinterInfo p:printerInfo)
			{
				p.displayPrinterInfo();
			}
		}
	}
}