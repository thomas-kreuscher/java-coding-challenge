package com.example.OnlineShopSystem;

import java.util.HashMap;
import java.util.Map;

class Product {
    private int productID;
    private String productName;
    private double pricePerUnit;
    private int availableStock;

    public Product(int productID, String productName, double pricePerUnit, int availableStock) {
        this.productID = productID;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.availableStock = availableStock;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void reduceStock(int quantity) {
        if (quantity > 0 && quantity <= availableStock) {
            availableStock -= quantity;
        }
    }
}

class ShoppingCart {
    private Map<Integer, Integer> cartItems; // Produkt-ID zu Menge

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public void addItem(int productID, int quantity) {
        cartItems.put(productID, cartItems.getOrDefault(productID, 0) + quantity);
    }

    public void removeItem(int productID) {
        cartItems.remove(productID);
    }

    public void displayCart() {
        System.out.println("Warenkorb:");
        for (Map.Entry<Integer, Integer> entry : cartItems.entrySet()) {
            int productID = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Produkt-ID: " + productID + ", Menge: " + quantity);
        }
    }

    public double calculateTotalPrice(Map<Integer, Product> products) {
        double totalPrice = 0;
        for (Map.Entry<Integer, Integer> entry : cartItems.entrySet()) {
            int productID = entry.getKey();
            int quantity = entry.getValue();
            Product product = products.get(productID);
            if (product != null) {
                totalPrice += product.getPricePerUnit() * quantity;
            }
        }
        return totalPrice;
    }
}

class OnlineShop {
    private Map<Integer, Product> products; // Produkt-ID zu Produkt

    public OnlineShop() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductID(), product);
    }

    public void removeProduct(int productID) {
        products.remove(productID);
    }

    public Product getProduct(int productID) {
        return products.get(productID);
    }

    public void processOrder(ShoppingCart cart) {
        for (Map.Entry<Integer, Integer> entry : cart.getItems().entrySet()) {
            int productID = entry.getKey();
            int quantity = entry.getValue();
            Product product = products.get(productID);
            if (product != null) {
                if (quantity <= product.getAvailableStock()) {
                    product.reduceStock(quantity);
                } else {
                    System.out.println("Nicht genug Lagerbestand für Produkt-ID: " + productID);
                    return;
                }
            } else {
                System.out.println("Produkt nicht gefunden für Produkt-ID: " + productID);
                return;
            }
        }
        double totalPrice = cart.calculateTotalPrice(products);
        System.out.println("Bestellung erfolgreich abgeschlossen. Gesamtpreis: " + totalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();

        Product product1 = new Product(1, "Produkt 1", 10.0, 5);
        Product product2 = new Product(2, "Produkt 2", 20.0, 3);

        shop.addProduct(product1);
        shop.addProduct(product2);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(1, 2);
        cart.addItem(2, 1);

        System.out.println("Warenkorb vor Bestellung:");
        cart.displayCart();

        shop.processOrder(cart);

        System.out.println("Verbleibender Lagerbestand:");
        for (Product product : shop.getProducts().values()) {
            System.out.println("Produkt-ID: " + product.getProductID() + ", Name: " + product.getProductName()
                    + ", Verbleibender Lagerbestand: " + product.getAvailableStock());
        }
    }
}

