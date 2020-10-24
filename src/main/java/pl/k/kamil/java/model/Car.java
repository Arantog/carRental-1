package pl.k.kamil.java.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Objects;

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

    @Column (name = "condition")
    private boolean condition;

    public Car() {
    }

    public Car(String regNumber, String mark, String model, String color, boolean condition) {
        this.regNumber = regNumber;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.condition = condition;
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

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return condition == car.condition &&
                Objects.equals(regNumber, car.regNumber) &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, mark, model, color, condition);
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", condition=" + condition +
                '}';
    }


}
