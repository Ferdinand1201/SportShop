package com.example.sportshop.Model;

public class SportInventoryItem extends ProductItem {
    private String type;
    private String weight;

    private String material;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public SportInventoryItem( String img, String description, String name, String price, String type, String weight, String material) {
        super( img, description, name, price);
        this.type = type;
        this.weight = weight;
        this.material = material;
    }
}
