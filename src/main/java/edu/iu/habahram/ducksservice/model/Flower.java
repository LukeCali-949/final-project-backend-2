package edu.iu.habahram.ducksservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(schema = "flowers", name="flowers")
public final class Flower {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String flowerType;
    private String occasion;
    private String color;
    private int price;

    public Flower() {
    }

    public Flower(int id, String name, String flowerType, String occasion, String color, Integer price, String imageURL) {
        this.id = id;
        this.name = name;
        this.flowerType = flowerType;
        this.occasion = occasion;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(String flowerType) {
        this.flowerType = flowerType;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
