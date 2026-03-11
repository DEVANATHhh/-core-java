class Server
{
	int[] ports;
	ServerInfo[] serverInfo;
	
	Server(int[] ports,ServerInfo[] serverInfo)
	{
		this.ports=ports;
		this.serverInfo=serverInfo;
	}
	
	void displayServer()
	{
		for(int p:ports)
		{
			System.out.println("port: "+p);
		}
		
		for(ServerInfo s:serverInfo)
		{
			s.displayServerInfo();
		}
	}
}