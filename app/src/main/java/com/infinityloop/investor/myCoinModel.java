package com.infinityloop.investor;

public class myCoinModel {
    String url, name;
    double apy, amount;

    public myCoinModel(String url,String name, Float apy, Float amount)
    {
        this.url = url;
        this.name = name;
        this.apy = apy;
        this.amount = amount;
    }

    public myCoinModel() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getApy() {
        return apy;
    }

    public void setApy(double apy) {
        this.apy = apy;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
