class PrinterInfo
{
	String brand;
	
	PrinterInfo(String brand)
	{
		this.brand=brand;
	}
	
	void displayPrinterInfo()
	{
		System.out.println("Printer brand: "+this.brand);
	}
}