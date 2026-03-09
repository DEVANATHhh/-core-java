class Court
{
    CourtType type; 
    String city;
    Judge judge;

    Court(CourtType type,String city,Judge judge)
    {
        this.type=type;
        this.city=city;
        this.judge=judge;
    }

    void printInfo()
    {
        System.out.println("Court Type : "+this.type);
        System.out.println("Court City : "+this.city);
        System.out.println("Judge : "+this.judge);

        if(this.judge!=null)
        {
            System.out.println("Judge Name : "+this.judge.name);
            System.out.println("Judge Experience : "+this.judge.experience);
        }
        else{
            System.out.println("judge is null");
        }
    }
}