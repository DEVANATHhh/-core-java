class Pumpkin
{
    PumpkinType type;
    String color;
    Farm farm;

    Pumpkin(PumpkinType type,String color,Farm farm)
    {
        this.type=type;
        this.color=color;
        this.farm=farm;
    }

    void printInfo()
    {
        System.out.println("Pumpkin Type : "+this.type);
        System.out.println("Pumpkin Color : "+this.color);
        System.out.println("Farm : "+this.farm);

        if(this.farm!=null)
        {
            System.out.println("Farm owner : "+this.farm.owner);
            System.out.println("Farm location : "+this.farm.location);
        }
        else{
            System.out.println("farm is null");
        }
    }
}