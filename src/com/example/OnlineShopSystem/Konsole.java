package com.example.OnlineShopSystem;

/* Konsolenanwendung, die den Online-Shop und den
Einkaufswagen verwaltet. Der Benutzer sollte in der Lage sein, Produkte hinzuzufügen, zu
entfernen, den Warenkorb anzuzeigen und Bestellungen aufzugeben.

Stellen Sie sicher, dass ungültige Aktionen oder falsche Produkt-IDs abgefangen und
entsprechende Fehlermeldungen ausgegeben werden. */

public class Konsole {

  public static void main(String[] args) {

    Product product1 = new Product("Apfel", 2.68, 27);
    Product product2 = new Product("Birne", 4.03, 67);
    Product product3 = new Product("Banane", 3.56, 338);

    OnlineShop onlineShop = new OnlineShop();

    onlineShop.addProduct(product1);
    onlineShop.addProduct(product2);
    onlineShop.addProduct(product3);
    onlineShop.addProduct(product2);
    onlineShop.getProduct(1002);


    ShoppingCart shoppingCart = new ShoppingCart();

    shoppingCart.addProductToCart(product1, 5);
    shoppingCart.addProductToCart(product2, 48);

    shoppingCart.displayCart();

    System.out.println(product1.getAvailableStock());   
    System.out.println(product2.getAvailableStock());    


    onlineShop.processOrder(shoppingCart);

    System.out.println(product1.getAvailableStock());   
    System.out.println(product2.getAvailableStock());    
    
    
    // shoppingCart.displayCart();
    // shoppingCart.getTotalPrice();
    
  }
  
}
