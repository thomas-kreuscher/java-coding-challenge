package com.example.OnlineShopSystem;

import java.util.HashMap;
import java.util.Map;

/*  
Hinzufügen von Produkten zum Warenkorb.
Entfernen von Produkten aus dem Warenkorb.
Anzeigen des aktuellen Warenkorbs.
Berechnen des Gesamtpreises der Produkte im Warenkorb 
*/

public class ShoppingCart {

  private Map<Product, Integer> warenKorb;

  public ShoppingCart() {
    warenKorb = new HashMap<>();
  }

  public void addProductToCart(Product product, int anzahl) {
    warenKorb.put(product, anzahl);
  }

  public void removeProductFromCart(Product product, int anzahl) {
    warenKorb.remove(product, anzahl);
  }

  public void displayCart() {

    System.out.println("Zeige Warenkorb: ");
    for (Map.Entry<Product,Integer> entry : warenKorb.entrySet()) {
      System.out.println("Artikel: " + entry.getKey().getProductName() + " Menge: " + entry.getValue());
    }
  }

  public void getTotalPrice() {
    double totalPrice = 0;
    for (Map.Entry<Product,Integer> entry : warenKorb.entrySet()) {
      Product product = entry.getKey();
      int quantity = entry.getValue();
      totalPrice += product.getPricePerUnit() * quantity;
      product.reduceStock(quantity);
    }
    System.out.println(totalPrice); 
    System.out.println();  
  }
  
}


