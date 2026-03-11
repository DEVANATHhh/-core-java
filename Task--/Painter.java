class Painter
{
    String[] paints;
    PainterInfo[] painterInfo;

    Painter(String[] paints, PainterInfo[] painterInfo)
    {
        this.paints = paints;
        this.painterInfo = painterInfo;
    }

    void displayPainter()
    {
        

        if(this.paints != null)
        {
          

            for(String p : paints)
            {
                System.out.println("paint: " + p);
            }
        }

        if(this.painterInfo != null)
        {
          

            for(PainterInfo pi : painterInfo)
            {
                if(pi != null)
                {
                    pi.displayPainterInfo();
                }
            }
        }
    }
}