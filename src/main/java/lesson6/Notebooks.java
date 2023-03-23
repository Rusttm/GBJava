package lesson6;

import java.util.HashSet;
import java.util.Objects;

public class Notebooks {

    private String name;
    private String brand;
    private String color;
    private double weight = 2.45;//deprecated
    private double diag = 14.5; //deprecated
    private String memory;
    private int stock = 0;//deprecated


    public Notebooks(String noteName, String noteBrand, String noteColor, String noteMemory) {
        this.name = noteName;
        this.brand = noteBrand;
        this.color = noteColor;
        this.memory = noteMemory;
//        System.out.println("Создан ноутбук " + this.name  + this.brand);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public HashSet<String> GetFilters() {
        HashSet<String> propKeys = new HashSet<>();
        propKeys.add("name");
        propKeys.add("brand");
        propKeys.add("color");
        propKeys.add("memory");
        return propKeys;
    }

    public boolean IsApplyFilter(String filterKey, String filterValue) {
//        System.out.println(filterKey + filterValue);
        if (Objects.equals(filterKey, "name")) {
            return Objects.equals(filterValue, this.name);
        } else if (Objects.equals(filterKey, "brand")) {
            return Objects.equals(filterValue, this.brand);
        } else if (Objects.equals(filterKey, "color")) {
            return Objects.equals(filterValue, this.color);
        } else if (Objects.equals(filterKey, "memory")) {
            return Objects.equals(filterValue, this.memory);
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Notebooks{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", diag=" + diag +
                ", memory='" + memory + '\'' +
                ", stock=" + stock +
                '}';
    }

    public String GetInfo() {
        return name;
    }

    public void BuyNote() {
        stock += 1;
    }

    public void SellNote() {
        if (stock>0) {
            stock -= 1;
        }
        else {
            System.out.println("Нет на складе!");
        }

    }
}
