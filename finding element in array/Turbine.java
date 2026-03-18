class Turbine{

	String[] turbineName;
	int index=0;
	
	Turbine(String[] turbineName)
	{
		this.turbineName=turbineName;
	}
	
	void getTurbineName(String name)
	{
		System.out.println("executing getTurbineName in Turbine. "+"\nname:"+name);
	
		if(this.turbineName!=null)
		{
			int size=this.turbineName.length;
			System.out.println("the max items of the array:"+size);
			if(index<size)
			{
				this.turbineName[index]=name;
				System.out.println("current index: "+this.index);
				index++;
				System.out.println("turbine name saved,next index: "+this.index);
			}
			else
			{
				System.out.println("sorry, turbine names are filled, we cant store");
			}
		}
		else
		{
			System.out.println("the turbine name should not be a null");
		}
	}

	void searchTurbineName(String name)
	{
		boolean isFound=false;

		if(this.turbineName!=null)
		{
			for(int i=0;i<this.turbineName.length;i++)
			{
				if(name.equals(this.turbineName[i]))
				{
					System.out.println("turbine found at index:"+i);
					isFound=true;
				}
			}
			if(isFound==false)
			{
				System.out.println("turbine not found");
			}
		}
		else
		{
			System.out.println("array is null");
		}
	}
}