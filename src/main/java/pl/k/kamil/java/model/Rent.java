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

    @Column(name = "real_return_date")
    private LocalDateTime realReturnDate;

    @Column(name = "prise")
    private BigDecimal price;

    @Column(name = "additional_cost")
    private BigDecimal additionalCost;

    @Enumerated(EnumType.STRING)
    @Column(name = "rent_status")
    private RentStatus rentStatus;



    @ManyToOne(targetEntity = Car.class)
    private Car car;

    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;

    public Rent() {
    }

    public Rent(LocalDateTime rent_date, LocalDateTime return_date, LocalDateTime realReturnDate, BigDecimal price, BigDecimal additionalCost, RentStatus rentStatus, Car car, Customer customer) {
        this.rent_date = rent_date;
        this.return_date = return_date;
        this.realReturnDate = realReturnDate;
        this.price = price;
        this.additionalCost = additionalCost;
        this.rentStatus = rentStatus;
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

    public LocalDateTime getRealReturnDate() {
        return realReturnDate;
    }

    public void setRealReturnDate(LocalDateTime realReturnDate) {
        this.realReturnDate = realReturnDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAdditionalCost() {
        return additionalCost;
    }

    public void setAdditionalCost(BigDecimal additionalCost) {
        this.additionalCost = additionalCost;
    }

    public RentStatus getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(RentStatus rentStatus) {
        this.rentStatus = rentStatus;
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
                Objects.equals(realReturnDate, rent.realReturnDate) &&
                Objects.equals(price, rent.price) &&
                Objects.equals(additionalCost, rent.additionalCost) &&
                rentStatus == rent.rentStatus &&
                Objects.equals(car, rent.car) &&
                Objects.equals(customer, rent.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentId, rent_date, return_date, realReturnDate, price, additionalCost, rentStatus, car, customer);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentId=" + rentId +
                ", rent_date=" + rent_date +
                ", return_date=" + return_date +
                ", realReturnDate=" + realReturnDate +
                ", price=" + price +
                ", additionalCost=" + additionalCost +
                ", rentStatus=" + rentStatus +
                ", car=" + car +
                ", customer=" + customer +
                '}';
    }
}
