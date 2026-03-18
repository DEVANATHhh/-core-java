class Singer{

	String[] singerName;
	int index=0;
	
	Singer(String[] singerName)
	{
		this.singerName=singerName;
	}
	
	void getSingerName(String name)
	{
		System.out.println("executing getSingerName in Singer. "+"\nname:"+name);
	
		if(this.singerName!=null)
		{
			int size=this.singerName.length;
			System.out.println("the max items of the array:"+size);
			if(index<size)
			{
				this.singerName[index]=name;
				System.out.println("current index: "+this.index);
				index++;
				System.out.println("singer name saved,next index: "+this.index);
			}
			else
			{
				System.out.println("sorry, singer names are filled, we cant store");
			}
		}
		else
		{
			System.out.println("the singer name should not be a null");
		}
	}

	void searchSingerName(String name)
	{
		boolean isFound=false;

		if(this.singerName!=null)
		{
			for(int i=0;i<this.singerName.length;i++)
			{
				if(name.equals(this.singerName[i]))
				{
					System.out.println("singer found at index:"+i);
					isFound=true;
				}
			}
			if(isFound==false)
			{
				System.out.println("singer not found");
			}
		}
		else
		{
			System.out.println("array is null");
		}
	}
}