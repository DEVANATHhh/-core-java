class ProductOperation {
	Product[] products;
	int currentIndex;

	ProductOperation(Product[] products) {
		this.products = products;
	}

	
	void save(Product product) {
		System.out.println("Executing product Info in Product");
		if (this.products != null && product != null) {
			int index = this.products.length - 1;

			if (this.currentIndex <= index) {
				this.products[currentIndex] = product;

				System.out.println("The Product Information Stored :" + product.name);
				System.out.println("Product Stored in index:" + currentIndex);

				this.currentIndex++;
				product.productInfo();
			} else {
				System.out.println("Array is Full Can Not Save");
			}

		} else {
			System.out.println("Array and Name is Null Check Once");
		}
	}


	void save(Product[] matireals) {

		if (matireals != null && matireals.length <= 10) {
			System.out.println("Start to Storing the Products");

			int index = this.products.length - 1;

			for (Product store : matireals) {
				if (store != null && currentIndex <= index) {

					this.products[currentIndex] = store;
					System.out.println("Product Name:" + store.name);

					currentIndex++;
				}
			}
		} else {
			System.out.println("Already store 10 products so can not store");
		}
	}

	
	boolean search(int id) {
		System.out.println("Executing the searchByUniqeId in ProductOperation");

		if (id != 0 && products != null) {
			for (Product product : this.products) {

				if (product != null) {   
					System.out.println("product is Not Null so can search the Unique Id:" + id);

					if (product.uniquwId == id) {
						System.out.println("Product Name is " + product.name + " Having Unique Id as " + id);
						product.productInfo();
						return true;
					}
				}
			}
		}
		return false;
	}

	
	boolean search(int id, String name) {
		System.out.println("Executing the searching of Id and Name");

		if (products != null && id != 0 && name != null) {
			for (Product searchs : this.products) {

				if (searchs != null) {
					System.out.println("searchs is not null proceed to searching of id and name");

					if (searchs.uniquwId == id && searchs.name.equals(name)) { 
						System.out.println("successfully search the name " + searchs.name + " with id of " + id);
						searchs.productInfo();
						return true;
					}
				}
			}
		}
		return false;
	}

	boolean search(int id, String name, String country) {

		if (products != null && id != 0 && name != null && country != null) {
			for (Product predict : this.products) {

				if (predict != null) {
					System.out.println("Proceed to Search");

					if (predict.uniquwId == id &&
						predict.name.equals(name) &&
						predict.originCountry.equals(country)) { 

						System.out.println("The Name :" + predict.name + " and Id:" + id + " With:" + country + " are Found");
						predict.productInfo();
						return true;
					}
				}
			}
		}
		return false;
	}

	
	boolean search(String country) {

		if (products != null && country != null) {
			for (Product search : this.products) {

				if (search != null) {
					System.out.println("Proceed to Search");

					if (search.originCountry.equals(country)) { 
						System.out.println("Found the Country of Product Origin:" + country);
						search.productInfo();
						return true;
					}
				}
			}
		}
		return false;
	}


	boolean check(int id, boolean expire) {

		if (products != null && id != 0) {   
			for (Product check : products) {

				if (check != null) {
					System.out.println("Proceed to check the id and expire of product");

					if (check.uniquwId == id) {
						System.out.println("Unique id is Found " + id + " then check it expire or not");

						if (check.warrentyExpired == expire) {
							return true;
						} else {
							return false;
						}
					}
				}
			}
		}
		return false;
	}

	boolean get(ProductType type) {  

		if (products != null && type != null) {
			for (Product get : products) {

				if (get != null) {
					System.out.println("Proceed to check the product type");

					if (get.productType == type) {
						System.out.println("Product Type is Found:" + type);
						get.productInfo();
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
	
}