class Tree{

	String[] treeName;
	int index=0;
	
	Tree(String[] treeName)
	{
		this.treeName=treeName;
	}
	
	void getTreeName(String name)
	{
		System.out.println("executing getTreeName in Tree. "+"\nname:"+name);
	
		if(this.treeName!=null)
		{
			int size=this.treeName.length;
			System.out.println("the max items of the array:"+size);
			if(index<size)
			{
				this.treeName[index]=name;
				System.out.println("current index: "+this.index);
				index++;
				System.out.println("tree name saved,next index: "+this.index);
			}
			else
			{
				System.out.println("sorry, tree names are filled, we cant store");
			}
		}
		else
		{
			System.out.println("the tree name should not be a null");
		}
	}

	void searchTreeName(String name)
	{
		boolean isFound=false;

		if(this.treeName!=null)
		{
			for(int i=0;i<this.treeName.length;i++)
			{
				if(name.equals(this.treeName[i]))
				{
					System.out.println("tree found at index:"+i);
					isFound=true;
				}
			}
			if(isFound==false)
			{
				System.out.println("tree not found");
			}
		}
		else
		{
			System.out.println("array is null");
		}
	}
}