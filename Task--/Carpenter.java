class Carpenter
{
	String[] tools;
	CarpenterInfo[] carpenterInfo;
	
	Carpenter(String[] tools,CarpenterInfo[] carpenterInfo)
	{
		this.tools=tools;
		this.carpenterInfo=carpenterInfo;
	}
	
	void displayCarpenter()
	{
		System.out.println("executing displayCarpenter");
		
		for(String t:tools)
		{
			System.out.println("tool: "+t);
		}
		
		for(CarpenterInfo ci:carpenterInfo)
		{
			ci.displayCarpenterInfo();
		}
	}
}