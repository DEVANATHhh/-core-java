class Beer
{
    BeerType type;
    double volume;
    Brewery brewery;

    Beer(BeerType type,double volume,Brewery brewery)
    {
        this.type=type;
        this.volume=volume;
        this.brewery=brewery;
    }

    void printInfo()
    {
        System.out.println("Beer Type : "+this.type);
        System.out.println("Volume : "+this.volume);
        System.out.println("Brewery : "+this.brewery);

        if(this.brewery!=null)
        {
            System.out.println("Brewery name : "+this.brewery.name);
            System.out.println("Country : "+this.brewery.country);
        }
        else{
            System.out.println("brewery is null");
        }
    }
}