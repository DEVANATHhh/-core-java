class Jamoon
{
    String[] flavours;
    JamoonInfo[] jamoonInfo;

    Jamoon(String[] flavours, JamoonInfo[] jamoonInfo)
    {
        this.flavours = flavours;
        this.jamoonInfo = jamoonInfo;
    }

    void displayJamoon()
    {
        

        if(this.flavours != null)
        {
           

            for(String f : flavours)
            {
                System.out.println("flavour: " + f);
            }
        }

        if(this.jamoonInfo != null)
        {
           

            for(JamoonInfo ji : jamoonInfo)
            {
                if(ji != null)
                {
                    ji.displayJamoonInfo();
                }
            }
        }
    }
}