class Kettle{

	String[] kettleName;
	int index=0;
	
	Kettle(String[] kettleName)
	{
		this.kettleName=kettleName;
	}
	
	void getKettleName(String name)
	{
		System.out.println("executing getKettleName in Kettle. "+"\nname:"+name);
	
		if(this.kettleName!=null)
		{
			int size=this.kettleName.length;
			System.out.println("the max items of the array:"+size);
			if(index<size)
			{
				this.kettleName[index]=name;
				System.out.println("current index: "+this.index);
				index++;
				System.out.println("kettle name saved,next index: "+this.index);
			}
			else
			{
				System.out.println("sorry, kettle names are filled, we cant store");
			}
		}
		else
		{
			System.out.println("the kettle name should not be a null");
		}
	}

	void searchKettleName(String name)
	{
		boolean isFound=false;

		if(this.kettleName!=null)
		{
			for(int i=0;i<this.kettleName.length;i++)
			{
				if(name.equals(this.kettleName[i]))
				{
					System.out.println("kettle found at index:"+i);
					isFound=true;
				}
			}
			if(isFound==false)
			{
				System.out.println("kettle not found");
			}
		}
		else
		{
			System.out.println("array is null");
		}
	}
}