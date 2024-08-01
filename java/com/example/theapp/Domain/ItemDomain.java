package com.example.theapp.Domain;

import java.io.Serializable;

public class ItemDomain implements Serializable {
    private String Title;
    private  String ImagePath;
    private  String Description;
    private  double Price;
    private  double star;
    private int Id;
    private int CategoryId;
    private int LocationId;

    public ItemDomain() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public float getStar() {
        return (float) star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public int getLocationId() {
        return LocationId;
    }

    public void setLocationId(int locationId) {
        LocationId = locationId;
    }
}
