class Steel{

	String[] steelName;
	int index=0;
	
	Steel(String[] steelName)
	{
		this.steelName=steelName;
	}
	
	void getSteelName(String name)
	{
		System.out.println("executing getSteelName in Steel. "+"\nname:"+name);
	
		if(this.steelName!=null)
		{
			int size=this.steelName.length;
			System.out.println("the max items of the array:"+size);
			if(index<size)
			{
				this.steelName[index]=name;
				System.out.println("current index: "+this.index);
				index++;
				System.out.println("steel name saved,next index: "+this.index);
			}
			else
			{
				System.out.println("sorry, steel names are filled, we cant store");
			}
		}
		else
		{
			System.out.println("the steel name should not be a null");
		}
	}

	void searchSteelName(String name)
	{
		boolean isFound=false;

		if(this.steelName!=null)
		{
			for(int i=0;i<this.steelName.length;i++)
			{
				if(name.equals(this.steelName[i]))
				{
					System.out.println("steel found at index:"+i);
					isFound=true;
				}
			}
			if(isFound==false)
			{
				System.out.println("steel not found");
			}
		}
		else
		{
			System.out.println("array is null");
		}
	}
}