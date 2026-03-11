class Carpenter
{
    String[] tools;
    CarpenterInfo[] carpenterInfo;

    Carpenter(String[] tools, CarpenterInfo[] carpenterInfo)
    {
        this.tools = tools;
        this.carpenterInfo = carpenterInfo;
    }

    void displayCarpenter()
    {
      
        if(this.tools != null)
        {
        

            for(String t : tools)
            {
                System.out.println("tool: " + t);
            }
        }

        if(this.carpenterInfo != null)
        {
        
            for(CarpenterInfo ci : carpenterInfo)
            {
                if(ci != null)
                {
                    ci.displayCarpenterInfo();
       }
       }
    }
   }
}