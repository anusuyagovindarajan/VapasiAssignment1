package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FruitShop cashier = new FruitShop();

        HashMap<String,Fruit> fruitList = new HashMap<>();

        fruitList.put("Apple",  new Apple("Apple" , 100 , "red"));
        fruitList.put("Kiwi", new Kiwi("Kiwi", 120,"brown&green"));
        fruitList.put("Orange", new Orange("Orange", 80, "orange"));
        fruitList.put("Banana",new Banana("Banana", 30,"yellow"));

        cashier.setFruitList(fruitList);

        Buyer buyer = new Buyer();

        buyer.setName("Anu");

        HashMap<String, Double> purchaseList = new HashMap<>();

        purchaseList.put("Apple", 2.0);
        purchaseList.put("Orange", 1.5);
        purchaseList.put("Banana", 0.5 );
        purchaseList.put("Kiwi", 0.75);

        buyer.setPurchaseList(purchaseList);

        cashier.generateReceipt(buyer.getPurchaseList());

    }
}
