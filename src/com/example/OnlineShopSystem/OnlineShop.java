package com.example.OnlineShopSystem;

import java.util.HashMap;
import java.util.Map;

/* 
addProduct(Product product): Diese Methode sollte ein neues Produkt
zum Shop hinzufügen.

removeProduct(int productID): Diese Methode sollte ein Produkt aus
dem Shop entfernen

getProduct(int productID): Diese Methode sollte ein Produkt anhand
seiner Produkt-ID zurückgeben.

processOrder(ShoppingCart cart): Diese Methode sollte eine
Bestellung entgegennehmen und den Gesamtpreis der Bestellung berechnen. 
Stellen Sie sicher, dass die Produkte im Warenkorb verfügbar sind und der 
Lagerbestand entsprechend aktualisiert wird 
*/

public class OnlineShop {

  private Map<Product, Integer> onlineShop;

  public OnlineShop() {
    onlineShop = new HashMap<>();
  }

  public void addProduct(Product product) {
    onlineShop.put(product, product.getAvailableStock());
  }

  public void removeProduct(Product product) {
    onlineShop.remove(product);
  }

  public void getProduct(int productID) {
    for (Map.Entry<Product, Integer> entry : onlineShop.entrySet()) {
      if (entry.getKey().getProductID() == productID) {
        // System.out.println("Onlineshop2: " + onlineShop);
        System.out.println("--------------------------");
        System.out.println(" Produktname: " + entry.getKey().getProductName() + "\n" + " Produktpreis (Euro): "
            + entry.getKey().getPricePerUnit() + "\n Verfügbar: " + entry.getValue());
        System.out.println("--------------------------");
      }
    }
  }

  public void processOrder(ShoppingCart cart) {
    System.out.println("------------Bestellung entgegengenommen. Total Price: --------------");
    // System.out.println("------------Total Price (Euro):--------------");
    cart.getTotalPrice();
    System.out.println("-------------------------------------");
  }
}
