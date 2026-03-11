class Runner
{
public static void main(String... val)
{


	String[] colors=new String[3];
	colors[0]="Black";
	colors[1]="Blue";
	colors[2]="Red";

	PrinterInfo[] printerInfo=new PrinterInfo[3];
	printerInfo[0]=new PrinterInfo("HP");
	printerInfo[1]=new PrinterInfo("Canon");
	printerInfo[2]=new PrinterInfo("Epson");

	Printer printer=new Printer(colors,printerInfo);
	printer.displayPrinter();




	
	String[] paints=new String[3];
	paints[0]="Oil";
	paints[1]="Acrylic";
	paints[2]="Water";

	PainterInfo[] painterInfo=new PainterInfo[3];
	painterInfo[0]=new PainterInfo("Wall Paint");
	painterInfo[1]=new PainterInfo("Car Paint");
	painterInfo[2]=new PainterInfo("Art Paint");

	Painter painter=new Painter(paints,painterInfo);
	painter.displayPainter();




	// Carpenter
	String[] tools=new String[3];
	tools[0]="Saw";
	tools[1]="Hammer";
	tools[2]="Drill";

	CarpenterInfo[] carpenterInfo=new CarpenterInfo[3];
	carpenterInfo[0]=new CarpenterInfo("Teak");
	carpenterInfo[1]=new CarpenterInfo("Rosewood");
	carpenterInfo[2]=new CarpenterInfo("Oak");

	Carpenter carpenter=new Carpenter(tools,carpenterInfo);
	carpenter.displayCarpenter();




	int[] ports=new int[3];
	ports[0]=8080;
	ports[1]=9090;
	ports[2]=7070;

	ServerInfo[] serverInfo=new ServerInfo[3];
	serverInfo[0]=new ServerInfo("Apache");
	serverInfo[1]=new ServerInfo("Tomcat");
	serverInfo[2]=new ServerInfo("Nginx");

	Server server=new Server(ports,serverInfo);
	server.displayServer();



	 String[] jokes = new String[3];
        jokes[0] = "Knock Knock";
        jokes[1] = "Funny Joke";
        jokes[2] = "Comedy Punch";

        JokerText[] jokerText = new JokerText[3];
        jokerText[0] = new JokerText("Joke1");
        jokerText[1] = new JokerText("Joke2");
        jokerText[2] = new JokerText("Joke3");

        Joker joker = new Joker(jokes, jokerText);
        joker.displayJoker();


	


	String[] models = new String[3];
models[0] = "HP Scan";
models[1] = "Canon Scan";
models[2] = "Epson Scan";

ScannerText[] scannerText = new ScannerText[3];
scannerText[0] = new ScannerText("Flatbed");
scannerText[1] = new ScannerText("Sheetfed");
scannerText[2] = new ScannerText("Handheld");

Scanner scanner = new Scanner(models, scannerText);
scanner.displayScanner();



	String[] stocks=new String[3];
	stocks[0]="TCS";
	stocks[1]="INFY";
	stocks[2]="WIPRO";

	BrokerInfo[] brokerInfo=new BrokerInfo[3];
	brokerInfo[0]=new BrokerInfo("Zerodha");
	brokerInfo[1]=new BrokerInfo("Upstox");
	brokerInfo[2]=new BrokerInfo("AngelOne");

	Broker broker=new Broker(stocks,brokerInfo);
	broker.displayBroker();


	System.out.println("---------------------------------");

	int[] weight=new int[3];
	weight[0]=2;
	weight[1]=3;
	weight[2]=5;

	HammerInfo[] hammerInfo=new HammerInfo[3];
	hammerInfo[0]=new HammerInfo("Steel Hammer");
	hammerInfo[1]=new HammerInfo("Claw Hammer");
	hammerInfo[2]=new HammerInfo("Sledge Hammer");

	Hammer hammer=new Hammer(weight,hammerInfo);
	hammer.displayHammer();


	System.out.println("---------------------------------");


	String[] flavours=new String[3];
	flavours[0]="Sugar";
	flavours[1]="Honey";
	flavours[2]="Jaggery";

	JamoonInfo[] jamoonInfo=new JamoonInfo[3];
	jamoonInfo[0]=new JamoonInfo("Gulab Jamoon");
	jamoonInfo[1]=new JamoonInfo("Kala Jamoon");
	jamoonInfo[2]=new JamoonInfo("Dry Jamoon");

	Jamoon jamoon=new Jamoon(flavours,jamoonInfo);
	jamoon.displayJamoon();


	System.out.println("---------------------------------");


	
	 int[] size = new int[3];
        size[0] = 5;
        size[1] = 10;
        size[2] = 15;

        Text[] text = new Text[3];
        text[0] = new Text("Welcome");
        text[1] = new Text("Sale");
        text[2] = new Text("Offer");

        Banner banner = new Banner(size, text);
        banner.displayBanner();
	System.out.println("---------------------------------");


	String[] ingredients=new String[3];
	ingredients[0]="Carrot";
	ingredients[1]="Milk";
	ingredients[2]="Sugar";

	HalwaInfo[] halwaInfo=new HalwaInfo[3];
	halwaInfo[0]=new HalwaInfo("Dry Fruits");
	halwaInfo[1]=new HalwaInfo("Ghee");
	halwaInfo[2]=new HalwaInfo("Cardamom");

	CarrotHalwa halwa=new CarrotHalwa(ingredients,halwaInfo);
	halwa.displayHalwa();


	System.out.println("---------------------------------");


	int[] floors=new int[3];
	floors[0]=5;
	floors[1]=10;
	floors[2]=15;

	TowerInfo[] towerInfo=new TowerInfo[3];
	towerInfo[0]=new TowerInfo("Bangalore");
	towerInfo[1]=new TowerInfo("Mumbai");
	towerInfo[2]=new TowerInfo("Delhi");

	Tower tower=new Tower(floors,towerInfo);
	tower.displayTower();

}


}
