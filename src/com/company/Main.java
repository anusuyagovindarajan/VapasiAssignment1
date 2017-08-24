package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shop shopKeeper = new Shop();

        HashMap<String,Item> itemList = new HashMap<>();

        itemList.put("Apple",  new Item("Apple" , "FRUIT" , 100));
        itemList.put("Kiwi", new Item("Kiwi", "FRUIT",120));
        itemList.put("Orange", new Item("Orange", "FRUIT", 80));
        itemList.put("Banana",new Item("Banana", "FRUIT",30));

        shopKeeper.setItemList(itemList);

        Buyer buyer = new Buyer();

        buyer.setName("Anu");

        HashMap<String, Double> purchaseList = new HashMap<>();

        purchaseList.put("Apple", 2.0);
        purchaseList.put("Orange", 1.5);
        purchaseList.put("Banana", 0.5 );
        purchaseList.put("Kiwi", 0.75);

        buyer.setPurchaseList(purchaseList);

        shopKeeper.generateReceipt(buyer.getPurchaseList());

    }
}
