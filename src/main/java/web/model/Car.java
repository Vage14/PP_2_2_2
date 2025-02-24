package web.model;


public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;

    public Car(int id, String brand, String color, String model) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
