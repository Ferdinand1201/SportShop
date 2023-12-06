package com.example.sportshop.Model;

public class SportClothItem extends ProductItem {
    private String size;

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    private String material;

    private String type;

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    private String color;

    public SportClothItem(String img, String description, String name, String price, String color, String size, String type, String material) {
        super(img, description, name, price);
        this.color = color;
        this.size = size;
        this.type = type;
        this.material = material;

    }
}
