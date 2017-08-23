package com.company;
import java.util.HashMap;

public class FruitShop {

    HashMap<String, Fruit> fruitList;

    public void setFruitList(HashMap<String, Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    public HashMap<String, Fruit> getFruitList() {
        return fruitList;
    }

    public void generateReceipt(HashMap<String, Double> purchaseList) {

        Double sum = new Double(0);
        String format = "%-30s";

        System.out.println(String.format(format,"Fruit") + String.format(format,"Quantity") + String.format(format,"Amount"));
        System.out.println();

        for (String fruits : purchaseList.keySet()) {

            System.out.println(String.format(format,fruits) + String.format(format,purchaseList.get(fruits)) + String.format(format,purchaseList.get(fruits)*fruitList.get(fruits).getPrice()));
            sum += (fruitList.get(fruits)).getPrice() * purchaseList.get(fruits);

        }


        System.out.println();
        System.out.println(String.format(format,"Net Amount:")+ String.format(format,sum));

    }
}
