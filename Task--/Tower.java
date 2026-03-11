class Tower
{
	int[] floors;
	TowerInfo[] towerInfo;
	
	Tower(int[] floors,TowerInfo[] towerInfo)
	{
		this.floors=floors;
		this.towerInfo=towerInfo;
	}
	
	void displayTower()
	{
		for(int f:floors)
		{
			System.out.println("floor: "+f);
		}
		
		for(TowerInfo ti:towerInfo)
		{
			ti.displayTowerInfo();
		}
	}
}