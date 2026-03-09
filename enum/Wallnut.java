class Wallnut
{
    WallnutType type;
    double weight;
    Supplier supplier;

    Wallnut(WallnutType type,double weight,Supplier supplier)
    {
        this.type=type;
        this.weight=weight;
        this.supplier=supplier;
    }

    void printInfo()
    {
        System.out.println("Type : "+this.type);
        System.out.println("Weight : "+this.weight);
        System.out.println("Supplier : "+this.supplier);

        if(this.supplier!=null)
        {
            System.out.println("Supplier name : "+this.supplier.name);
            System.out.println("City : "+this.supplier.city);
        }
        else{
            System.out.println("supplier is null");
        }
    }
}