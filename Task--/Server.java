class Server
{
    int[] ports;
    ServerInfo[] serverInfo;

    Server(int[] ports, ServerInfo[] serverInfo)
    {
        this.ports = ports;
        this.serverInfo = serverInfo;
    }

    void displayServer()
    {
        

        if(this.ports != null)
        {
            

            for(int p : ports)
            {
                System.out.println("port: " + p);
            }
        }

        if(this.serverInfo != null)
        {
          

            for(ServerInfo s : serverInfo)
            {
                if(s != null)
                {
                    s.displayServerInfo();
                }
            }
        }
    }
}