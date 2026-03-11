class Hammer
{
    int[] weight;
    HammerInfo[] hammerInfo;

    Hammer(int[] weight, HammerInfo[] hammerInfo)
    {
        this.weight = weight;
        this.hammerInfo = hammerInfo;
    }

    void displayHammer()
    {
      

        if(this.weight != null)
        {
          
            for(int w : weight)
            {
                System.out.println("weight: " + w);
            }
        }

        if(this.hammerInfo != null)
        {
          

            for(HammerInfo hi : hammerInfo)
            {
                if(hi != null)
                {
                    hi.displayHammerInfo();
           }
        }
     }
  }
}