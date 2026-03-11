class CarrotHalwa
{
	String[] ingredients;
	HalwaInfo[] halwaInfo;
	
	CarrotHalwa(String[] ingredients,HalwaInfo[] halwaInfo)
	{
		this.ingredients=ingredients;
		this.halwaInfo=halwaInfo;
	}
	
	void displayHalwa()
	{
		for(String i:ingredients)
		{
			System.out.println("ingredient: "+i);
		}
		
		for(HalwaInfo hi:halwaInfo)
		{
			hi.displayHalwaInfo();
		}
	}
}