package com.example;

public class product {
    private String name
    private Double price
    private Integer quantity
    private String color
    private Integer weigth

            public Product(

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public Integer getWeigth() {
        return weigth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeigth(Integer weigth) {
        this.weigth = weigth;
    }
//tostring

    @Override
    public String toString() {
        return "product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}

