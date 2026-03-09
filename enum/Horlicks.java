class Horlicks
{
    HorlicksFlavor flavor;
    int weight;
    Manufacturer manufacturer;

    Horlicks(HorlicksFlavor flavor,int weight,Manufacturer manufacturer)
    {
        this.flavor=flavor;
        this.weight=weight;
        this.manufacturer=manufacturer;
    }

    void printInfo()
    {
        System.out.println("Flavor : "+this.flavor);
        System.out.println("Weight : "+this.weight);
        System.out.println("Manufacturer : "+this.manufacturer);

        if(this.manufacturer!=null)
        {
            System.out.println("Name : "+this.manufacturer.name);
            System.out.println("Country : "+this.manufacturer.country);
        }
        else{
            System.out.println("manufacturer is null");
        }
    }
}