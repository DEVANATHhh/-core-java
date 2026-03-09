class DMart
{
    DMartType type;
    String location;
    Product product;

    DMart(DMartType type,String location,Product product)
    {
        this.type=type;
        this.location=location;
        this.product=product;
    }

    void printInfo()
    {
        System.out.println("DMart Type : "+this.type);
        System.out.println("DMart Location : "+this.location);
        System.out.println("Product : "+this.product);

        if(this.product!=null)
        {
            System.out.println("Product name : "+this.product.name);
            System.out.println("Product price : "+this.product.price);
        }
        else{
            System.out.println("product is null");
        }
    }
}