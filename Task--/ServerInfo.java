class ServerInfo
{
	String name;
	
	ServerInfo(String name)
	{
		this.name=name;
	}
	
	void displayServerInfo()
	{
		System.out.println("server: "+this.name);
	}
}