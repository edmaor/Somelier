package edu.maor.somelier.somelier_ii.model;

public class Wine {
    protected String name;
    protected String color;
    protected String imagePath;

    public Wine(String name, String brand, String imagePath) {
        this.name = name;
        this.color = brand;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String color) {
        this.name = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
