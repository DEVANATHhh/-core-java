class CarrotHalwa
{
    String[] ingredients;
    HalwaInfo[] halwaInfo;

    CarrotHalwa(String[] ingredients, HalwaInfo[] halwaInfo)
    {
        this.ingredients = ingredients;
        this.halwaInfo = halwaInfo;
    }

    void displayHalwa()
    {
        
        if(this.ingredients != null)
        {
            

            for(String i : ingredients)
            {
                System.out.println("ingredient: " + i);
            }
        }

        if(this.halwaInfo != null)
        {


            for(HalwaInfo hi : halwaInfo)
            {
                if(hi != null)
                {
                    hi.displayHalwaInfo();
          }
        }
     }
   }
}