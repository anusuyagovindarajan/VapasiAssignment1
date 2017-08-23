package com.company;

import java.util.HashMap;

public class Buyer {

    public void setName(String name) {
        Name = name;
    }

    String Name;
    HashMap<String,Double> purchaseList;

    public void setPurchaseList(HashMap<String, Double> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public HashMap<String, Double> getPurchaseList() {
        return purchaseList;
    }

    public String getName() {
        return Name;
    }

}
