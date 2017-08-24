package com.company;
import java.util.HashMap;

public class Shop {


    HashMap<String, Item> itemList;


    public void setItemList(HashMap<String, Item> itemList) {
        this.itemList = itemList;
    }

    public HashMap<String, Item> getItemList() {
        return this.itemList;
    }


    public void listItembyCategory(String Category){

    }

    public void addnewItem(Item item){

    }


    public void changeExistingItem (String ItemName){

    }


    public void generateReceipt(HashMap<String, Double> purchaseList) {

        Double sum = new Double(0);
        String format = "%-30s";

        System.out.println(String.format(format,"Item") + String.format(format,"Quantity") + String.format(format,"Amount"));
        System.out.println();

        for (String items : purchaseList.keySet()) {

            System.out.println(String.format(format,items) + String.format(format,purchaseList.get(items)) + String.format(format,purchaseList.get(items)*itemList.get(items).getPrice()));
            sum += (itemList.get(items)).getPrice() * purchaseList.get(items);

        }


        System.out.println();
        System.out.println(String.format(format,"Net Amount:")+ String.format(format,sum));

    }
}
