package com.example.sportshop.Model;

public class ProductItem {

    private String img;
    private String description;
    private String name;
    private String price;



    public ProductItem(String img, String description, String name, String price) {
        this.img = img;
        this.description = description;
        this.name = name;
        this.price = price;

    }

    public String getImg() {
        return img;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
