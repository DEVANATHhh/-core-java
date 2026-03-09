class Parliament
{

    ParliamentType type; 
    String country;
    Building building;

    Parliament(ParliamentType type, String country, Building building)
    {
        this.type=type;
        this.country=country;
        this.building=building;
    }

    void printInfo()
    {
        System.out.println("Parliament Type : "+this.type);
        System.out.println("Parliament Country : "+this.country);
        System.out.println("Parliament Building : "+this.building);

        if(this.building!=null)
        {
            System.out.println("Building name : "+this.building.name);
            System.out.println("Building floors : "+this.building.floors);
        }
        else{
            System.out.println("building is null");
        }
    }
}