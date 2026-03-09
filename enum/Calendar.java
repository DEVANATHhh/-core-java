class Calendar
{
    CalendarType type;
    int year;
    Company company;

    Calendar(CalendarType type,int year,Company company)
    {
        this.type=type;
        this.year=year;
        this.company=company;
    }

    void printInfo()
    {
        System.out.println("Calendar Type : "+this.type);
        System.out.println("Year : "+this.year);
        System.out.println("Company : "+this.company);

        if(this.company!=null)
        {
            System.out.println("Company name : "+this.company.name);
            System.out.println("Established : "+this.company.establishedYear);
        }
        else{
            System.out.println("company is null");
        }
    }
}