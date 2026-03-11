class Tower
{
    int[] floors;
    TowerInfo[] towerInfo;

    Tower(int[] floors, TowerInfo[] towerInfo)
    {
        this.floors = floors;
        this.towerInfo = towerInfo;
    }

    void displayTower()
    {
        System.out.println("executing displayTower in Tower");

        if(this.floors != null)
        {
            System.out.println("length of floors array: " + this.floors.length);
            for(int f : floors)
            {
                System.out.println("floor: " + f);
            }
        }

        if(this.towerInfo != null)
        {
            System.out.println("length of towerInfo array: " + this.towerInfo.length);
            for(TowerInfo ti : towerInfo)
            {
                if(ti != null)
                {
                    ti.displayTowerInfo();
                }
            }  
			}
 }
}