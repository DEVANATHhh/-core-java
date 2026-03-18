class Scooter{

	String[] scooterName;
	int index=0;
	
	Scooter(String[] scooterName)
	{
		this.scooterName=scooterName;
	}
	
	void getScooterName(String name)
	{
		System.out.println("executing getScooterName in Scooter. "+"\nname:"+name);
	
		if(this.scooterName!=null)
		{
			int size=this.scooterName.length;
			System.out.println("the max items of the array:"+size);
			if(index<size)
			{
				this.scooterName[index]=name;
				System.out.println("current index: "+this.index);
				index++;
				System.out.println("scooter name saved,next index: "+this.index);
			}
			else
			{
				System.out.println("sorry, scooter names are filled, we cant store");
			}
		}
		else
		{
			System.out.println("the scooter name should not be a null");
		}
	}

	void searchScooterName(String name)
	{
		boolean isFound=false;

		if(this.scooterName!=null)
		{
			for(int i=0;i<this.scooterName.length;i++)
			{
				if(name.equals(this.scooterName[i]))
				{
					System.out.println("scooter found at index:"+i);
					isFound=true;
				}
			}
			if(isFound==false)
			{
				System.out.println("scooter not found");
			}
		}
		else
		{
			System.out.println("array is null");
		}
	}
}