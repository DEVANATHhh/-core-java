class BrokerInfo
{
	String company;
	
	BrokerInfo(String company)
	{
		this.company=company;
	}
	
	void displayBrokerInfo()
	{
		System.out.println("company: "+this.company);
	}
}