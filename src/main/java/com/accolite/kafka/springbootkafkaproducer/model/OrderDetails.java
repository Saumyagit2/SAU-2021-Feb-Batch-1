package com.accolite.kafka.springbootkafkaproducer.model;

public class OrderDetails {


    private String userName;
    private String foodItem;
    private int quanity;
    private int price;


    public OrderDetails(String userName, String foodItem, int quanity, int price) {
        this.userName = userName;
        this.foodItem = foodItem;
        this.quanity = quanity;
        this.price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}