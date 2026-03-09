class Paneer
{
    PaneerType type;
    double weight;
    Dairy dairy;

    Paneer(PaneerType type,double weight,Dairy dairy)
    {
        this.type=type;
        this.weight=weight;
        this.dairy=dairy;
    }

    void printInfo()
    {
        System.out.println("Type : "+this.type);
        System.out.println("Weight : "+this.weight);
        System.out.println("Dairy : "+this.dairy);

        if(this.dairy!=null)
        {
            System.out.println("Dairy name : "+this.dairy.name);
            System.out.println("City : "+this.dairy.city);
        }
        else{
            System.out.println("dairy is null");
        }
    }
}