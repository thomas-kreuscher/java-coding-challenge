package com.example.OnlineShopSystem;


/* 
Produkt-ID (eine eindeutige Ganzzahl)
Produktname (eine Zeichenkette mit dem Namen des Produkts)
Preis pro Einheit (eine Dezimalzahl)
Verfügbarer Lagerbestand (eine Ganzzahl)

getProductID(): Diese Methode sollte die Produkt-ID zurückgeben.
getProductName(): Diese Methode sollte den Produktnamen zurückgeben.
getPricePerUnit(): Diese Methode sollte den Preis pro Einheit zurückgeben.
getAvailableStock(): Diese Methode sollte den verfügbaren Lagerbestand
zurückgeben.
reduceStock(int quantity): Diese Methode sollte den Lagerbestand um
die angegebene Menge reduzieren. 
*/


public class Product {

  private static int productIDCounter = 1000;


  private int productID;
  private String productName;
  private double pricePerUnit;
  private int stock;

  public Product(String productName, double pricePerUnit, int stock) {
    this.productID = createProductID();
    this.stock = stock;
    this.productName = productName;
    this.pricePerUnit = pricePerUnit;
  }


  public int createProductID() {
    return ++productIDCounter;
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
    return stock;
  }


  public void reduceStock(int quantity) {
    stock -= quantity;
  }
  
}

