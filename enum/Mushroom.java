class Mushroom
{
    MushroomType type;
    int quantity;
    Seller seller;

    Mushroom(MushroomType type,int quantity,Seller seller)
    {
        this.type=type;
        this.quantity=quantity;
        this.seller=seller;
    }

    void printInfo()
    {
        System.out.println("Type : "+this.type);
        System.out.println("Quantity : "+this.quantity);
        System.out.println("Seller : "+this.seller);

        if(this.seller!=null)
        {
            System.out.println("Seller name : "+this.seller.name);
            System.out.println("Market : "+this.seller.market);
        }
        else{
            System.out.println("seller is null");
        }
    }
}