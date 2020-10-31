package pl.k.kamil.java.model;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;


@Entity
@Table(name = "car")
public class Car {


    @Id
    @Column (name = "reg_number")
    private String regNumber;

    @Column (name = "mark")
    private String mark;

    @Column (name = "model")
    private String model;

    @Column (name = "color")
    private String color;

    @Column (name = "price")
    private BigDecimal price;

    @Column (name = "free")
    private String free;


    public Car() {
    }

    public Car(String regNumber, String mark, String model, String color, BigDecimal price, String free) {
        this.regNumber = regNumber;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.price = price;
        this.free = free;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(regNumber, car.regNumber) &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color) &&
                Objects.equals(price, car.price) &&
                Objects.equals(free, car.free);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, mark, model, color, price, free);
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", free='" + free + '\'' +
                '}';
    }
}
