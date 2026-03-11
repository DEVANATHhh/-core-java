class Jamoon
{
	String[] flavours;
	JamoonInfo[] jamoonInfo;
	
	Jamoon(String[] flavours,JamoonInfo[] jamoonInfo)
	{
		this.flavours=flavours;
		this.jamoonInfo=jamoonInfo;
	}
	
	void displayJamoon()
	{
		for(String f:flavours)
		{
			System.out.println("flavour: "+f);
		}
		
		for(JamoonInfo ji:jamoonInfo)
		{
			ji.displayJamoonInfo();
		}
	}
}