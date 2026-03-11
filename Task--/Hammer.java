class Hammer
{
	int[] weight;
	HammerInfo[] hammerInfo;
	
	Hammer(int[] weight,HammerInfo[] hammerInfo)
	{
		this.weight=weight;
		this.hammerInfo=hammerInfo;
	}
	
	void displayHammer()
	{
		for(int w:weight)
		{
			System.out.println("weight: "+w);
		}
		
		for(HammerInfo hi:hammerInfo)
		{
			hi.displayHammerInfo();
		}
	}
}