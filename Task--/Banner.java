class Banner
{
int[] size;
Text[] text;


Banner(int[] size, Text[] text)
{
	this.size = size;
	this.text = text;
}

void displayBanner()
{
	System.out.println("executing displayBanner in Banner");

	if(this.size != null)
	{
		System.out.println("length of size array: " + this.size.length);
		for(int s : size)
		{
			System.out.println("size: " + s);
		}
	}

	

	if(this.text != null)
	{
		System.out.println("length of text array: " + this.text.length);
		for(Text t : text)
		{
			t.displayText();
		}
	}
}


}
