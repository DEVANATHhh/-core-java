class Broker
{
	String[] stocks;
	BrokerInfo[] brokerInfo;
	
	Broker(String[] stocks,BrokerInfo[] brokerInfo)
	{
		this.stocks=stocks;
		this.brokerInfo=brokerInfo;
	}
	
	void displayBroker()
	{
		for(String s:stocks)
		{
			System.out.println("stock: "+s);
		}
		
		for(BrokerInfo bi:brokerInfo)
		{
			bi.displayBrokerInfo();
		}
	}
}