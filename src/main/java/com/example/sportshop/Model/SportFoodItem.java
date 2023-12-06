package com.example.sportshop.Model;

public class SportFoodItem extends ProductItem {
    private String weight;

    private String type;

    private String compound;

    private String protFatCarbs;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getCompound() {
        return compound;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

    public String getProtFatCarbs() {
        return protFatCarbs;
    }

    public void setProtFatCarbs(String protFatCarbs) {
        this.protFatCarbs = protFatCarbs;
    }

    public SportFoodItem(String img, String description, String name, String price, String type, String weight, String compound, String protFatCarbs) {
        super(img, description, name, price);
        this.type = type;
        this.weight = weight;
        this.compound = compound;
        this.protFatCarbs = protFatCarbs;
    }
}
