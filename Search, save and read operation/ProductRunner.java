class ProductRunner {
	public static void main(String[] args) {

		Product product1 = new Product("iPhone","Apple","01-01-2025",80000,ProductType.ELECTRONICS,"Flipkart",ProductWarrentyYear.ONE,false,2001,"USA");
		Product product2 = new Product("Galaxy S23","Samsung","02-01-2025",75000,ProductType.ELECTRONICS,"Amazon",ProductWarrentyYear.ONE,false,2002,"Korea");
		Product product3 = new Product("MacBook","Apple","03-01-2025",120000,ProductType.ELECTRONICS,"Croma",ProductWarrentyYear.TWO,false,2003,"USA");
		Product product4 = new Product("AirPods","Apple","04-01-2025",20000,ProductType.ELECTRONICS,"Flipkart",ProductWarrentyYear.ONE,false,2004,"USA");
		Product product5 = new Product("Smart TV","Sony","05-01-2025",60000,ProductType.ELECTRONICS,"Reliance",ProductWarrentyYear.THREE,false,2005,"Japan");

		Product product6 = new Product("Jeans","Levis","01-02-2024",2000,ProductType.CLOTHING,"Myntra",ProductWarrentyYear.ONE,false,2006,"USA");
		Product product7 = new Product("Jacket","Adidas","02-02-2024",5000,ProductType.CLOTHING,"Amazon",ProductWarrentyYear.ONE,false,2007,"Germany");
		Product product8 = new Product("Sweater","Puma","03-02-2024",2500,ProductType.CLOTHING,"Flipkart",ProductWarrentyYear.ONE,false,2008,"Germany");
		Product product9 = new Product("Blazer","Zara","04-02-2024",6000,ProductType.CLOTHING,"Mall",ProductWarrentyYear.ONE,false,2009,"Spain");
		Product product10 = new Product("Shorts","Nike","05-02-2024",1200,ProductType.CLOTHING,"Amazon",ProductWarrentyYear.ONE,false,2010,"USA");

		Product product11 = new Product("Rice","IndiaGate","01-03-2024",800,ProductType.GROCERY,"Store",ProductWarrentyYear.ZERO,false,2011,"India");
		Product product12 = new Product("Wheat Flour","Aashirvaad","02-03-2024",500,ProductType.GROCERY,"Store",ProductWarrentyYear.ZERO,false,2012,"India");
		Product product13 = new Product("Sugar","Madhur","03-03-2024",60,ProductType.GROCERY,"Store",ProductWarrentyYear.ZERO,false,2013,"India");
		Product product14 = new Product("Salt","Tata","04-03-2024",30,ProductType.GROCERY,"Store",ProductWarrentyYear.ZERO,false,2014,"India");
		Product product15 = new Product("Cooking Oil","Fortune","05-03-2024",200,ProductType.GROCERY,"Store",ProductWarrentyYear.ZERO,false,2015,"India");

		Product product16 = new Product("Face Wash","Garnier","01-04-2024",200,ProductType.BEAUTY,"Amazon",ProductWarrentyYear.ONE,false,2016,"France");
		Product product17 = new Product("Face Cream","Nivea","02-04-2024",300,ProductType.BEAUTY,"Amazon",ProductWarrentyYear.ONE,false,2017,"Germany");
		Product product18 = new Product("Perfume","Fogg","03-04-2024",500,ProductType.BEAUTY,"Flipkart",ProductWarrentyYear.ONE,false,2018,"India");
		Product product19 = new Product("Lipstick","Lakme","04-04-2024",400,ProductType.BEAUTY,"Mall",ProductWarrentyYear.ONE,false,2019,"India");
		Product product20 = new Product("Body Lotion","Vaseline","05-04-2024",350,ProductType.BEAUTY,"Amazon",ProductWarrentyYear.ONE,false,2020,"USA");

		Product product21 = new Product("Notebook","Classmate","01-05-2024",100,ProductType.STATIONERY,"Store",ProductWarrentyYear.ZERO,false,2021,"India");
		Product product22 = new Product("Marker","Camlin","02-05-2024",50,ProductType.STATIONERY,"Store",ProductWarrentyYear.ZERO,false,2022,"India");
		Product product23 = new Product("Eraser","Natraj","03-05-2024",10,ProductType.STATIONERY,"Store",ProductWarrentyYear.ZERO,false,2023,"India");
		Product product24 = new Product("Glue","Fevicol","04-05-2024",60,ProductType.STATIONERY,"Store",ProductWarrentyYear.ZERO,false,2024,"India");
		Product product25 = new Product("Stapler","Kangaro","05-05-2024",150,ProductType.STATIONERY,"Store",ProductWarrentyYear.ZERO,false,2025,"India");
		
				Product product26 = new Product("Chair","Nilkamal","01-06-2024",1500,ProductType.HOUSEHOLD,"Flipkart",ProductWarrentyYear.TWO,false,2026,"India");
		Product product27 = new Product("Table","Ikea","02-06-2024",5000,ProductType.HOUSEHOLD,"Amazon",ProductWarrentyYear.TWO,false,2027,"Sweden");
		Product product28 = new Product("Bed","Sleepwell","03-06-2024",20000,ProductType.HOUSEHOLD,"Store",ProductWarrentyYear.FIVE,false,2028,"India");
		Product product29 = new Product("Cup","Milton","04-06-2024",200,ProductType.HOUSEHOLD,"Store",ProductWarrentyYear.ZERO,false,2029,"India");
		Product product30 = new Product("Bottle","Cello","05-06-2024",300,ProductType.HOUSEHOLD,"Store",ProductWarrentyYear.ZERO,false,2030,"India");

		Product product31 = new Product("Sneakers","Nike","01-07-2024",4000,ProductType.FOOTWEAR,"Amazon",ProductWarrentyYear.ONE,false,2031,"USA");
		Product product32 = new Product("Formal Shoes","Bata","02-07-2024",2500,ProductType.FOOTWEAR,"Store",ProductWarrentyYear.ONE,false,2032,"India");
		Product product33 = new Product("Sandals","Sparx","03-07-2024",1500,ProductType.FOOTWEAR,"Flipkart",ProductWarrentyYear.ONE,false,2033,"India");
		Product product34 = new Product("Slippers","Relaxo","04-07-2024",500,ProductType.FOOTWEAR,"Store",ProductWarrentyYear.ZERO,false,2034,"India");
		Product product35 = new Product("Boots","Woodland","05-07-2024",6000,ProductType.FOOTWEAR,"Mall",ProductWarrentyYear.ONE,false,2035,"India");

		Product product36 = new Product("Watch","Fastrack","01-08-2024",3000,ProductType.ACCESSORIES,"Amazon",ProductWarrentyYear.ONE,false,2036,"India");
		Product product37 = new Product("Sunglasses","RayBan","02-08-2024",7000,ProductType.ACCESSORIES,"Mall",ProductWarrentyYear.ONE,false,2037,"USA");
		Product product38 = new Product("Wallet","Wildcraft","03-08-2024",1500,ProductType.ACCESSORIES,"Flipkart",ProductWarrentyYear.ONE,false,2038,"India");
		Product product39 = new Product("Belt","Levis","04-08-2024",1200,ProductType.ACCESSORIES,"Amazon",ProductWarrentyYear.ONE,false,2039,"USA");
		Product product40 = new Product("Cap","Adidas","05-08-2024",800,ProductType.ACCESSORIES,"Amazon",ProductWarrentyYear.ONE,false,2040,"Germany");

		Product product41 = new Product("Pizza","Dominos","01-09-2024",500,ProductType.FOOD,"Store",ProductWarrentyYear.ZERO,false,2041,"India");
		Product product42 = new Product("Burger","McDonalds","02-09-2024",200,ProductType.FOOD,"Store",ProductWarrentyYear.ZERO,false,2042,"USA");
		Product product43 = new Product("Pasta","Italian","03-09-2024",300,ProductType.FOOD,"Store",ProductWarrentyYear.ZERO,false,2043,"Italy");
		Product product44 = new Product("Sandwich","Local","04-09-2024",100,ProductType.FOOD,"Store",ProductWarrentyYear.ZERO,false,2044,"India");
		Product product45 = new Product("Noodles","TopRamen","05-09-2024",50,ProductType.FOOD,"Store",ProductWarrentyYear.ZERO,false,2045,"India");

		Product product46 = new Product("Toy Car","HotWheels","01-10-2024",500,ProductType.TOYS,"Store",ProductWarrentyYear.ONE,false,2046,"USA");
		Product product47 = new Product("Doll","Barbie","02-10-2024",1500,ProductType.TOYS,"Store",ProductWarrentyYear.ONE,false,2047,"USA");
		Product product48 = new Product("Puzzle","Funskool","03-10-2024",300,ProductType.TOYS,"Store",ProductWarrentyYear.ONE,false,2048,"India");
		Product product49 = new Product("Lego Set","Lego","04-10-2024",5000,ProductType.TOYS,"Store",ProductWarrentyYear.ONE,false,2049,"Denmark");
		Product product50 = new Product("RC Car","ToyCo","05-10-2024",2500,ProductType.TOYS,"Store",ProductWarrentyYear.ONE,false,2050,"China");
		
				Product product51 = new Product("Tablet","Samsung","01-11-2024",30000,ProductType.ELECTRONICS,"Amazon",ProductWarrentyYear.ONE,false,2051,"Korea");
		Product product52 = new Product("Printer","HP","02-11-2024",15000,ProductType.ELECTRONICS,"Flipkart",ProductWarrentyYear.TWO,false,2052,"USA");
		Product product53 = new Product("Scanner","Canon","03-11-2024",12000,ProductType.ELECTRONICS,"Store",ProductWarrentyYear.TWO,false,2053,"Japan");
		Product product54 = new Product("Camera","Nikon","04-11-2024",50000,ProductType.ELECTRONICS,"Store",ProductWarrentyYear.THREE,false,2054,"Japan");
		Product product55 = new Product("Speaker","JBL","05-11-2024",8000,ProductType.ELECTRONICS,"Amazon",ProductWarrentyYear.ONE,false,2055,"USA");

		Product product56 = new Product("T-shirt","Roadster","01-12-2024",800,ProductType.CLOTHING,"Myntra",ProductWarrentyYear.ONE,false,2056,"India");
		Product product57 = new Product("Hoodie","Puma","02-12-2024",3000,ProductType.CLOTHING,"Amazon",ProductWarrentyYear.ONE,false,2057,"Germany");
		Product product58 = new Product("Track Suit","Nike","03-12-2024",4000,ProductType.CLOTHING,"Flipkart",ProductWarrentyYear.ONE,false,2058,"USA");
		Product product59 = new Product("Kurta","FabIndia","04-12-2024",2500,ProductType.CLOTHING,"Store",ProductWarrentyYear.ONE,false,2059,"India");
		Product product60 = new Product("Saree","Kalanjali","05-12-2024",6000,ProductType.CLOTHING,"Mall",ProductWarrentyYear.ONE,false,2060,"India");

		Product product61 = new Product("Milk","Nandini","01-01-2024",50,ProductType.GROCERY,"Store",ProductWarrentyYear.ZERO,false,2061,"India");
		Product product62 = new Product("Curd","Nandini","02-01-2024",40,ProductType.GROCERY,"Store",ProductWarrentyYear.ZERO,false,2062,"India");
		Product product63 = new Product("Butter","Amul","03-01-2024",120,ProductType.GROCERY,"Store",ProductWarrentyYear.ZERO,false,2063,"India");
		Product product64 = new Product("Cheese","Amul","04-01-2024",150,ProductType.GROCERY,"Store",ProductWarrentyYear.ZERO,false,2064,"India");
		Product product65 = new Product("Paneer","Amul","05-01-2024",200,ProductType.GROCERY,"Store",ProductWarrentyYear.ZERO,false,2065,"India");

		Product product66 = new Product("Shampoo","Dove","01-02-2024",300,ProductType.BEAUTY,"Amazon",ProductWarrentyYear.ONE,false,2066,"USA");
		Product product67 = new Product("Conditioner","Tresemme","02-02-2024",350,ProductType.BEAUTY,"Amazon",ProductWarrentyYear.ONE,false,2067,"USA");
		Product product68 = new Product("Hair Oil","Parachute","03-02-2024",150,ProductType.BEAUTY,"Store",ProductWarrentyYear.ONE,false,2068,"India");
		Product product69 = new Product("Face Powder","Ponds","04-02-2024",200,ProductType.BEAUTY,"Store",ProductWarrentyYear.ONE,false,2069,"India");
		Product product70 = new Product("Kajal","Lakme","05-02-2024",250,ProductType.BEAUTY,"Store",ProductWarrentyYear.ONE,false,2070,"India");

		Product product71 = new Product("Pen","Reynolds","01-03-2024",20,ProductType.STATIONERY,"Store",ProductWarrentyYear.ZERO,false,2071,"India");
		Product product72 = new Product("Pencil Box","Cello","02-03-2024",150,ProductType.STATIONERY,"Store",ProductWarrentyYear.ZERO,false,2072,"India");
		Product product73 = new Product("Highlighter","FaberCastell","03-03-2024",80,ProductType.STATIONERY,"Store",ProductWarrentyYear.ZERO,false,2073,"Germany");
		Product product74 = new Product("Sketch Pen","Camlin","04-03-2024",120,ProductType.STATIONERY,"Store",ProductWarrentyYear.ZERO,false,2074,"India");
		Product product75 = new Product("Chart Paper","Local","05-03-2024",30,ProductType.STATIONERY,"Store",ProductWarrentyYear.ZERO,false,2075,"India");
		
				Product product76 = new Product("Sofa","HomeCenter","01-04-2024",25000,ProductType.HOUSEHOLD,"Mall",ProductWarrentyYear.FIVE,false,2076,"India");
		Product product77 = new Product("Dining Table","Ikea","02-04-2024",20000,ProductType.HOUSEHOLD,"Amazon",ProductWarrentyYear.FIVE,false,2077,"Sweden");
		Product product78 = new Product("Wardrobe","Godrej","03-04-2024",30000,ProductType.HOUSEHOLD,"Store",ProductWarrentyYear.FIVE,false,2078,"India");
		Product product79 = new Product("Fan","Usha","04-04-2024",2500,ProductType.HOUSEHOLD,"Store",ProductWarrentyYear.TWO,false,2079,"India");
		Product product80 = new Product("Tube Light","Philips","05-04-2024",500,ProductType.HOUSEHOLD,"Store",ProductWarrentyYear.ONE,false,2080,"Netherlands");

		Product product81 = new Product("Running Shoes","Adidas","01-05-2024",5000,ProductType.FOOTWEAR,"Amazon",ProductWarrentyYear.ONE,false,2081,"Germany");
		Product product82 = new Product("Leather Shoes","RedTape","02-05-2024",3500,ProductType.FOOTWEAR,"Flipkart",ProductWarrentyYear.ONE,false,2082,"India");
		Product product83 = new Product("Flip Flops","Puma","03-05-2024",800,ProductType.FOOTWEAR,"Store",ProductWarrentyYear.ZERO,false,2083,"Germany");
		Product product84 = new Product("Sports Shoes","Nike","04-05-2024",4500,ProductType.FOOTWEAR,"Amazon",ProductWarrentyYear.ONE,false,2084,"USA");
		Product product85 = new Product("Loafers","Bata","05-05-2024",2500,ProductType.FOOTWEAR,"Store",ProductWarrentyYear.ONE,false,2085,"India");

		Product product86 = new Product("Bracelet","Titan","01-06-2024",2000,ProductType.ACCESSORIES,"Store",ProductWarrentyYear.ONE,false,2086,"India");
		Product product87 = new Product("Necklace","Tanishq","02-06-2024",15000,ProductType.ACCESSORIES,"Store",ProductWarrentyYear.ONE,false,2087,"India");
		Product product88 = new Product("Ring","Kalyan","03-06-2024",8000,ProductType.ACCESSORIES,"Store",ProductWarrentyYear.ONE,false,2088,"India");
		Product product89 = new Product("Handbag","Lavie","04-06-2024",3000,ProductType.ACCESSORIES,"Amazon",ProductWarrentyYear.ONE,false,2089,"India");
		Product product90 = new Product("Backpack","Skybags","05-06-2024",2500,ProductType.ACCESSORIES,"Flipkart",ProductWarrentyYear.ONE,false,2090,"India");

		Product product91 = new Product("Ice Cream","Amul","01-07-2024",100,ProductType.FOOD,"Store",ProductWarrentyYear.ZERO,false,2091,"India");
		Product product92 = new Product("Chocolate","Cadbury","02-07-2024",150,ProductType.FOOD,"Store",ProductWarrentyYear.ZERO,false,2092,"UK");
		Product product93 = new Product("Juice","Real","03-07-2024",120,ProductType.FOOD,"Store",ProductWarrentyYear.ZERO,false,2093,"India");
		Product product94 = new Product("Biscuits","Britannia","04-07-2024",50,ProductType.FOOD,"Store",ProductWarrentyYear.ZERO,false,2094,"India");
		Product product95 = new Product("Chips","Lays","05-07-2024",30,ProductType.FOOD,"Store",ProductWarrentyYear.ZERO,false,2095,"USA");

		Product product96 = new Product("Toy Train","Funskool","01-08-2024",1500,ProductType.TOYS,"Store",ProductWarrentyYear.ONE,false,2096,"India");
		Product product97 = new Product("Action Figure","Marvel","02-08-2024",2000,ProductType.TOYS,"Store",ProductWarrentyYear.ONE,false,2097,"USA");
		Product product98 = new Product("Board Game","Hasbro","03-08-2024",1200,ProductType.TOYS,"Store",ProductWarrentyYear.ONE,false,2098,"USA");
		Product product99 = new Product("Remote Helicopter","ToyCo","04-08-2024",3500,ProductType.TOYS,"Store",ProductWarrentyYear.ONE,false,2099,"China");
		Product product100 = new Product("Building Blocks","Lego","05-08-2024",5000,ProductType.TOYS,"Store",ProductWarrentyYear.ONE,false,2100,"Denmark");

		Product[] products = new Product[150];
		ProductOperation op = new ProductOperation(products);

		op.save(product1);
		op.save(product2);
		op.save(product3);
		op.save(product4);
		op.save(product5);
		op.save(product6);
		op.save(product7);
		op.save(product8);
		op.save(product9);
		op.save(product10);
		op.save(product11);
		op.save(product12);
		op.save(product13);
		op.save(product14);
		op.save(product15);
		op.save(product16);
		op.save(product17);
		op.save(product18);
		op.save(product19);
		op.save(product20);
		op.save(product21);
		op.save(product22);
		op.save(product23);
		op.save(product24);
		op.save(product25);
		op.save(product26);
		op.save(product27);
		op.save(product28);
		op.save(product29);
		op.save(product30);
		op.save(product31);
		op.save(product32);
		op.save(product33);
		op.save(product34);
		op.save(product35);
		op.save(product36);
		op.save(product37);
		op.save(product38);
		op.save(product39);
		op.save(product40);
		op.save(product41);
		op.save(product42);
		op.save(product43);
		op.save(product44);
		op.save(product45);
		op.save(product46);
		op.save(product47);
		op.save(product48);
		op.save(product49);
		op.save(product50);
		op.save(product51);
		op.save(product52);
		op.save(product53);
		op.save(product54);
		op.save(product55);
		op.save(product56);
		op.save(product57);
		op.save(product58);
		op.save(product59);
		op.save(product60);
		op.save(product61);
		op.save(product62);
		op.save(product63);
		op.save(product64);
		op.save(product65);
		op.save(product66);
		op.save(product67);
		op.save(product68);
		op.save(product69);
		op.save(product70);
		op.save(product71);
		op.save(product72);
		op.save(product73);
		op.save(product74);
		op.save(product75);
		op.save(product76);
		op.save(product77);
		op.save(product78);
		op.save(product79);
		op.save(product80);
		op.save(product81);
		op.save(product82);
		op.save(product83);
		op.save(product84);
		op.save(product85);
		op.save(product86);
		op.save(product87);
		op.save(product88);
		op.save(product89);
		op.save(product90);
		op.save(product91);
		op.save(product92);
		op.save(product93);
		op.save(product94);
		op.save(product95);
		op.save(product96);
		op.save(product97);
		op.save(product98);
		op.save(product99);
		op.save(product100);


		op.search("USA");
		
		op.check(2001,false);
		
		op.get(ProductType.CLOTHING);
		
		

	}
}