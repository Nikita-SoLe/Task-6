package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String color;
    private int series;
    private static final List<Car> listCar = new ArrayList<>();

    static {
        listCar.add(new Car("Mercedes", "black", 650));
        listCar.add(new Car("BMW", "white", 720));
        listCar.add(new Car("Reno", "grey", 1320));
        listCar.add(new Car("Peugeot", "yellow", 320));
        listCar.add(new Car("Lada", "redCherry", 2109));
    }

    public Car() {
    }

    public Car(String brand, String color, int series) {
        this.brand = brand;
        this.color = color;
        this.series = series;
    }

    public static List<Car> getListCar() {
        return listCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
