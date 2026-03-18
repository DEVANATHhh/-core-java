class Pasta{

	String[] pastaName;
	int index=0;
	
	Pasta(String[] pastaName)
	{
		this.pastaName=pastaName;
	}
	
	void getPastaName(String name)
	{
		System.out.println("executing getPastaName in Pasta. "+"\nname:"+name);
	
		if(this.pastaName!=null)
		{
			int size=this.pastaName.length;
			System.out.println("the max items of the array:"+size);
			if(index<size)
			{
				this.pastaName[index]=name;
				System.out.println("current index: "+this.index);
				index++;
				System.out.println("pasta name saved,next index: "+this.index);
			}
			else
			{
				System.out.println("sorry, pasta names are filled, we cant store");
			}
		}
		else
		{
			System.out.println("the pasta name should not be a null");
		}
	}

	void searchPastaName(String name)
	{
		boolean isFound=false;

		if(this.pastaName!=null)
		{
			for(int i=0;i<this.pastaName.length;i++)
			{
				if(name.equals(this.pastaName[i]))
				{
					System.out.println("pasta found at index:"+i);
					isFound=true;
				}
			}
			if(isFound==false)
			{
				System.out.println("pasta not found");
			}
		}
		else
		{
			System.out.println("array is null");
		}
	}
}