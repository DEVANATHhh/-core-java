class Cashew
{
    CashewGrade grade;
    int quantity;
    Farmer farmer;

    Cashew(CashewGrade grade,int quantity,Farmer farmer)
    {
        this.grade=grade;
        this.quantity=quantity;
        this.farmer=farmer;
    }

    void printInfo()
    {
        System.out.println("Grade : "+this.grade);
        System.out.println("Quantity : "+this.quantity);
        System.out.println("Farmer : "+this.farmer);

        if(this.farmer!=null)
        {
            System.out.println("Farmer name : "+this.farmer.name);
            System.out.println("Village : "+this.farmer.village);
        }
        else{
            System.out.println("farmer is null");
        }
    }
}