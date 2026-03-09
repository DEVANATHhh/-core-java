class Runner
{
    public static void main(String[] args)
    {

       
        Building b1 = new Building("Central Hall",3);
        Building b2 = new Building("West Block",4);
        Building b3 = new Building("East Block",6);
        Building b4 = new Building("Old Block",3);

      
        Parliament p1 = new Parliament(ParliamentType.LOKSABHA,"India",b1);
        Parliament p2 = new Parliament(ParliamentType.RAJYASABHA,"India",b2);
        Parliament p3 = new Parliament(ParliamentType.STATE,"India",b3);
        Parliament p4 = new Parliament(ParliamentType.UNION,"India",b4);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();


        Judge j1 = new Judge("Ramesh",20);
        Judge j2 = new Judge("Suresh",18);
        Judge j3 = new Judge("Mahesh",15);
        Judge j4 = new Judge("Rajesh",10);

        Court c1 = new Court(CourtType.SUPREME,"Delhi",j1);
        Court c2 = new Court(CourtType.HIGH,"Mumbai",j2);
        Court c3 = new Court(CourtType.DISTRICT,"Bangalore",j3);
        Court c4 = new Court(CourtType.CIVIL,"Mysore",j4);

        c1.printInfo();
        c2.printInfo();
        c3.printInfo();
        c4.printInfo();


       
        Product pr1 = new Product("Rice",60);
        Product pr2 = new Product("Oil",120);
        Product pr3 = new Product("Sugar",45);
        Product pr4 = new Product("Salt",20);

        DMart d1 = new DMart(DMartType.RETAIL,"Bangalore",pr1);
        DMart d2 = new DMart(DMartType.WHOLESALE,"Mysore",pr2);
        DMart d3 = new DMart(DMartType.SUPERMARKET,"Chennai",pr3);
        DMart d4 = new DMart(DMartType.HYPERMARKET,"Hyderabad",pr4);

        d1.printInfo();
        d2.printInfo();
        d3.printInfo();
        d4.printInfo();


      
        King k1 = new King("Shivaji",30);
        King k2 = new King("Krishnadevaraya",25);
        King k3 = new King("Tipu Sultan",20);
        King k4 = new King("Akbar",40);

        Fort f1 = new Fort(FortType.HILL,"Raigad",k1);
        Fort f2 = new Fort(FortType.SEA,"Sindhudurg",k2);
        Fort f3 = new Fort(FortType.LAND,"RedFort",k3);
        Fort f4 = new Fort(FortType.DESERT,"Jaisalmer",k4);

        f1.printInfo();
        f2.printInfo();
        f3.printInfo();
        f4.printInfo();


      
        Material m1 = new Material("Soft","Paper");
        Material m2 = new Material("Medium","Cloth");
        Material m3 = new Material("Premium","Cotton");
        Material m4 = new Material("Hard","Synthetic");

        Napkin n1 = new Napkin(NapkinSize.S,"White",m1);
        Napkin n2 = new Napkin(NapkinSize.M,"Blue",m2);
        Napkin n3 = new Napkin(NapkinSize.L,"Green",m3);
        Napkin n4 = new Napkin(NapkinSize.XL,"Black",m4);

        n1.printInfo();
        n2.printInfo();
        n3.printInfo();
        n4.printInfo();


        Farm fa1 = new Farm("Ravi","Mandya");
        Farm fa2 = new Farm("Kiran","Mysore");
        Farm fa3 = new Farm("Shiva","Hassan");
        Farm fa4 = new Farm("Manu","Tumkur");

        Pumpkin pu1 = new Pumpkin(PumpkinType.SMALL,"Orange",fa1);
        Pumpkin pu2 = new Pumpkin(PumpkinType.MEDIUM,"Yellow",fa2);
        Pumpkin pu3 = new Pumpkin(PumpkinType.LARGE,"Dark Orange",fa3);
        Pumpkin pu4 = new Pumpkin(PumpkinType.GIANT,"Light Orange",fa4);

        pu1.printInfo();
        pu2.printInfo();
        pu3.printInfo();
        pu4.printInfo();


      
        Company co1 = new Company("Classmate",1990);
        Company co2 = new Company("Navneet",1980);
        Company co3 = new Company("Camlin",1975);
        Company co4 = new Company("Oxford",1985);

        Calendar cal1 = new Calendar(CalendarType.WALL,2024,co1);
        Calendar cal2 = new Calendar(CalendarType.DESK,2025,co2);
        Calendar cal3 = new Calendar(CalendarType.DIGITAL,2026,co3);
        Calendar cal4 = new Calendar(CalendarType.POCKET,2027,co4);

        cal1.printInfo();
        cal2.printInfo();
        cal3.printInfo();
        cal4.printInfo();


        Manufacturer ma1 = new Manufacturer("GSK","India");
        Manufacturer ma2 = new Manufacturer("Nestle","India");
        Manufacturer ma3 = new Manufacturer("Britannia","India");
        Manufacturer ma4 = new Manufacturer("Amul","India");

        Horlicks h1 = new Horlicks(HorlicksFlavor.CHOCOLATE,500,ma1);
        Horlicks h2 = new Horlicks(HorlicksFlavor.VANILLA,750,ma2);
        Horlicks h3 = new Horlicks(HorlicksFlavor.MALT,1000,ma3);
        Horlicks h4 = new Horlicks(HorlicksFlavor.BADAM,1200,ma4);

        h1.printInfo();
        h2.printInfo();
        h3.printInfo();
        h4.printInfo();


       
        Supplier s1 = new Supplier("Rahul","Delhi");
        Supplier s2 = new Supplier("Kiran","Shimla");
        Supplier s3 = new Supplier("Ajay","Kashmir");
        Supplier s4 = new Supplier("Manoj","Punjab");

        Wallnut w1 = new Wallnut(WallnutType.BLACK,50,s1);
        Wallnut w2 = new Wallnut(WallnutType.ENGLISH,60,s2);
        Wallnut w3 = new Wallnut(WallnutType.PERSIAN,70,s3);
        Wallnut w4 = new Wallnut(WallnutType.BUTTERNUT,80,s4);

        w1.printInfo();
        w2.printInfo();
        w3.printInfo();
        w4.printInfo();


        Farmer fr1 = new Farmer("Mahesh","Goa");
        Farmer fr2 = new Farmer("Ramesh","Kerala");
        Farmer fr3 = new Farmer("Suresh","Mangalore");
        Farmer fr4 = new Farmer("Naresh","Udupi");

        Cashew cs1 = new Cashew(CashewGrade.W180,100,fr1);
        Cashew cs2 = new Cashew(CashewGrade.W210,120,fr2);
        Cashew cs3 = new Cashew(CashewGrade.W240,140,fr3);
        Cashew cs4 = new Cashew(CashewGrade.W320,160,fr4);

        cs1.printInfo();
        cs2.printInfo();
        cs3.printInfo();
        cs4.printInfo();


        
        Dairy d5 = new Dairy("Nandini","Bangalore");
        Dairy d6 = new Dairy("Amul","Gujarat");
        Dairy d7 = new Dairy("Heritage","Hyderabad");
        Dairy d8 = new Dairy("MilkyMist","TamilNadu");

        Paneer pa1 = new Paneer(PaneerType.FRESH,1,d5);
        Paneer pa2 = new Paneer(PaneerType.ORGANIC,2,d6);
        Paneer pa3 = new Paneer(PaneerType.MALAI,3,d7);
        Paneer pa4 = new Paneer(PaneerType.LOWFAT,4,d8);

        pa1.printInfo();
        pa2.printInfo();
        pa3.printInfo();
        pa4.printInfo();


        Seller se1 = new Seller("Raju","KR Market");
        Seller se2 = new Seller("Manju","City Market");
        Seller se3 = new Seller("Kiran","Yeshwantpur");
        Seller se4 = new Seller("Arjun","Majestic");

        Mushroom m5 = new Mushroom(MushroomType.BUTTON,25,se1);
        Mushroom m6 = new Mushroom(MushroomType.PORTOBELLO,30,se2);
        Mushroom m7 = new Mushroom(MushroomType.SHIITAKE,35,se3);
        Mushroom m8 = new Mushroom(MushroomType.OYSTER,40,se4);

        m5.printInfo();
        m6.printInfo();
        m7.printInfo();
        m8.printInfo();


        
        Brewery br1 = new Brewery("Kingfisher","India");
        Brewery br2 = new Brewery("Budweiser","USA");
        Brewery br3 = new Brewery("Heineken","Netherlands");
        Brewery br4 = new Brewery("Carlsberg","Denmark");

        Beer kf1 = new Beer(BeerType.LAGER,500,br1);
        Beer kf2 = new Beer(BeerType.ALE,650,br2);
        Beer kf3 = new Beer(BeerType.STOUT,700,br3);
        Beer kf4 = new Beer(BeerType.WHEAT,800,br4);

        kf1.printInfo();
        kf2.printInfo();
        kf3.printInfo();
        kf4.printInfo();

    }
}