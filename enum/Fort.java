class Fort
{
    FortType type;
    String name;
    King king;

    Fort(FortType type,String name,King king)
    {
        this.type=type;
        this.name=name;
        this.king=king;
    }

    void printInfo()
    {
        System.out.println("Fort Type : "+this.type);
        System.out.println("Fort Name : "+this.name);
        System.out.println("King : "+this.king);

        if(this.king!=null)
        {
            System.out.println("King name : "+this.king.name);
            System.out.println("Reign years : "+this.king.reignYears);
        }
        else{
            System.out.println("king is null");
        }
    }
}