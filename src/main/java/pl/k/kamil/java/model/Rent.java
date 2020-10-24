package pl.k.kamil.java.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;


import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "rent")
public class Rent {


    @Id
    @Column(name = "rent_id")
    @GeneratedValue(generator = "donationSeq")
    @GenericGenerator(name = "donationSeq", strategy = "increment")
    private int rentId;

    @Column(name = "rent_date")
    private LocalDateTime rent_date;

    @Column(name = "return_date")
    private LocalDateTime return_date;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "additional_cost")
    private BigDecimal additionalCost;

    @ManyToOne(targetEntity = Car.class)
    private Car car;

    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;

    public Rent() {
    }

    public Rent(LocalDateTime rent_date, LocalDateTime return_date, BigDecimal total, BigDecimal additionalCost, Car car, Customer customer) {
        this.rent_date = rent_date;
        this.return_date = return_date;
        this.total = total;
        this.additionalCost = additionalCost;
        this.car = car;
        this.customer = customer;
    }


    public int getRentId() {
        return rentId;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }

    public LocalDateTime getRent_date() {
        return rent_date;
    }

    public void setRent_date(LocalDateTime rent_date) {
        this.rent_date = rent_date;
    }

    public LocalDateTime getReturn_date() {
        return return_date;
    }

    public void setReturn_date(LocalDateTime return_date) {
        this.return_date = return_date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getAdditionalCost() {
        return additionalCost;
    }

    public void setAdditionalCost(BigDecimal additionalCost) {
        this.additionalCost = additionalCost;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return rentId == rent.rentId &&
                Objects.equals(rent_date, rent.rent_date) &&
                Objects.equals(return_date, rent.return_date) &&
                Objects.equals(total, rent.total) &&
                Objects.equals(additionalCost, rent.additionalCost) &&
                Objects.equals(car, rent.car) &&
                Objects.equals(customer, rent.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentId, rent_date, return_date, total, additionalCost, car, customer);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentId=" + rentId +
                ", rent_date=" + rent_date +
                ", return_date=" + return_date +
                ", total=" + total +
                ", additionalCost=" + additionalCost +
                ", car=" + car +
                ", customer=" + customer +
                '}';
    }

}
