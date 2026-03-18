class Cylinder{

	String[] cylinderName;
	int index=0;
	
	Cylinder(String[] cylinderName)
	{
		this.cylinderName=cylinderName;
	}
	
	void getCylinderName(String name)
	{
		System.out.println("executing getCylinderName in Cylinder. "+"\nname:"+name);
	
		if(this.cylinderName!=null)
		{
			int size=this.cylinderName.length;
			System.out.println("the max items of the array:"+size);
			if(index<size)
			{
				this.cylinderName[index]=name;
				System.out.println("current index: "+this.index);
				index++;
				System.out.println("cylinder name saved,next index: "+this.index);
			}
			else
			{
				System.out.println("sorry, cylinder names are filled, we cant store");
			}
		}
		else
		{
			System.out.println("the cylinder name should not be a null");
		}
	}

	void searchCylinderName(String name)
	{
		boolean isFound=false;

		if(this.cylinderName!=null)
		{
			for(int i=0;i<this.cylinderName.length;i++)
			{
				if(name.equals(this.cylinderName[i]))
				{
					System.out.println("cylinder found at index:"+i);
					isFound=true;
				}
			}
			if(isFound==false)
			{
				System.out.println("cylinder not found");
			}
		}
		else
		{
			System.out.println("array is null");
		}
	}
}