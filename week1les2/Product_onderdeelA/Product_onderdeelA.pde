class Product {
  String naam;
  int prijs;
  
  Product (String productNaam, int productPrijs){
    this.naam = productNaam;
    this.prijs = productPrijs;
  }
}

void setup(){
  Product product1 = new Product("Pc", 500);
  Product product2 = new Product("Mac", 2000);
  Product[] productLijst = {product1, product2};
    
  getLines(productLijst);
}

void getLines(Product[] producten){
  for(int i =0; i<producten.length; i++){
    println(producten[i].naam + " kost " + producten[i].prijs);
  }
}