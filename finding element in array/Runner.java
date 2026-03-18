class Runner
{
	public static void main(String[] args)
	{
		
		String[] companyName = new String[10];
		Petroleum petroleum = new Petroleum(companyName);
		petroleum.getCompanyName("Indian oil");
		petroleum.getCompanyName("Bharath petrolium");
		petroleum.searchCompanyName("shell");

		
		String[] cylinderName = new String[10];
		Cylinder cylinder = new Cylinder(cylinderName);
		cylinder.getCylinderName("HP Gas");
		cylinder.getCylinderName("Indane");
		cylinder.searchCylinderName("HP Gas");

	
		String[] pastaName = new String[10];
		Pasta pasta = new Pasta(pastaName);
		pasta.getPastaName("Macaroni");
		pasta.getPastaName("Penne");
		pasta.searchPastaName("Penne");

	
		String[] singerName = new String[10];
		Singer singer = new Singer(singerName);
		singer.getSingerName("Arijit Singh");
		singer.getSingerName("Shreya Ghoshal");
		singer.searchSingerName("Arijit Singh");

		String[] treeName = new String[10];
		Tree tree = new Tree(treeName);
		tree.getTreeName("Neem");
		tree.getTreeName("Mango");
		tree.searchTreeName("Neem");

		
		String[] steelName = new String[10];
		Steel steel = new Steel(steelName);
		steel.getSteelName("Tata Steel");
		steel.getSteelName("JSW Steel");
		steel.searchSteelName("JSW Steel");

		String[] kettleName = new String[10];
		Kettle kettle = new Kettle(kettleName);
		kettle.getKettleName("Prestige");
		kettle.getKettleName("Pigeon");
		kettle.searchKettleName("Prestige");

		String[] turbineName = new String[10];
		Turbine turbine = new Turbine(turbineName);
		turbine.getTurbineName("Steam Turbine");
		turbine.getTurbineName("Gas Turbine");
		turbine.searchTurbineName("Gas Turbine");

		String[] scooterName = new String[10];
		Scooter scooter = new Scooter(scooterName);
		scooter.getScooterName("Activa");
		scooter.getScooterName("Jupiter");
		scooter.searchScooterName("Activa");
	}
}