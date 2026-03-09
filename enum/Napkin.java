class Napkin
{

   

    NapkinSize size; 
    String color; 
    Material material;

    Napkin(NapkinSize size,String color,Material material)
    {
        this.size=size;
        this.color=color;
        this.material=material;
    }

    void printInfo()
    {
        System.out.println("Napkin size : "+this.size);
        System.out.println("Napkin Color : "+this.color);
        System.out.println("Napkin Material : "+this.material);

        if(this.material!=null)
        {
            System.out.println("Napkin Material quality : "+this.material.quality);
            System.out.println("Napkin Material type : "+this.material.type);
        }
        else{
            System.out.println("material is null");
        }
    }

}